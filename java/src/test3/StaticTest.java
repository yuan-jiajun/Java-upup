package test3;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/24 20:16
 */
public class StaticTest {
    private static String[] switchCount;


    public static void test(String[] a) {
        System.out.println(Arrays.toString(switchCount));
//        a = switchCount;
        switchCount = a;
        switchCount = new String[]{"3","4"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(switchCount));
    }

    public static void main(String[] args) {
        switchCount=new String[5];
        test(new String[]{"1","2"});
//        new Test1().getTest();

    }

}

class Test1 {
    String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}