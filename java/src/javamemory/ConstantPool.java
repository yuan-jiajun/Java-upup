package javamemory;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/28 14:39
 */
public class ConstantPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();//  程序运行时，除非手动向常量池中添加常量(比如调用intern方法)，否则jvm不会自动添加常量到常量池。
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;

//        System.out.println("s1 == s2" + "s1 == s2");  // true
        System.out.println("s1 == s2 " + String.valueOf(s1 == s2));  // true
        System.out.println("s1 == s3 " + String.valueOf(s1 == s3));  // true
        System.out.println("s1 == s4 " + String.valueOf(s1 == s4));  // false
        System.out.println("s1 == s5 " + String.valueOf(s1 == s5));  // false
        System.out.println("s1 == s6 " + String.valueOf(s1 == s6));  // true
        System.out.println("s1 == s9 " + String.valueOf(s1 == s9));  // false
        System.out.println("s4 == s5 " + String.valueOf(s4 == s5));  // false


        boolean b = true;
        String s = String.valueOf(b);
        System.out.println(b);

    }

    @Test
    public void testIntern() {
        //保持引用，防止自动垃圾回收
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            //通过intern方法向常量池中手动添加常量
            list.add(String.valueOf(i++).intern());
        }
    }

}