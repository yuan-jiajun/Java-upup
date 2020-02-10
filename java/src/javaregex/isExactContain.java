package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/9 21:06
 */
public class isExactContain {
    public static void main(String[] args) {

        String source1 = "vlan 10 1010 1110";
        String source2 = "vlan 1010 1110";
        String subterm_1 = "10";
        String subterm_2 = "1110";

        System.out.println(isExactContain(source1, subterm_1));
        System.out.println(isExactContain(source1, subterm_2));
        System.out.println(isExactContain(source2, subterm_1));
        System.out.println(isExactContain(source2, subterm_2));
    }

    private static boolean isExactContain(String source, String subItem) {
        String pattern = "\\b" + subItem + "\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        return m.find();
    }
}