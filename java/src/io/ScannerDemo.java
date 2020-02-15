package io;

import java.util.Scanner;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/14 14:22
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 从键盘接收数据

        System.out.println("nextLine方式接收：");// nextLine方式接收字符串
        if (scan.hasNextLine()) {// 判断是否还有输入
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }

//        System.out.println("next方式接收：");// nextLine方式接收字符串
//        if (scan.hasNext()) {// 判断是否还有输入
//            String str2 = scan.next();
//            System.out.println("输入的数据为：" + str2);
//        }

        scan.close();
    }
}