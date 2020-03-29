package utils.filescontentreplace;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/24 19:56
 */

import java.io.*;

//import org.testng.annotations.Test;

/**
 * 文件操作代码
 *
 * @author cn.outofmemory
 * @date 2013-1-7
 */
public class FilesContentReplace {

    public static void main(String[] args) {
        String path = null;
        String[][] config = new String[0][];
        try {
            config = getConfigStringArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File pureStringConfig = new File("java/src/utils.filescontentreplace/pureStringConfig.txt");
            InputStream is = new FileInputStream(pureStringConfig);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            line = reader.readLine();
            path = line.split("path:")[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            filesContentReplacePureString(path, config[0], config[1], config[2], config[3]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[][] getConfigStringArray() throws IOException {
        String[][] config = new String[4][100];

        File pureStringConfig = new File("java/src/utils.filescontentreplace/pureStringConfig.txt");
        System.out.println("正在读取pureStringConfig.txt 字符串配置");
        InputStream is = new FileInputStream(pureStringConfig);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line;
        String[] lineComponent;
        int lineNumber = 0;
        line = reader.readLine();
        line = reader.readLine();

        while (line != null) {
            lineComponent = line.split("----->");
            config[0][lineNumber] = lineComponent[0];
            config[1][lineNumber] = lineComponent[1];
            lineNumber++;
            line = reader.readLine();
        }


        File regexConfig = new File("java/src/utils.filescontentreplace/regexConfig.txt");
        System.out.println("正在读取regexConfig.txt 正则配置");
        is = new FileInputStream(regexConfig);
        reader = new BufferedReader(new InputStreamReader(is));
        lineNumber = 0;
        line = reader.readLine();
        line = reader.readLine();
        while (line != null) {
            lineComponent = line.split("----->");
            config[3][lineNumber] = lineComponent[0];
            config[4][lineNumber] = lineComponent[1];
            lineNumber++;
            line = reader.readLine();
        }

        reader.close();
        is.close();
        return config;
    }

    public static int filesContentReplacePureString(String filePath,
                                                    String[] oldPureString, String[] newPureString,
                                                    String[] regex, String[] regexReplace) throws IOException {
        File pathFiles = new File(filePath);
        File[] Files = pathFiles.listFiles();
        if (Files == null)
            return -1;
        for (File file : Files) {
            if (file.isFile()) {
                System.out.println("文件：" + file + "正在被读取");
                InputStream is = new FileInputStream(file);
                String line;
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                line = reader.readLine();
                while (line != null) {
                    for (int i = 0; i < regex.length; i++) {
                        if (regex[i] == null)
                            break;
                        if (line.matches(regex[i])) {
                            line = line.replace(regex[i], regexReplace[i]);
                            System.out.println("文件：" + file + "已被修改1");
                        }
                    }


                    for (int i = 0; i < oldPureString.length; i++) {
                        if (oldPureString[i] == null)
                            break;
                        line = line.replace(" ", "");
                        System.out.println(line);
                        if (line.contains("FilePath=%n_%Y-%m-%d_%t.log")) {
                            line = line.replace(oldPureString[i], newPureString[i]);
                            System.out.println("文件：" + file + "已被修改2");
                        }
                    }
                    line = reader.readLine();
                }
                reader.close();
                is.close();
            }
        }
        return 0;
    }
}
