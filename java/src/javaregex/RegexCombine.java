package javaregex;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/27 16:06
 */
public class RegexCombine {

    public String[] regex1(String... containedKey) {
        String[] mustKeyRegex = new String[containedKey.length];
        String mustKeyRegexPrefix = "[\\s\\S]*(";
        String mustKeyRegexPostfix = ")[\\s\\S]*";
        for (int i = 0; i < containedKey.length; i++) {
            mustKeyRegex[i] = mustKeyRegexPrefix + containedKey[i] + mustKeyRegexPostfix;
        }
        return mustKeyRegex;
    }

    public String[] regex0(String... exclusiveKey) {
        String[] exclusiveKeyRegex = new String[exclusiveKey.length];
        String exclusiveKeyRegexPrefix = "^(((?!";
        String exclusiveKeyRegexPostfix = "))[\\s\\S])*$";
        for (int i = 0; i < exclusiveKey.length; i++) {
            exclusiveKeyRegex[i] = exclusiveKeyRegexPrefix + exclusiveKey[i] + exclusiveKeyRegexPostfix;
        }
        return exclusiveKeyRegex;
    }

    @Test
    public void testRegex1() {
        String[] string1 = regex1("yuan", "jia", "jun");
        System.out.println("string1:" + Arrays.toString(string1));

        String[] string0 = regex0("yuan", "jia", "jun");
        System.out.println("string0:" + Arrays.toString(string0));

    }

    @Test
    public void testRegex2() {
        String[] string1 = regex1("yuan", "jia", "jun");
        System.out.println("string1:" + Arrays.toString(string1));

//        String[] string0 = regex0("yuan", "jia", "jun");
//        System.out.println("string0:" + Arrays.toString(string0));

    }
}