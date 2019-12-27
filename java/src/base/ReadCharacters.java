package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 20:15
 */
public class ReadCharacters {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input until q");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }


}
