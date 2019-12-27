package ssh;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/25 17:47
 */
public class Ssh {
    private Map<String, String> map = new HashMap<String, String>();
    private ArrayList<String> arrayList = new ArrayList<String>();
    private SwitchSSHSetting switchSSHSetting = new SwitchSSHSetting(null, "huawei",
            "", "10.0.200.2", 2222, "ntci_lyg", "Lyg@85418825");

    private String str2 = "display info-center channel\n" +
            "channel number:0, channel name:console\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      warning       Y      debugging     Y      debugging    \n" +
            " \n" +
            "channel number:1, channel name:monitor\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      warning       Y      debugging     Y      debugging    \n" +
            " \n" +
            "channel number:2, channel name:loghost\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      informational Y      debugging     N      debugging    \n" +
            " \n" +
            "channel number:3, channel name:trapbuffer\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       N      informational Y      debugging     N      debugging    \n" +
            " \n" +
            "channel number:4, channel name:logbuffer\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      warning       N      debugging     N      debugging    \n" +
            " \n" +
            "channel number:5, channel name:snmpagent\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       N      debugging     Y      debugging     N      debugging    \n" +
            " \n" +
            "channel number:6, channel name:channel6\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
            " \n" +
            "channel number:7, channel name:channel7\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
            " \n" +
            "channel number:8, channel name:channel8\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
            " \n" +
            "channel number:9, channel name:channel9\n" +
            "ModuID   Name          Enable LogLevel      Enable TrapLevel     Enable DebugLevel   \n" +
            "ffffffff default       Y      debugging     Y      debugging     N      debugging    \n" +
            " \n" +
            "<SW-C6-01>";

    @Test
    public void ssh() {
        String[] commands = new String[]{
                "n",
                "screen-length 0 temporary",
                "display info-center",
                "display info-center channel",
        };
        Collections.addAll(arrayList, commands);
        map = SshShellExecutor.sshCommandsToMapFunction(switchSSHSetting, arrayList);

        String regex = "channel number:(\\d+).+channel name:(\\w+)\\s+.+\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)";
        String str = map.get("display info-center channel").trim();

//        char[] charArray = str.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        char tmp1;
//        char tmp2;
//        int count = 0;
//        for (int i = 0; i < charArray.length; i++) {
//            tmp1 = charArray[i];
//            tmp2 = charArray2[i];
//            count = i;
//            if (tmp1 == tmp2) {
//                System.out.println("i =  " + i + "  " + "char = " + tmp1 + "  ===  " + (i - count));
//            } else {
//                System.out.println("j =  " + i + "  " + "char = " + tmp1 + "  ---  " + (i - count));
//            }
//        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            try {
                System.out.println("a");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    @Test
    public void string() {
        String regex = "channel number:(\\d+).+channel name:(\\w+)\\s+.+\\n(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)";

        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern2.matcher(str2);

        while (matcher2.find()) {
            try {
                System.out.println("a");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}