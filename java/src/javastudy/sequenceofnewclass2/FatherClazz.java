package javastudy.sequenceofnewclass2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/29 18:53
 */
public class FatherClazz {
    int one = 1;
    static int a = 5;
    int two = getTwo();
    static int b = 5;
    int three = 3;
    int four = 4;

    // 静态代码块
    static {
        System.out.println("父类静态代码块被实例化了...");
    }

    static int c = 5;

    // 非静态代码块
    {
        int three = 3;
        System.out.println("FatherOne:" + one + "," + "FatherTwo:" + two + "," + "FatherThree" + three);
    }

    int ppp = 8;

    // 构造函数
    public FatherClazz() {
        this(4);
        System.out.println("父类无参构造函数...");
    }

    public FatherClazz(int num) {
        System.out.println("父类带参数的构造函数..." + num);
    }

    int getTwo() {
        System.out.println("父类getTwo方法...");
        return 2;
    }

    int ppp2 = 8;

    public void methodFirst() {
        System.out.println("Hi,我是methodFirst...");
    }

}