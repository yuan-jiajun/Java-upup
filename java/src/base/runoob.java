package base;

import java.util.Date;

/**
 * @author yuanjiajun
 * @date 2019/5/21
 * @time 21:35
 */


public class runoob {
    public static void main(String args[]) {
        Date date =new Date();
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//
//        System.out.println("time = "+ft.format(date));
        System.out.println(date.getTime());
        for (int i = 0; i <100 ; i++) {
            System.out.println(System.currentTimeMillis()+"\n");
        }
        System.gc();

    }
}