package utils;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/17 23:45
 */
public class LastLineofString {

    public static String extractLastLine(String input) {
        int lastIndexOf = input.lastIndexOf('\n');
        if (lastIndexOf == -1 || lastIndexOf + 1 > input.length())
            return "";
        return input.substring(lastIndexOf + 1);
    }

    @Test
    public void test() {
        String string = "line con 0\n" +
                " session-timeout 10\n" +
                " login local\n" +
                " password 7 151258754373745710\n" +
                "line vty 0 4\n" +
                " transport input ssh\n" +
                " session-timeout 15\n" +
                " login local\n" +
                " password 7 0251563e120f3b\n" +
                "!\n" +
                "!\n" +
                "end";
        System.out.println(extractLastLine(string));

    }
}
