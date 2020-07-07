package trafficrate;

import com.sun.org.apache.xml.internal.security.utils.JavaUtils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yuan Jiajun
 * @description
 * @date 2020/7/7 16:51
 */
public class TrafficRateMap {
    static int count = 1;
    static Map<Integer, Properties> myMap = new HashMap<Integer, Properties>();
    static String folderPath = "java/src/paper/src/main/java/trafficrate/logresource";

    public static void buildMap() {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files == null)
            return;
        for (File file : files) {
            singleFileMap(file.getAbsolutePath());
        }
    }


    public static void singleFileMap(String path) {
        String log = null;
        try {
            log = new String(JavaUtils.getBytesFromFile(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(log);

        String regex = "DPDKCAP: \\[(.*)]\\s.+\\s.+packets_capture/s:\\s+(\\S+).+bytes_capture/s:\\s+(\\S+) MB";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(log);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);

        while (matcher.find()) {
//            System.out.println(matcher.group(1) + "\t" + matcher.group(2) + "\t" + matcher.group(3));
            Properties properties = new Properties();

            try {
                properties.setDate(sdf.parse(matcher.group(1)));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            if (matcher.group(2).contains("k")) {
                String a = matcher.group(2);
                properties.setPacketsCapture(Double.parseDouble(matcher.group(2).replace("k", "")));
            } else if (matcher.group(2).contains("M")) {
                properties.setPacketsCapture(Double.parseDouble(matcher.group(2).replace("M", "")) * 1000);
            }

            properties.setBytesCapture(Double.parseDouble(matcher.group(3)));

            myMap.put(count++, properties);
        }

//        return myMap;
    }
}