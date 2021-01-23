package utils.file_utils;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/17 22:19
 */

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EncodingTransfer {
//    public static String sourceCharset = "utf16"; // 源文件编码
//    public static String targetCharset = "utf8"; // 目标文件编码

    public static void convert(File file, String sourceCharset, String targetCharset) throws IOException {
        // 如果是文件则进行编码转换，写入覆盖原文件
        if (file.isFile()) {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), sourceCharset);
            BufferedReader br = new BufferedReader(isr);
            StringBuffer sb = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                // 注意写入换行符
                sb.append(line).append("\n");
            }
            br.close();
            isr.close();


//            File targetFile = new File(file.getPath() + "." + targetCharset); //重命名

            File targetFile = new File(file.getParentFile().getPath() + "\\new2\\" + file.getName());
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(targetFile), targetCharset);
            BufferedWriter bw = new BufferedWriter(osw);
            // 以字符串的形式一次性写入
            bw.write(sb.toString());
            bw.close();
            osw.close();
            System.out.println(file.getName() + " transfer successfully.");
        }

        /*else {
            for (File subFile : file.listFiles()) {
                convert(subFile);
            }
        }*/

    }

    @Test
    public void test() throws IOException {
        File pathFiles = new File("C:\\Users\\yuanjiajun\\Desktop\\new");

        File[] Files = pathFiles.listFiles();
        if (Files == null) {
            return;
        }

        for (File file : Files) {
            convert(file, "UTF-8", "UTF-16LE");
        }

    }

}
