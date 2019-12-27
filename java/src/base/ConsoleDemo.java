package base;

import java.lang.System;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 22:17
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        java.io.Console cons =  System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
    }
}
