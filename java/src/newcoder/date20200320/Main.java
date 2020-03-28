package newcoder.date20200320;

import java.io.IOException;

/**
 * @author yuanjiajun
 * @description https://ac.nowcoder.com/acm/problem/13222
 * @date 2020/3/20 13:08
 */


public class Main {
    public static void main(String[] args) {
        int length1 = 0;
        int length2 = 0;
        int[] music1;
        int[] music2;

//        虽然此方式实现了从键盘获取输入的字符，但是System.out.read()只能针对一个字符的获取，
//        同时，获取进来的变量的类型只能是char，
//        当我们输入一个数字，希望得到的也是一个整型变量的时候，我们还得修改其中的变量类型，这样就显得比较麻烦。
//          输入：2个回车       输出：
//        输入第一段音频长度:
//        输入第二段音频长度:
//        第一段音频长度为：10第二段音频长度为：10
//          输入：1010      输出：
//        输入第一段音频长度:1010
//        输入第二段音频长度:第一段音频长度为：49第二段音频长度为：48
//          输入：1 1       输出：
//        输入第一段音频长度:1 1
//        输入第二段音频长度:第一段音频长度为：49第二段音频长度为：32
        //总结System.in.read()会一直读取输入的字符，所以这里的length1和length2会用
        try {
            System.out.print("输入第一段音频长度:");
            length1 = (char) System.in.read();
            music1 = new int[length1];
            System.out.print("输入第二段音频长度:");

            length2 = System.in.read();
            music2 = new int[length2];
            System.out.println("第一段音频长度为：" + length1 + "第二段音频长度为：" + length2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}