package runoob2nd.demos2;

import runoob2nd.demos1.keywords.Protected;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/10 22:24
 */
public class Protected2 extends Protected {
    public static void main(String args[]) throws CloneNotSupportedException {
        Protected2 protectedKeyword2 = new Protected2();
        protectedKeyword2.clone();   // Compile OK
    }
}