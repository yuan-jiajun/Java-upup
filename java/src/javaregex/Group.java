package javaregex;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/19 15:09
 */

public class Group {

    @Test
    public void regexGroup() {
        String line =
                "display info-center channel\n" +
                        "channel number:0, channel name:console\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      warning       Y      debugging     Y      debugging    \n" +
                        " \n" +
                        "channel number:1, channel name:monitor\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      warning       Y      debugging     Y      debugging    \n" +
                        " \n" +
                        "channel number:2, channel name:loghost\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      informational Y      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:3, channel name:trapbuffer\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       N      informational Y      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:4, channel name:logbuffer\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      warning       N      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:5, channel name:snmpagent\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       N      debugging     Y      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:6, channel name:channel6\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:7, channel name:channel7\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:8, channel name:channel8\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
                        " \n" +
                        "channel number:9, channel name:channel9\n" +
                        "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
                        "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
                        " \n" +
                        "[~SW-C6-01]";


        String pattern = "channel number:(\\d).+channel name:(\\w+)\\n.+\\n(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)";


        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        int groupCount = m.groupCount();
        System.out.println("groupCount: " + m.groupCount());
        boolean a = m.find();
        if (a) {
            for (int i = 0; i <= groupCount; i++) {
                System.out.println("group" + i + ":" + m.group(i));
            }
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void timeParse() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2019-12-19 17:31:25";
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    @Test
    public void test() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateFormat = sdf.format(date);
        Date dateFormatParse = null;
        try {
            dateFormatParse = sdf.parse(dateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("date: " + date);
        System.out.println("date.toString: " + date.toString());
        System.out.println("dateFormat: " + dateFormat);
        System.out.println("dateFormatParse " + dateFormatParse);
    }

    @Test
    public void split() {
        String split = "\nsysname CORE\nyuan\n\njia\n\n";
        String[] splits = split.trim().split("\n");
        for (String a : splits) {
            System.out.println(a);
        }
        System.out.println("done");
    }
}
