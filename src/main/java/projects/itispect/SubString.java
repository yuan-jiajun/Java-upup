package projects.itispect;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/14 16:11
 */
public class SubString {
    public static String a = "!Software Version V200R003C00SPC300\n" +
            "#\n" +
            "sysname SW-B6-02\n" +
            "#\n" +
            "vlan batch 100 300 1994 to 1995\n" +
            "#\n" +
            "diffserv domain default\n" +
            "#\n" +
            "aaa\n" +
            " authentication-scheme default\n" +
            " authorization-scheme default\n" +
            " accounting-scheme default\n" +
            " domain default\n" +
            " domain default_admin\n" +
            " local-user lyg password cipher %@%@&~8,F.lGq@~WjV:@*vR@,.2n%@%@\n" +
            " local-user lyg privilege level 3\n" +
            " local-user lyg service-type ssh\n" +
            " local-user ntci password irreversible-cipher %@%@FuyG8qJl}KtFfkCi}QeN&ElHr5bW=Bk:(X3K~FM~l0a,ElK&%@%@\n" +
            " local-user ntci privilege level 3\n" +
            " local-user ntci service-type ssh\n" +
            " local-user admin password cipher %@%@5d~9:M^ipCfL\\iB)EQd>3Uwe%@%@\n" +
            " local-user admin service-type http\n" +
            "#\n" +
            "interface Vlanif1\n" +
            "#\n" +
            "interface MEth0/0/1\n" +
            " ip address 10.0.200.3 255.255.0.0\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/1\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/2\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/3\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/4\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/5\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/6\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/7\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/8\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/9\n" +
            " mac-address learning disable\n" +
            " port link-type trunk\n" +
            " undo port trunk allow-pass vlan 1\n" +
            " port trunk allow-pass vlan 100 300 1994 to 1995\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/10\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/11\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/12\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/13\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/14\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/15\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/16\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/17\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/18\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/19\n" +
            " port link-type trunk\n" +
            " port trunk allow-pass vlan 100 300 1994 to 1995\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/20\n" +
            " port link-type trunk\n" +
            " undo port trunk allow-pass vlan 1\n" +
            " port trunk allow-pass vlan 100 300 1994 to 1995\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/21\n" +
            " port link-type trunk\n" +
            " undo port trunk allow-pass vlan 1\n" +
            " port trunk allow-pass vlan 100 300 1994 to 1995\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/22\n" +
            " port link-type trunk\n" +
            " undo port trunk allow-pass vlan 1\n" +
            " port trunk allow-pass vlan 100 300 1994 to 1995\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/23\n" +
            "#\n" +
            "interface XGigabitEthernet0/0/24\n" +
            "#\n" +
            "interface NULL0\n" +
            "#\n" +
            "stelnet server enable\n" +
            "ssh server port 2222\n" +
            "ssh user lyg\n" +
            "ssh user lyg authentication-type password\n" +
            "ssh user lyg service-type stelnet\n" +
            "ssh user ntci\n" +
            "ssh user ntci authentication-type password\n" +
            "ssh user ntci service-type stelnet\n" +
            "ssh client first-time enable\n" +
            "#\n" +
            "user-interface con 0\n" +
            " authentication-mode password\n" +
            " set authentication password cipher %@%@up!gV5f:;T`vLpNcI7U->e<@jAZLWg3l`(u%\"H~k%.!Qe<C>%@%@\n" +
            "user-interface vty 0 4\n" +
            " authentication-mode aaa\n" +
            " protocol inbound ssh\n" +
            "user-interface vty 16 20\n" +
            "#\n" +
            "port-group 20-23\n" +
            "#\n" +
            "return\n" +
            "[SW-B6-02]";


    public static void main(String[] args) {
//        String a = "yuan\njia\njun";

        int lastLF = a.lastIndexOf('\n');
        String endFlagString = a.substring(lastLF + 1);

        while (!a.substring(lastLF + 1).contains("return") &&
                !a.substring(lastLF + 1).contains("end")) {
            a = a.substring(0, lastLF);
            lastLF = a.lastIndexOf('\n');
        }
        String endFlagString2 = a.substring(lastLF + 1);
        System.out.println(endFlagString2);
        String b = "true 没有找到与输入相匹配的acl规则(SimplifyTrafficPolicy)";
        int leftBracket = b.lastIndexOf("t");
        System.out.println(leftBracket);
    }
}