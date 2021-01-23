package utils.file_utils;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/24 19:56
 */

import java.io.*;
import java.util.Properties;


public class FilesContentReplace {

    public static void main(String[] args) throws IOException {
        //读取配置文件
        InputStream in = new FileInputStream("F:\\workspace\\java\\Java-upup\\java\\src\\utils\\file_utils\\config.properties");
        Properties properties = new Properties();
        properties.load(in);

        File pathFiles = new File(properties.getProperty("FolderPath"));
        int regex_count = Integer.parseInt(properties.getProperty("PAIR_COUNT"));

        File[] Files = pathFiles.listFiles();
        if (Files == null) {
            return;
        }

        for (File file : Files) {
            if (file.isFile()&&file.getName().contains("xsh")) {
                System.out.println("File ： " + file + " is reading");
                String fileString = FileInputOutput.fileToString(file, "UTF_16LE");
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < regex_count; i++) {
                    String regex = properties.getProperty("line_regex_" + i);
                    String splitPatter = properties.getProperty("splitPatter_" + i);
                    String replace = properties.getProperty("replace_" + i);

                    String[] split = fileString.split(regex);
                    result.append(split[0]);
                    result.append(replace);
                    result.append(split[1]);
                }

                File dst = new File("C:\\Users\\yuanjiajun\\Desktop\\Sessions\\new\\" + file.getName());
                FileInputOutput.stringToFile(result.toString(), dst);
                result.setLength(0);
            }

        }
    }
}
