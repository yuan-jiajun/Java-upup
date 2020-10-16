package utils.inputoutput;

import java.io.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/14 14:07
 */
public class FileCopy {

    public static void main(String[] args) {
        File sourcefile = new File("resource/iofolder/test.txt");
        File copyfile = new File("resource/iofolder/testcopy.txt");
        FileInputStream fileInputStream = null;// 从文件中读数据
        FileOutputStream fileOutputStream = null;// 用于把数据写入文件
        BufferedWriter bufferedWriter = null;// 用于把数据写入文件
        try {
            if (!sourcefile.exists()) {
                sourcefile.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(sourcefile));
            // bufferedwriter 自动追加数据
            String s = new String(" I love Java");

            char bchar[] = s.toCharArray();
            for (int i = 0; i < 3; i++) {
                // 两种方式往文件中写数据
                bufferedWriter.write(bchar, 0, bchar.length);
                bufferedWriter.write(", " + s + "\n");
            }
            // 写完之后才能关闭流,
            bufferedWriter.flush();
            bufferedWriter.close();

            if (!copyfile.exists()) {
                copyfile.createNewFile();
            }
            fileInputStream = new FileInputStream(sourcefile);
            fileOutputStream = new FileOutputStream(copyfile);
            byte b[] = new byte[8192];
            int len = b.length;
            while ((len = fileInputStream.read(b, 0, len)) > 0) {
                fileOutputStream.write(b, 0, len);
                fileOutputStream.flush();
            }
            System.out.println("file copied");
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
