package runoob2nd.demos1;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/11 23:37
 */
public class StringAbstractClassTest {
    @Test
    public void tstString() {
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}