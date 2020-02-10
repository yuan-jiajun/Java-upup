package runoob2nd.demos2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/10 22:24
 */
public class ProtectedKeyword2 extends runoob2nd.demos1.ProtectedKeyword {
    public static void main(String args[]) throws CloneNotSupportedException {
        ProtectedKeyword2 protectedKeyword2 = new ProtectedKeyword2();
        protectedKeyword2.clone();   // Compile OK
    }
}