package io;

import java.io.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/14 11:44
 */
public class FileNameFilterDemo implements FilenameFilter {//此次使用本类作为接口

    public void f() {
        File file = new File("F:\\workspace\\CAEP\\itispect-parent\\itispect\\src\\main\\java\\cn\\ntci\\itispect");
        String[] filenames = file.list();//以字符串的形式，先列出当前目录下所有文件看一下（有什么类型的文件）
        for (String filename : filenames) {
            System.out.println(filename);
        }
        System.out.println("********************************");
        String[] fnames = file.list(this);
//        System.out.println("===============");
//        System.out.println(this.toString());
//        System.out.println("===============");
        for (String fname : fnames) {
            System.out.println(fname);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new FileNameFilterDemo().f();
    }

    @Override
    public boolean accept(File f, String name) {//重写接口方法
        // TODO Auto-generated method stub
        return name.endsWith(".java");//返回当前目录下以.java结尾的文件
    }
}