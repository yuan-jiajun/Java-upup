package projects.dpi.serialized;

public class HTTPSchema {
    public static final String DPI_HTTP_SCHEMA_ZZ = "{\n" +
            "\"type\":\"record\",\n" +
            "\"name\":\"HttpSession\",\n" +
            "\"namespace\":\"avro\",\n" +
            "\"fields\":[\n" +
            "{\"name\":\"Time\", \"type\":[ \"long\", \"null\"]},\n" +
            "{\"name\":\"SrcIP\", \"type\":[ \"string\", \"null\"]},\n" +
            "{\"name\":\"DstIP\", \"type\":[ \"string\", \"null\"]},\n" +
            "{\"name\":\"SrcPort\",\"type\":[\"int\",\"null\"]},\n" +
            "{\"name\":\"DstPort\",\"type\":[\"int\",\"null\"]},\n" +
            "{\"name\":\"FirstPacketArrive\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"LastPacketArrive\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"ResponseStatusCode\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"Cookie\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"UserAgent\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"RequestHost\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"StatusLine\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"ServerVersion\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"ResponseContentLength\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"ResponseDate\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"Method\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"HttpContent\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"RequestUrl\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"Referer\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"ContentType\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"EntityBody\",\"type\":[\"string\",\"null\"]},\n" +
            "{\"name\":\"RequestSequence\",\"type\":[\"int\",\"null\"]},\n" +
            "{\"name\":\"ResponseFile\",\"type\":[\"string\",\"null\"]}\n" +
            "        ]\n" +
            "}";
}
