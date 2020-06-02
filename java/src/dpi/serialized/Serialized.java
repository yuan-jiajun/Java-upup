package dpi.serialized;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialized {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        try {
            FileOutputStream fileOut = new FileOutputStream("java\\src\\dpi\\serialized\\employee.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is complete.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}


