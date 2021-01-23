package regex;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/19 15:09
 */

public class GroupDemo {

    @Test
    public void regexGroup() {
        String line = "#-166 设备安装功能: DIF_INSTALLDEVICE。\n" +
                "#I123 进行 \"STORAGE\\REMOVABLEMEDIA\\8&19C36A0B&0&RM\" 的完全安装。\n" +
                "#W100 在安装 \"STORAGE\\REMOVABLEMEDIA\\8&19C36A0B&0&RM\" 时 \"STORAGE\\RemovableMedia\\8&19c36a0b&0&RM\" (否绝类型 6: PNP_VetoDevice)否绝查询删除。\n" +
                "#W104 设备 \"STORAGE\\REMOVABLEMEDIA\\8&19C36A0B&0&RM\" 需要重新启动: 查询删除失败(安装) CfgMgr32 返回: 0x17: CR_REMOVE_VETOED.\n" +
                "#I121 \"STORAGE\\REMOVABLEMEDIA\\8&19C36A0B&0&RM\" 的设备安装成功完成。\n" +
                "[2021/01/22 13:44:35 1880.1119]\n" +
                "#-198 处理的命令行: \"C:\\WINDOWS\\system32\\mmc.exe\" \"C:\\WINDOWS\\system32\\compmgmt.msc\" /s\n" +
                "#-166 设备安装功能: DIF_REMOVE。\n" +
                "#I289 正在删除设备 \"STORAGE\\REMOVABLEMEDIA\\8&19C36A0B&0&RM\"。\n" +
                "#I048 设备已删除。\n" +
                "[2021/01/22 13:43:00 1880.1117]\n" +
                "#-198 处理的命令行: \"C:\\WINDOWS\\system32\\mmc.exe\" \"C:\\WINDOWS\\system32\\compmgmt.msc\" /s\n" +
                "#-166 设备安装功能: DIF_REMOVE。\n" +
                "#I289 正在删除设备 \"USBSTOR\\DISK&VEN_KINGSTON&PROD_DATATRAVELER_3.0&REV_PMAP\\E0D55EA573C8E370B7E105BF&0\"。\n" +
                "#I048 设备已删除。\n";

        String regex = "\\[(.+)\\](?:\\s+.+){2}\\s+\\S+\\s+正在删除设备\\s+\\S+TOR\\\\DISK&VEN_(.+)&PROD_(.+)&REV_\\S+\\\\(.+)&0";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        int groupCount = matcher.groupCount();
        System.out.println("groupCount: " + matcher.groupCount());
//        boolean a = matcher.find();
//        if (!a) {
//            System.out.println("NO MATCH!");
//        }
        while (matcher.find()) {
            for (int i = 0; i <= groupCount; i++) {
                System.out.println("group" + i + ":" + matcher.group(i));
            }
            System.out.println("===============================");
        }
    }

    @Test
    public void timeParse() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2019-12-19 17:31:25";
        Date date = null;
        try {
            date = sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    @Test
    public void test() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateFormat = sdf.format(date);
        Date dateFormatParse = null;
        try {
            dateFormatParse = sdf.parse(dateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("date: " + date);
        System.out.println("date.toString: " + date.toString());
        System.out.println("dateFormat: " + dateFormat);
        System.out.println("dateFormatParse " + dateFormatParse);
    }

    @Test
    public void split() {
        String split = "\nsysname CORE\nyuan\n\njia\n\n";
        String[] splits = split.trim().split("\n");
        for (String a : splits) {
            System.out.println(a);
        }
        System.out.println("done");
    }
}
