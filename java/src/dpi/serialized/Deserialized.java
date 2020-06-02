package dpi.serialized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialized {
    public static void main(String[] args) throws Exception {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("java\\src\\dpi\\serialized\\employee.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();

            System.out.println(e.getName());
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println(e.toString());
    }
}
