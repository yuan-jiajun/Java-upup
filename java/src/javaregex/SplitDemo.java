package javaregex;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/31 16:01
 */
public class SplitDemo {
    String string = "peer-public-key end\n" +
            "#\n" +
            "drop-profile default\n" +
            "#\n" +
            "aaa\n" +
            " authentication-scheme default\n" +
            " authorization-scheme default\n" +
            " accounting-scheme default\n" +
            " domain default\n" +
            " domain default_admin\n" +
            " local-user lyg password irreversible-cipher %^%#--0LHv6E9%)eA1A;J9bW\":d\"Dp\\i5(H(xbP'gVhNY\")-,+1@E79h's\"zWz\\0%^%#\n" +
            " local-user lyg privilege level 3\n" +
            " local-user lyg ftp-directory /\n" +
            " local-user lyg service-type ftp\n" +
            " local-user ntci password irreversible-cipher %^%#5:|\\>z25l9GY)>)~3V/PD1KdSvCPcUQ_!+:^fJ8)zTntMPP#*XEqYn2(HC66%^%#\n" +
            " local-user ntci privilege level 3\n" +
            " local-user ntci service-type ssh\n" +
            " local-user test password irreversible-cipher %^%#T/E80EXd1/8=O`~1sbpVxD\\}Be=Q&#&di`F'}a#AC3DJ/4~C!Gl}]A3.$F5M%^%#\n" +
            " local-user test privilege level 15\n" +
            " local-user test service-type ssh         \n" +
            " local-user admin password irreversible-cipher %^%#rf0eD-4_1('Xgy;Yh,s>pMb(N`5%G5L1Cd#D.~83j9j+Zm|gH24ai^~80)FC%^%#\n" +
            " local-user admin service-type http\n" +
            " local-user client001 password irreversible-cipher %^%#5`/-;Ai\";WfW_\">LP!z=Cu:iN!3;06'3is0({<G,}QhMNY=U5G3N+6K(}0tI%^%#\n" +
            " local-user client001 privilege level 3\n" +
            " local-user client001 service-type ssh\n" +
            "#\n" +
            "interface Vlanif1\n" +
            " ip address 10.0.200.1 255.255.0.0\n";
    String regex = "(?<!\\S)#\\s+";
    String[] splits = string.split(regex);

    @Test
    public void splitTest() {
        for (String split : splits) {
            System.out.println("=================");
            System.out.println(split);
        }
    }

}