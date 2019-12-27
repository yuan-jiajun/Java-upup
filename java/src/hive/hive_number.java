package hive;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class hive_number {

    public static void main(String[] args) {
        FileWriter fw = null;
        String path = "F:\\project\\TRex\\txt\\hive-number.txt";
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file, true);
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        String a = ",partition (year = '%d')";

        PrintWriter pw = new PrintWriter(fw);
        int j;
        for (j = 61527000; j < 76868239; j++) {
//            String a = ",partition (year = '"+j.toString+     "')";

//            pw.write(",partition (year = '%d')\n",j);
            pw.flush();


//                System.out.println(j);
        }

        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}


