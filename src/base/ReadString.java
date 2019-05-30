package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 20:32
 */
public class ReadString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("enter lines of text.");
        System.out.println("enter 'end' to quit" );
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));

    }
}
