package base;

import java.util.Scanner;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 22:08
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("next");
        if(scan.hasNext()){
            String str1 = scan.nextLine();
            System.out.println("data is "+str1);
        }
        scan.close();
    }
}
