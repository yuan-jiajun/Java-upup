package utils.find_duplicate;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/28 19:49
 */
public class FindDuplicate {

    public static final List<FileProperty> fileList = new ArrayList<>();
    public static int count_duplicate = 0;
    public static int count_total = 0;

    public static void addFile2List(String filePath) {
        File file = new File(filePath);
        if (!file.exists() || !file.isDirectory()) {
            System.out.println("filePath error");
            return;
        }

        File[] childFiles = file.listFiles();
        for (File child : childFiles) {
            if (child.isFile()) {
                fileList.add(new FileProperty(child.getAbsolutePath()));
                count_total++;
            } else if (child.isDirectory()) {
                addFile2List(child.getAbsolutePath());
            }
        }
    }

    public static void dealDuplicate() {
        String s = null;
        FileProperty fileProperty_A = null;
        FileProperty fileProperty_B = null;

        for (int i = 0; i < fileList.size(); i++) {
            fileProperty_A = fileList.get(i);
            if (i + 1 > fileList.size()) {
                continue;
            }
            for (int j = i + 1; j < fileList.size(); j++) {
                fileProperty_B = fileList.get(j);
                if (fileProperty_A.equals(fileProperty_B)) {
                    deal(fileProperty_A, fileProperty_B);
                }
            }
        }
    }

    public static void deal(FileProperty fileProperty_A, FileProperty fileProperty_B) {
        count_duplicate++;
        String path_A = fileProperty_A.toString().replace("\\", "\\\\");
        String path_B = fileProperty_B.toString().replace("\\", "\\\\");
        System.out.println(path_A);
        System.out.println(path_B);

/*        if (fileProperty_A.getFileName().startsWith("20") || fileProperty_B.getFileName().startsWith("20")) {
            File file = new File(path_A);
            if (fileProperty_A.getFileName().startsWith("20")) {
                file = new File(path_B);
            }

            if (file.delete()) {
                System.out.println("delete " + file.getPath() + " ok !");
            } else {
                System.out.println("delete " + file.getPath() + " error xxxxxxxxxxxxxxxxxxx");
            }

        } else {
            System.out.println("======================= please manual delete =======================");
        }*/

        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        String path = "F:\\notes\\paper-read\\值得阅读";
        FindDuplicate.addFile2List(path);
        FindDuplicate.dealDuplicate();
        System.out.println("重复文件个数 : " + count_duplicate);
        System.out.println("总文件个数 : " + count_total);
    }


    @Test
    public void test() {
        File file = new File("F:\\notes\\hh\\哈工大-王佰玲-小-计算机工程与应用-传统报文捕获平台性能影响因素分析 - 副本.pdf");
        if (file.delete()) {
            System.out.println("delete " + file.getName() + " ok !");
        } else {
            System.out.println("delete " + file.getName() + " error xxxxxxxxxxxxxxxxxxx");
        }
        System.out.println();
    }

}
