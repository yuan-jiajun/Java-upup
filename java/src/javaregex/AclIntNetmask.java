package javaregex;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/1/15 11:42
 */
public class AclIntNetmask {
    public String aclIntNetmaskToString(String intNetmask) {
        final int bits = 32 - Integer.parseInt(intNetmask);
        final int mask = (bits == 32) ? 0 : 0xFFFFFFFF - ((1 << bits) - 1);

        return Integer.toString(mask >> 24 & 0xFF, 10) + "." +
                Integer.toString(mask >> 16 & 0xFF, 10) + "." +
                Integer.toString(mask >> 8 & 0xFF, 10) + "." +
                Integer.toString(mask & 0xFF, 10);
    }

    @Test
    public void testAclIntNetmaskToString() {
        System.out.println(aclIntNetmaskToString("0"));
    }
}