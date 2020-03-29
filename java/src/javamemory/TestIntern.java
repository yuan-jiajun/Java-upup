package javamemory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/28 15:34
 */
public class TestIntern {
    public static void main(String[] args) {
        //保持引用，防止自动垃圾回收
        List<String> list = new ArrayList<String>();
        String i = "List<String> list = new ArrayList<String>();";
        while (true) {
            //通过intern方法向常量池中手动添加常量
            list.add(String.valueOf(i).intern());
        }
    }
}