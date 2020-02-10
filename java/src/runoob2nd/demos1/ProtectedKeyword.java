package runoob2nd.demos1;

import runoob2nd.demos2.ProtectedKeyword2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/10 22:22
 */
public class ProtectedKeyword {
    public static void main(String args[]) throws CloneNotSupportedException {
        ProtectedKeyword2 protectedKeyword2 = new ProtectedKeyword2();
        protectedKeyword2.clone();   // Compile OK
    }
}