package utils.file_utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/17 22:50
 */
public class FileInputOutput {
    public static String fileToString(File file, String charSet) {
        StringBuilder fileString = new StringBuilder();
        try {
            InputStream is = new FileInputStream(file);
            String line; // 用来保存每行读取的内容
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, charSet));
            line = reader.readLine(); // 读取第一行
            while (line != null) { // 如果 line 为空说明读完了
                fileString.append(line); // 将读到的内容添加到 fileString 中
                fileString.append("\n"); // 添加换行符
                line = reader.readLine(); // 读取下一行
            }
            reader.close();
            is.close();
        } catch (Exception e) {
        }
        return fileString.toString().trim();
    }

    public static void stringToFile(String fileString, File dst) {
        try {
            byte bWrite[] = fileString.getBytes(StandardCharsets.UTF_8);
            OutputStream os = new FileOutputStream(dst);
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();
        } catch (IOException e) {
            System.out.print(dst.getName() + " Exception\n");
        }
    }
}
