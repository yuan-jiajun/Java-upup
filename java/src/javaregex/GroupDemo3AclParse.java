package javaregex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/1/7 9:41
 */
public class GroupDemo3AclParse {

    @Test
    public void regexGroup() {
        String string = "ip access-list extended 2000\n" +
                " 10 deny tcp 192.168.30.0 0.0.0.255 192.168.10.0 0.0.0.255 eq www \n" +
                " 10 deny tcp 192.168.30.0 0.0.0.255 eq www 192.168.10.0 0.0.0.255 eq www \n" +
                " 20 deny icmp any 0.0.0.1 255.255.255.0 \n" +
                " 30 deny tcp any any eq 135 \n" +
                " 50 permit ip host 192.168.3.1 192.168.10.0 0.0.0.255 eq www \n" +
                " 50 permit ip host 192.168.3.1 host 192.168.3.1 \n" +
                " 60 permit ip any host 192.168.5.1 \n" +
                " 70 deny ip 192.168.3.0 0.0.0.255 192.168.4.0 0.0.0.255 ";

        String regex = "(\\d+)\\s+(permit|deny)\\s+(\\w+)\\s" +
                "(((\\d+\\.\\d+\\.\\d+\\.\\d+)\\s(\\d+\\.\\d+\\.\\d+\\.\\d+))|(any)|(host\\s(\\d+\\.\\d+\\.\\d+\\.\\d+))){1}" +
                "(\\s(\\w+)\\s+(\\w+))?\\s" +
                "(((\\d+\\.\\d+\\.\\d+\\.\\d+)\\s(\\d+\\.\\d+\\.\\d+\\.\\d+))|(any)|(host\\s(\\d+\\.\\d+\\.\\d+\\.\\d+))){1}" +
                "(\\s(\\w+)\\s+(\\w+))?";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int groupCount = matcher.groupCount();
        System.out.println("groupCount: " + matcher.groupCount());
        boolean a = matcher.find();
        if (!a) {
            System.out.println("NO MATCH!");
        }
        while (matcher.find()) {
            for (int i = 0; i <= groupCount; i++) {
                System.out.println("group" + i + ":" + matcher.group(i));
            }
            System.out.println("===============================");
        }


    }


}