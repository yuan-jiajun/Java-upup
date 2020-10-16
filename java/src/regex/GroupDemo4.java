package regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/1/7 9:41
 */
public class GroupDemo4 {

    @Test
    public void regexGroup() {
        String string = " mac-vlan mac-address 1211-2222-3333 vlan 50 priority 0\n" +
                " mac-vlan mac-address 1211-3332-3333 vlan 60 priority 0\n" +
                " mac-vlan mac-address 1211-4444-3333 vlan 70 priority 0";

        String regex = "vlan\\s+((\\d+)*(\\s+to\\s+\\d+)*)";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int groupCount = matcher.groupCount();
        System.out.println("groupCount: " + matcher.groupCount());
        System.out.println(matcher.group(0));
        while (matcher.find()) {
            for (int i = 0; i <= groupCount; i++) {
                System.out.println("group" + i + ":" + matcher.group(i));
            }
            System.out.println("===============================");
        }
    }

    @Test
    public void regexGroup2() {
        String macInfoPortName = "null";
        String macInfoPortName2 = null;
        System.out.println(macInfoPortName.equals(macInfoPortName2));
    }


}