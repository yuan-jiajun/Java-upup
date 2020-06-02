package dpi.serialized;


import org.json.JSONObject;
import tech.allegro.schema.json2avro.converter.JsonAvroConverter;


public class HTTPDeserialized {

    public static void main(String[] args) {
        String body = "{\"Cookie\":\"null\",\"ResponseContentLength\":\"105\",\"EntityBody\":\"null\",\"SrcPort\":1337,\"ServerVersion\":\"HTTP/1.1\",\"ResponseDate\":\"null\",\"ContentType\":\"null\",\"RequestSequence\":0,\"RequestHost\":\"null\",\"RequestUrl\":\"null\",\"Referer\":\"null\",\"Time\":1586757734878,\"DstPort\":54081,\"Method\":\"null\",\"SrcIP\":\"93.158.213.92\",\"StatusLine\":\"null\",\"ResponseFile\":\"null\",\"ResponseStatusCode\":\"null\",\"FirstPacketArrive\":\"null\",\"DstIP\":\"219.138.12.146\",\"UserAgent\":\"null\",\"LastPacketArrive\":\"null\",\"HttpContent\":\"null\"}";

        JSONObject httpJson = new JSONObject(body);

//        System.out.println(httpJson.toString());

        JsonAvroConverter converter = new JsonAvroConverter();

        byte[] avro = converter.convertToAvro(httpJson.toString().getBytes(), HTTPSchema.DPI_HTTP_SCHEMA_ZZ);
//        byte[] avro = converter.convertToAvro(httpJson.toString().getBytes(), DNSSchema.DPI_DNS_SCHEMA_ZZ);

        System.out.println(new String(avro));

    }
}
