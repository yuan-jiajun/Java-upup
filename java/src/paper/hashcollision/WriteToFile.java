package paper.hashcollision;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/1 16:31
 */
public class WriteToFile {
    private static long hashInfoCount = 1;
    private static long hashCollisionInfoCount = 1;
    private static File hashInfoFile =
            new File("F:\\workspace\\paper\\data\\txt\\hashInfo.txt");
    private static File hashCollisionInfoFile =
            new File("F:\\workspace\\paper\\data\\txt\\hashCollisionInfo.txt");


    static {
        FileWriter fw = null;
        try {
            if (!hashInfoFile.exists()) {
                hashInfoFile.createNewFile();
            }
            if (!hashCollisionInfoFile.exists()) {
                hashCollisionInfoFile.createNewFile();
            }

            //清空文件
            fw = new FileWriter(hashInfoFile);
            fw.write("");
            fw.flush();

            fw = new FileWriter(hashCollisionInfoFile);
            fw.write("");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void hashInfo(String result) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(hashInfoFile, true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter pw = new PrintWriter(fw);

        pw.write("count: " + hashInfoCount++ + "\t" + result + "\n");
        pw.flush();

        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void hashCollisionInfo(String result) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(hashCollisionInfoFile, true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter pw = new PrintWriter(fw);


        pw.write("count: " + hashCollisionInfoCount++ + "\t" + result + "\n");
        pw.flush();

        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}