package temp;

import org.junit.Test;

import java.io.File;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/17 19:05
 */
public class Main {
    @Test
    public void test() {
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println(f);
    }
}

