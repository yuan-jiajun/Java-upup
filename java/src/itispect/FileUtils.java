package itispect;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/24 19:56
 */

import org.junit.Test;

import java.io.*;

//import org.testng.annotations.Test;

/**
 * 文件操作代码
 *
 * @author cn.outofmemory
 * @date 2013-1-7
 */
public class FileUtils {
    public static String fileToString(String filePath) throws IOException {
        if (!filePath.contains(".cfg")) {
            System.out.println("请输入合法配置文件");
            return null;
        }
        StringBuilder fileString = new StringBuilder();
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行
        while (line != null) { // 如果 line 为空说明读完了
            fileString.append(line); // 将读到的内容添加到 fileString 中
            fileString.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
        return fileString.toString();
    }

    @Test
    public void testReadFile() {
        String filePath = "F:\\workspace\\CAEP\\itispect-parent\\target\\configfiles\\huawei\\huawei-ensp-core.cfg";
        String fileString = null;
        try {
            fileString = FileUtils.fileToString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileString);
    }
}
