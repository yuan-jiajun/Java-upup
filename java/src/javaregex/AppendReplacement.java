package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/12 23:53
 */
public class AppendReplacement {
    private static String REGEX = "a*b";
    private static String INPUT = "(aab)foo(aab)foo(ab)foo(b)kkk";
//    private static String INPUT = "fooabfoobkkk";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
            System.out.println(sb.toString());
        }
        m.appendTail(sb);
        System.out.println("=========");
        System.out.println(sb.toString());
    }
}

