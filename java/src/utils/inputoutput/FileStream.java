package utils.inputoutput;

import org.junit.Test;

import java.io.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/13 20:37
 */
public class FileStream {
    @Test
    public void fileStreamTest() throws IOException {

        File f = new File("resource/iofolder/a.txt");
        FileOutputStream fop = new FileOutputStream(f);// 构建FileOutputStream对象,文件不存在会自动新建
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");// 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append("中文输入"); // 写入到缓冲区
        writer.append("\r\n");// 换行
        writer.append("English");
        writer.close(); // 关闭写入流,同时会把缓冲区内容写入文件
        fop.close();// 关闭输出流,释放系统资源

        FileInputStream fip = new FileInputStream(f);// 构建FileInputStream对象
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");// 构建InputStreamReader对象,编码与写入相同
        BufferedReader bf = new BufferedReader(reader);

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
//            sb.append((char) reader.read());// 转成char加到StringBuffer对象中
//            sb.append((char)fip.read());// 转成char加到StringBuffer对象中
//            sb.append(bf.readLine()).append("\r\n");// 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();// 关闭读取流
        fip.close();// 关闭输入流,释放系统资源
    }
}