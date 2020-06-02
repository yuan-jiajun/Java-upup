package dpi.serialized;


import org.json.JSONObject;
import tech.allegro.schema.json2avro.converter.JsonAvroConverter;


public class DNSDeserialized {

    public static void main(String[] args) {
        //自己解析的
//        String body = "{\"ArriveTime\":\"1586757749992\",\"DNSRequest\":[{\"Type\":0,\"DnsClass\":0,\"Name\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"Name\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"Name\":\"null\"}],\"DNSResponses\":[{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"}],\"SrcPort\":53,\"DstIP\":\"50.4.59.93\",\"AuthNameServers\":[{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"},{\"Type\":0,\"DnsClass\":0,\"TimeToLive\":0,\"DataLength\":0,\"Name\":\"null\",\"NameOrAddress\":\"null\"}],\"Time\":1586757749992,\"DstPort\":64504,\"PacketCount\":0,\"SrcIP\":\"218.75.255.91\",\"additionalRecords\":[]}\n";



//师姐给的
//        String body = "{\"AdditionalRecords\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"ArriveTime\":\"2020-05-20 05:20:00\",\"AuthNameServers\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"DnsHead\":[{\"AAFlag\":true,\"AdditionalCount\":4,\"AnswerCount\":2,\"AuthorityCount\":1,\"DomainName\":\"www.scu.edu.cn\",\"OpCodeFlag\":1,\"OrFlag\":true,\"QuestionCount\":1,\"RAFlag\":true,\"RDFlag\":true,\"RCode\":234,\"TCFlag\":false,\"TransactionID\":2345,\"ZFlag\":2345}],\"DNSRequest\":[{\"DnsClass\":2,\"Name\":\"www.scu.edu.cn\",\"Type\":2324},{\"DnsClass\":2,\"Name\":\"www.scu.edu.cn\",\"Type\":2324}],\"DnsResponses\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"DstIP\":\"192.168.1.10\",\"DstPort\":4568,\"PacketCount\":1215,\"SrcIP\":\"195.225.3.4\",\"SrcPort\":80}";
//        String body = "{\"AdditionalRecords\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"ArriveTime\":\"2020-05-20 05:20:00\",\"AuthNameServers\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"DnsHead\":[{\"AAFlag1\":true,\"AdditionalCount\":4,\"AnswerCount\":2,\"AuthorityCount\":1,\"DomainName\":\"www.scu.edu.cn\",\"OpCodeFlag\":1,\"OrFlag\":true,\"QuestionCount\":1,\"RAFlag\":true,\"RDFlag1\":true,\"RCode1\":234,\"TCFlag1\":false,\"TransactionID\":2345,\"ZFlag\":2345}],\"DNSRequest\":[{\"DnsClass\":2,\"Name\":\"www.scu.edu.cn\",\"Type\":2324},{\"DnsClass\":2,\"Name\":\"www.scu.edu.cn\",\"Type\":2324}],\"DnsResponses\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"DstIP\":\"192.168.1.10\",\"DstPort\":4568,\"PacketCount\":1215,\"SrcIP\":\"195.225.3.4\",\"SrcPort\":80}";

        String body = "{\"Time\":1586757749992,\"ArriveTime\":\"2020-05-20 05:20:00\",\"SrcIP\":\"195.225.3.4\",\"DstIP\":\"192.168.1.10\",\"SrcPort\":80,\"DstPort\":4568,\"PacketCount\":1215,\"DNSHead\":[{\"TransactionID\":2345,\"DomainName\":\"www.scu.edu.cn\",\"ZFlag\":2345,\"QuestionCount\":1,\"AnswerCount\":2,\"AuthorityCount\":1,\"AdditionalCount\":4,\"OrFlag\":true,\"OpCodeFlag\":1,\"AAFlag\":true,\"TCFlag\":false,\"RDFlag\":true,\"RAFlag\":true,\"RCode\":234}],\"DNSRequest\":[{\"DnsClass\":2,\"Name\":\"www.scu.edu.cn\",\"Type\":2324},{\"DnsClass\":2,\"Name\":\"www.scu.edu.cn\",\"Type\":2324}],\"DNSResponses\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"AuthNameServers\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}],\"additionalRecords\":[{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123},{\"DataLength\":2312,\"DnsClass\":1,\"Name\":\"www.scu.edu.cn\",\"NameOrAddress\":\"10.2.5.1\",\"TimeToLive\":2312,\"Type\":123}]}";


        JSONObject dnsJson = new JSONObject(body);

        System.out.println(dnsJson.toString());

        JsonAvroConverter converter = new JsonAvroConverter();

        byte[] avro = converter.convertToAvro(dnsJson.toString().getBytes(), DNSSchema.DPI_DNS_SCHEMA_ZZ);
//        byte[] avro = converter.convertToAvro(dnsJson.toString().getBytes(), DNSHeadArraySchema.DPI_DNS_SCHEMA_ZZ);
//        byte[] avro = converter.convertToAvro(dnsJson.toString().getBytes(), DNSHeadRecordSchema.RECORD_OUTTER);
//        byte[] avro = converter.convertToAvro(dnsJson.toString().getBytes(), DNSHeadRecordSchema.RECORD_INNER);
//        byte[] avro = converter.convertToAvro(dnsJson.toString().getBytes(), DNSHeadRecordSchema.RECORD);

    }
}
