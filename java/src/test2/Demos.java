package test2;

import org.junit.Test;

import javax.swing.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/7 14:39
 */
public class Demos {
    @Test
    public void testDemo1() {
        Demo1 demo1 = new Demo1();
        System.out.println("Demo1.a = " + Demo1.a);
        System.out.println("Demo1.b = " + Demo1.b);
        System.out.println("demo1.a = " + demo1.c);

        System.out.println("Sum1 = " + Demo1.sum1());
        System.out.println("Sum2 = " + demo1.sum2());

        System.out.println("finished3");
    }
}

class Demo1 extends JFrame {
    public static int a;
    public static int b = 5;
    public int c = 1;

    public Demo1() {
        this.setVisible(true);
        this.setSize(200, 200);
        System.out.println("finished");
    }

    public static int sum1() {
        return a + b;
//        return a+b+c;
    }

    public int sum2() {
//        return a+b;
        return a + b + c;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println("finished2");
    }
}

