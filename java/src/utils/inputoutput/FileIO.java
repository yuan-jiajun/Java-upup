package utils.inputoutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileIO {
    public static Random ran = new Random();

    public static void main(String[] args) {
        try {
            solution();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //获取50个随机数
    public static List<Integer> test() {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            arr.add(i + 1);
        }
        return arr;
    }

    //逻辑处理
    public static void solution() throws Exception {
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> list = test();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int a = ran.nextInt(list.size());
                res.add(list.get(a));
                list.remove(list.get(a));
            }
        }
        write2Txt(res.toString());//写到文本
        System.out.println("50个数字剩余的最后一个数字=" + list.get(0));//输出到控制台
    }

    //字符串写出到文本
    public static void write2Txt(String str) throws Exception {
        FileWriter fw = null;
        String path = "F:\\project\\docs\\txt.txt";
        File f = new File(path);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
//            fw = new FileWriter(f);
//            BufferedWriter out = new BufferedWriter(fw);
//            out.write(str);
//            out.close();

            FileOutputStream fos = new FileOutputStream(f);
//            OutputStreamWriter out = new OutputStreamWriter(fos, "UTF-8");
//            out.write(str);
//            out.close();
            fos.write( new byte[]{1,2});
            fos.close();
            System.out.println("===========写入文本成功========");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
