package grammar.assert_;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/12/29 20:41
 */
public class Main {
    public static void main(String[] args) {
//        double x = Math.abs(-123.45);
        int x = -1;
//        assert x >= 0;
        assert x >= 0 : "x must >= 0";
        System.out.println(x);
    }
}
