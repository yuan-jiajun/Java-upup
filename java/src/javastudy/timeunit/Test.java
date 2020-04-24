package javastudy.timeunit;

import java.util.concurrent.TimeUnit;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/1 13:17
 */
public class Test {
    public static void main(String[] args) {
        //1天有24个小时    1代表1天：将1天转化为小时
        System.out.println(TimeUnit.DAYS.toHours(1));//结果： 24

        //1小时有3600秒
        System.out.println(TimeUnit.HOURS.toSeconds(1));//结果3600

        //把3天转化成小时
        System.out.println(TimeUnit.HOURS.convert(3, TimeUnit.DAYS)); //结果是：72


    }
}