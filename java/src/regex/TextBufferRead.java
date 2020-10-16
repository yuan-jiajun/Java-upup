package regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/5 19:31
 */

public class TextBufferRead {
    public static void main(String[] args) {
        try {
            String pathname = "F:\\workspace\\java\\java_test\\resource\\huawei\\huawei-ensp-core.cfg";
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader configReader = new BufferedReader(reader);
            String line = configReader.readLine();

            int lineCount = 0;
            for (; line != null; line = configReader.readLine()) {
                lineCount++;
                if ("#".equals(line)) {
                    continue;
                }

//                String[] lineSplit = line.split(" ");
//                System.out.printf("line: %d\t", lineCount);
//
//                for (int i = 0; i < lineSplit.length; i++) {
//                    System.out.printf("lineSplit[%d]: %s\t", i, lineSplit[i]);
//                }
//                System.out.println("\n");

                String aclLineRuleRegex="(?=source(.*?)?=destination)";
                Pattern pattern = Pattern.compile(aclLineRuleRegex);
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()){
                    System.out.print(matcher.group());
//                    System.out.print("  start:"+matcher.start());
//                    System.out.println("  end:"+matcher.end());
                }

                String aaa= " yuan jiajun ";
                String bbb = aaa.trim();
                String ccc = aaa.trim();

                String str = "hello word";
                char mychar =  str.charAt(6);
                System.out.println(mychar);




            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}