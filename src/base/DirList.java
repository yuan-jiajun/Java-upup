package base;

import java.io.File;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 21:31
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "F://workspace//java//base";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("dir = " + dirname);
            System.out.println();
            String s[]=f1.list();
            for(int i=0;i<s.length;i++){
                File f = new File(dirname + "//" + s[i]);
                if(f.isDirectory()){
                    System.out.printf("%1$10s is a directory",s[i]);
                    System.out.println();
                }else{
                    System.out.printf("%1$10s is a file",s[i]);
                    System.out.println();
                }
            }
        }else {
            System.out.println(dirname+" is not a directory name");
        }
    }
}
