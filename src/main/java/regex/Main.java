package regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2021/1/11 19:18
 */
public class Main {
    public String regexReturnMatchGroups(String string, String regEx, int... groupIds) {
        StringBuilder matchStringBuilder = new StringBuilder();
        int groupCount;

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(string);
        groupCount = matcher.groupCount();

        if (groupIds.length == 0) {
            groupIds = new int[]{0};
        }

//        boolean a = false;
        while (matcher.find()) {
//            if (a) {
//                matchStringBuilder.append(",");
//            }
//            a = true;
            try {
                for (int groupId : groupIds) {
                    matchStringBuilder.append(matcher.group(groupId)).append(" ");
                }
            } catch (Exception e) {
                System.out.println("Matcher Exception.");
            }
        }
        return matchStringBuilder.toString().trim();
    }

    @Test
    public void test() {
        System.out.println(regexReturnMatchGroups(" switchport port-security binding 123.123.123.123",
                "switchport port-security binding(.*)(\\d+.\\d+.\\d+.\\d+)", 1));

        System.out.println(regexReturnMatchGroups(" switchport a port-security binding 123.123.123.123",
                "(\\D+)(\\d+.\\d+.\\d+.\\d+)", 2));
        System.out.println(regexReturnMatchGroups(" switchport port-security binding 123.123.123.123",
                "switchport port-security binding (\\d+.\\d+.\\d+.\\d+)", 1));
    }
}
