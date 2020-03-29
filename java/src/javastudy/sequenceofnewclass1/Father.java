package javastudy.sequenceofnewclass1;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/29 17:24
 */
public class Father {
    int a1 = 8;
    int a2 = getFather();

    {
        int a3 = 9;
        System.out.println("top of A() a1=" + a1 + " a2=" + a2 + "  a3=" + a3);
    }

    public Father() {
        this(66);
        System.out.print("A 构造函数\n");
    }

    {
        System.out.println("below A()..has start");
    }

    public Father(int num) {
        System.out.print("A 带参数构造函数: " + num + "\n");
    }

    static {
        System.out.println("I`m a static {} from class A..");
    }

    int getFather() {
        System.out.println("getFather..");
        return 7;
    }

    public void methodFather() {
        System.out.println("methodFather");
    }


}