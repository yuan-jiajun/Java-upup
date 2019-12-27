package base;

import java.io.*;

/**
 * @author yuanjiajun
 * @date 2019/5/22
 * @time 20:52
 */
public class FileSteamTest {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("base.txt");
            for(int x=0 ;x<bWrite.length;x++){
                os.write(bWrite[x]);
            }
                os.close();

            InputStream is = new FileInputStream("base.txt");
            int size=is.available();
             for(int i= 0;i<size;i++){
                 System.out.print((char)is.read()+" ");
             }
             is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
