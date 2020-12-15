/**
 * @author Yuan Jiajun
 * @date 2020/10/19 11:24
 * @description @link
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

//import org.iker.example.kafka.producer.ProducerApp;

/**
 * Simple Kafka message consumer
 */
public class ConsumerApp {

    private final ConsumerConfig config;
    private final ConsumerConnector consumer;
    private ExecutorService executor;
//    private static String KAFKA_TOPIC = "server_packet";
    private static String KAFKA_TOPIC = "yuanjiajun-test";

    public ConsumerApp(String zooKeeper, String groupId) {

        Properties props = new Properties();
        props.put("zookeeper.connect", zooKeeper);
        props.put("group.id", groupId);
        props.put("zookeeper.session.timeout.ms", "400");
        props.put("zookeeper.sync.time.ms", "200");
        props.put("auto.commit.interval.ms", "1000");

        this.config = new ConsumerConfig(props);
        this.consumer = Consumer.createJavaConsumerConnector(this.config);
    }

    public void shutdown() {
        if (this.consumer != null) {
            this.consumer.shutdown();
        }
        if (this.executor != null) {
            executor.shutdown();
        }

        try {
            if (!this.executor.awaitTermination(5000, TimeUnit.MILLISECONDS)) {
                System.out.println("Timed out waiting for consumer threads to shut down, exiting uncleanly.");
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted during shutdown, exiting uncleanly.");
        }
    }

    public void run(int numThreads) {
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(ConsumerApp.KAFKA_TOPIC, new Integer(numThreads));

        Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = this.consumer.createMessageStreams(topicCountMap);
        List<KafkaStream<byte[], byte[]>> streams = consumerMap.get(ConsumerApp.KAFKA_TOPIC);

        // now launch all the threads
        //
        this.executor = Executors.newFixedThreadPool(numThreads);

        // now create an object to consume the messages
        //
        int threadNumber = 0;
        for (final KafkaStream<byte[], byte[]> stream : streams) {
            this.executor.submit(new ConsumerThread(stream, threadNumber));
            threadNumber++;
        }
    }

    public static void main(String[] args) {

//        String zooKeeper = args[0];
//        String groupId = args[1];
        String zooKeeper = "10.0.3.12:2181";
        String groupId = "yuanjiajun-test1";
        //int threads = Integer.parseInt(args[2]);
        int threads = 1;

        ConsumerApp app = new ConsumerApp(zooKeeper, groupId);
        app.run(threads);
        try {
            while (true) {
                Thread.sleep(10000L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        app.shutdown();
    }
}