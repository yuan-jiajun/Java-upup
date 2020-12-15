package utils.fileIO;

import java.io.*;
import java.util.Arrays;

/**
 * @author Yuan Jiajun
 * @date 2020/11/11 15:42
 * @description @link
 */
public class BinaryFileIO {

    //文件输出
    public static void main(String args[]) {
        byte[] bytes = read(new File("C:\\Users\\yuanjiajun\\Desktop\\user1@org2_abeKeygo.abeKeygo"));

//        byte[] bytes = read(new File("F:\\modules\\五所项目\\二期开发-终端检测\\Centos-5.repo"));

        write(bytes, new File("C:\\Users\\yuanjiajun\\Desktop\\new"));

        byte[] bytes2 = read(new File("C:\\Users\\yuanjiajun\\Desktop\\new"));

//        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        System.out.println();
        System.out.println(new String(bytes2));

        System.out.println(Arrays.equals(bytes, bytes2));

    }

    public static byte[] read(File fileName) {
        byte[] bytes = null;
        try {
            InputStream is = new FileInputStream(fileName);
            int size = is.available();
            bytes = new byte[size];

            for (int i = 0; i < size; i++) {
                is.read(bytes);
            }

            is.close();

        } catch (IOException e) {
            System.out.print("Exception");
        }
        return bytes;
    }

    public static void write(byte[] bytes, File fileName) {
        try {
            OutputStream os = new FileOutputStream(fileName);
            for (byte aByte : bytes) {
                os.write(aByte); // writes the bytes
            }
            os.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}