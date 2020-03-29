package javastudy.sequenceofnewclass1;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/29 17:24
 */

public class Son extends Father {

    int b1 = 0;
    int b2 = getSon();

    {
        int b3 = 5;
        System.out.println("top of B() b1=" + b1 + " b2=" + b2 + " b3=" + b3);
    }

    public Son() {
        this(33);
//         super(44);//添加super语句，会导致实例化时直接执行父类带参数的构造函数
        System.out.print("B 构造函数\n");
    }

    public Son(int num) {
        // 添加super语句，会导致实例化时直接执行父类带参数的构造函数
        // 前提是带参数的构造函数B会被运行（new实例化或this）
        // super(77);

        System.out.print("B 带参数构造函数:" + num + "\n");
    }

    {
        System.out.println("below B()..has start");
    }

    static {
        System.out.println("I`m a static {} from class B..");
    }

    int getSon() {
        System.out.println("getSon..");
        return 33;
    }

    @Override
    public void methodFather() {
        System.out.println("methodFather in class Son");
        super.methodFather();
    }
}