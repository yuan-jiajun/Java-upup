package base;

import java.io.File;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 21:20
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirname = "F://workspace//java//base//mkdir";
        File d = new File(dirname);
        d.mkdir();
    }
}
