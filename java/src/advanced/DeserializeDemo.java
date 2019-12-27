package advanced;

import java.io.*;

/**
 * @author yuanjiajun
 * @date 2019/5/30
 * @time 11:09
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream filein=new FileInputStream("F://workspace//tmp//test.txt");
            ObjectInputStream in=new ObjectInputStream(filein);
            e=(Employee)in.readObject();
            in.close();
            filein.close();

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            System.out.println("Employee class not found");
            e1.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
