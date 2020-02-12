package runoob2nd.demos1.keywords;

import runoob2nd.demos2.Protected2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/10 22:22
 */
public class Protected {
    public static void main(String args[]) throws CloneNotSupportedException {
        Protected2 protectedKeyword2 = new Protected2();
        protectedKeyword2.clone();   // Compile OK
    }
}