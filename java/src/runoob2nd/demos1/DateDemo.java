package runoob2nd.demos1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/12 19:52
 */
public class DateDemo {
    @Test
    public void testDate() {
        // 初始化 Date 对象
        Date date = new Date();
        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n", date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n", date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date);
    }

    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }

    @Test
    public void testSleep() {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);   // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    @Test
    public void testCalendar() {
        Calendar c = Calendar.getInstance();//默认是当前日期
        System.out.println(c);
        Calendar c1 = Calendar.getInstance();//默认是当前日期
        c1.set(2009, Calendar.JULY, 12);
    }

}