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

public class GroupDemo1 {

    @Test
    public void regexGroup() {
        String string = "set password min-length 10  local-user policy password min-len 6";

        String regex = "(set\\s+password\\s+min-length\\s+(\\d+))|(local-user\\s+policy\\s+password\\s+min-len\\s(\\d+))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int groupCount = matcher.groupCount();
        System.out.println("groupCount: " + matcher.groupCount());
        System.out.println();
//        boolean a = matcher.find();
//        if (!a) {
//            System.out.println("NO MATCH!");
//        }

        while (matcher.find()) {
            for (int i = 0; i <= groupCount; i++) {
                System.out.println("group" + i + ":" + matcher.group(i));
            }
            System.out.println("===============================");
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
