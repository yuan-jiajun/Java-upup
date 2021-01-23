package utils.file_utils;

import java.io.File;
import java.io.IOException;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/23 16:17
 */
public class RenameFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\yuanjiajun\\Desktop\\traffic generator-英文";
        File[] files = new File(path).listFiles();

        for (File file : files) {

            String oldName = file.getName();
            String newName = oldName;
            if (oldName.contains("--")) {
                newName = path + "\\" + newName.replace("--", "-");

                // 新的文件或目录
                File newFile = new File(newName);
                if (newFile.exists()) {  //  确保新的文件名不存在
                    throw new java.io.IOException("file exists");
                }
                if (file.renameTo(newFile)) {
                    System.out.println(oldName + " --> " + newFile.getName());
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
}
