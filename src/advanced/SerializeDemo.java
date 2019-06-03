package advanced;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author yuanjiajun
 * @date 2019/5/30
 * @time 10:53
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try{
            FileOutputStream fileout = new FileOutputStream("F://workspace//tmp//test.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in F://workspace//tmp//test.txt");

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
