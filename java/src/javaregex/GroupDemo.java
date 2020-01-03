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

public class GroupDemo {

    @Test
    public void regexGroup() {
        String line = "acl number 3000\n" +
//                " rule 5 permit tcp source 10.10.10.0 0.0.0.255 destination 10.10.30.100 0.0.0.0 destination-port eq ftp source-port eq 80\n" +
                " rule 10 permit tcp source 10.10.10.0 0.0.0.255 source-port eq 82 destination 10.10.30.101 0.0.0.0 destination-port eq www\n" +
                " rule 15 permit udp source 10.10.10.0 0.0.0.255 destination 10.10.30.102 0.0.0.0 destination-port eq dns\n" +
                " rule 20 permit tcp source 10.10.20.0 0.0.0.255 destination 10.10.30.100 0.0.0.0 destination-port eq ftp\n" +
                " rule 25 permit tcp source 10.10.20.0 0.0.0.255 destination 10.10.30.101 0.0.0.0 destination-port eq www\n" +
                " rule 30 permit udp source 10.10.20.0 0.0.0.255 destination 10.10.30.102 0.0.0.0 destination-port eq dns\n" +
                " rule 35 deny ip source 10.10.10.0 0.0.0.255 destination 10.10.20.0 0.0.0.255\n" +
                " rule 40 deny ip source 10.10.10.0 0.0.0.255 destination 10.10.30.0 0.0.0.255\n" +
                " rule 45 deny ip source 10.10.20.0 0.0.0.255 destination 10.10.30.0 0.0.0.255\n" +
                " rule 50 deny ip source any destination any";

        String regex = "rule(\\s\\d+)(\\spermit|\\sdeny)(\\s\\d+|\\s\\w+)" +
                "(" +
                "(\\ssource\\s(((\\d+\\.\\d+\\.\\d+\\.\\d+)\\s(\\d+\\.\\d+\\.\\d+\\.\\d+))|any))?" +
                "(\\ssource-port\\s(eq|gt|lt|(rang\\s\\d+\\s\\d+))\\s(\\w+))?" +
                "(\\sdestination\\s(((\\d+\\.\\d+\\.\\d+\\.\\d+)\\s(\\d+\\.\\d+\\.\\d+\\.\\d+))|any))?" +
                "(\\sdestination-port\\s(eq|gt|lt|(rang\\s\\d+\\s\\d+))\\s(\\w+))?" +
                ")?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        int groupCount = matcher.groupCount();
        System.out.println("groupCount: " + matcher.groupCount());
        boolean a = matcher.find();
        if (a) {
            while (matcher.find()) {
                for (int i = 0; i <= groupCount; i++) {
                    System.out.println("group" + i + ":" + matcher.group(i));
                }
                System.out.println("===============================");
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
