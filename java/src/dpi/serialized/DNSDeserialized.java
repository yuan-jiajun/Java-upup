package dpi.serialized;


import org.json.JSONObject;
import tech.allegro.schema.json2avro.converter.JsonAvroConverter;


public class DNSDeserialized {

    public static void main(String[] args) {
        String body = "{\n" +
                "  \"AdditionalRecords\": [\n" +
                "    {\n" +
                "      \"DataLength\": 2312,\n" +
                "      \"DnsClass\": 1,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"NameOrAddress\": \"10.2.5.1\",\n" +
                "      \"TimeToLive\": 2312,\n" +
                "      \"Type\": 123\n" +
                "    },\n" +
                "    {\n" +
                "      \"DataLength\": 2312,\n" +
                "      \"DnsClass\": 1,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"NameOrAddress\": \"10.2.5.1\",\n" +
                "      \"TimeToLive\": 2312,\n" +
                "      \"Type\": 123\n" +
                "    }\n" +
                "  ],\n" +
                "  \"Time\":1586757749992,\n" +
                "  \"ArriveTime\": \"2020-05-20 05:20:00\",\n" +
                "  \"AuthNameServers\": [\n" +
                "    {\n" +
                "      \"DataLength\": 2312,\n" +
                "      \"DnsClass\": 1,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"NameOrAddress\": \"10.2.5.1\",\n" +
                "      \"TimeToLive\": 2312,\n" +
                "      \"Type\": 123\n" +
                "    },\n" +
                "    {\n" +
                "      \"DataLength\": 2312,\n" +
                "      \"DnsClass\": 1,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"NameOrAddress\": \"10.2.5.1\",\n" +
                "      \"TimeToLive\": 2312,\n" +
                "      \"Type\": 123\n" +
                "    }\n" +
                "  ],\n" +
                "  \"DnsHead\": [\n" +
                "    {\n" +
                "      \"AAFlag1\": true,\n" +
                "      \"AdditionalCount\": 4,\n" +
                "      \"AnswerCount\": 2,\n" +
                "      \"AuthorityCount\": 1,\n" +
                "      \"DomainName\": \"www.scu.edu.cn\",\n" +
                "      \"OpCodeFlag1\": 1,\n" +
                "      \"OrFlag1\": true,\n" +
                "      \"QuestionCount\": 1,\n" +
                "      \"RAFlag1\": true,\n" +
                "      \"RDFlag1\": true,\n" +
                "      \"RCode\": 234,\n" +
                "      \"TCFlag1\": false,\n" +
                "      \"TransactionID\": 2345,\n" +
                "      \"ZFlag\": 2345\n" +
                "    }\n" +
                "  ],\n" +
                "  \"DNSRequest\": [\n" +
                "    {\n" +
                "      \"DnsClass\": 2,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"Type\": 2324\n" +
                "    },\n" +
                "    {\n" +
                "      \"DnsClass\": 2,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"Type\": 2324\n" +
                "    }\n" +
                "  ],\n" +
                "  \"DnsResponses\": [\n" +
                "    {\n" +
                "      \"DataLength\": 2312,\n" +
                "      \"DnsClass\": 1,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"NameOrAddress\": \"10.2.5.1\",\n" +
                "      \"TimeToLive\": 2312,\n" +
                "      \"Type\": 123\n" +
                "    },\n" +
                "    {\n" +
                "      \"DataLength\": 2312,\n" +
                "      \"DnsClass\": 1,\n" +
                "      \"Name\": \"www.scu.edu.cn\",\n" +
                "      \"NameOrAddress\": \"10.2.5.1\",\n" +
                "      \"TimeToLive\": 2312,\n" +
                "      \"Type\": 123\n" +
                "    }\n" +
                "  ],\n" +
                "  \"DstIP\": \"192.168.1.10\",\n" +
                "  \"DstPort\": 4568,\n" +
                "  \"PacketCount\": 1215,\n" +
                "  \"SrcIP\": \"195.225.3.4\",\n" +
                "  \"SrcPort\": 80\n" +
                "}";

        JSONObject dnsJson = new JSONObject(body);

//        System.out.println(dnsJson.toString());

        JsonAvroConverter converter = new JsonAvroConverter();
//
        byte[] avro = converter.convertToAvro(dnsJson.toString().getBytes(), DNSSchema.DPI_DNS_SCHEMA_ZZ);

    }
}
