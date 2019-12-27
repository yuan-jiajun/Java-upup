package javaregex;

import org.junit.Test;

import java.io.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/27 10:44
 */
public class Matcher {
    public static String fileToString(String filePath) throws IOException {
        if (!filePath.contains(".cfg")) {
            System.out.println("请输入合法配置文件");
            return null;
        }
        StringBuilder buffer = new StringBuilder();
        InputStream is = new FileInputStream(filePath);
        String line; // 用来保存每行读取的内容
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine(); // 读取第一行
        while (line != null) { // 如果 line 为空说明读完了
            buffer.append(line); // 将读到的内容添加到 buffer 中
            buffer.append("\n"); // 添加换行符
            line = reader.readLine(); // 读取下一行
        }
        reader.close();
        is.close();
        return buffer.toString();
    }

    @Test
    public void testReadFile() {
        String filePath = "F:\\workspace\\CAEP\\itispect-parent\\target\\configfiles\\huawei\\huawei-ensp-core.cfg";
        String fileString = null;
        try {
            fileString = Matcher.fileToString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(fileString);
        String[] fileBlocksString;

        assert fileString != null;
        fileBlocksString = fileString.split("#\\s+");
//        +(?!user-interface)+(?!NULL)
        boolean flag;
        String[] blockLocateRegexs = new String[]{"[\\s\\S]*interface[\\s\\S]*", "^(((?!Vlanif)+(?!user-interface)+(?!NULL))[\\s\\S])*$"};

        for (String fileBlockString : fileBlocksString) {
            flag = true;
//            if (fileBlockString.contains("interface"))
//                System.out.println();
            for (String blockLocateRegex : blockLocateRegexs) {
                if (!fileBlockString.matches(blockLocateRegex)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(fileBlockString);
            }
        }
    }

    @Test
    public void matches() {
        System.out.println("yuan\ninterface Vlanif10".matches("^((?!)[\\s\\S])*$"));
    }


}