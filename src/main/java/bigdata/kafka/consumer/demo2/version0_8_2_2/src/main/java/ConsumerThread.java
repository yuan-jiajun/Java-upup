/**
 * @author Yuan Jiajun
 * @date 2020/10/19 11:24
 * @description @link
 */

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

public class ConsumerThread implements Runnable {

    private final int threadSerial;
    private final KafkaStream<byte[], byte[]> stream;

    public ConsumerThread(KafkaStream<byte[], byte[]> stream, int threadSerial) {
        this.threadSerial = threadSerial;
        this.stream = stream;
    }

/*    public void run() {
        ConsumerIterator<byte[], byte[]> iter = this.stream.iterator();
        String fileName = threadSerial + ".data";
        System.out.println("Start Thread: " + this.threadSerial);
        int cnt = 0;
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
            while (iter.hasNext()) {
                byte[] bytes = iter.next().message();
                out.writeInt(bytes.length);
                out.write(bytes);
                out.flush();
                cnt++;
            }
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Total write: " + cnt);
        System.out.println("Shutting down Thread: " + this.threadSerial);
    }*/


    public void run() {
        ConsumerIterator<byte[], byte[]> iter = this.stream.iterator();
        System.out.println("Start Thread: " + this.threadSerial);

        while (iter.hasNext()) {
            ByteBuffer s = ByteBuffer.wrap(iter.next().message());
            System.out.println(s.getInt());
        }
        System.out.println("Shutting down Thread: " + this.threadSerial);
    }
}