package job.base.abstractClassAndInterface;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/6/30 0:25
 */
public abstract class AbstractClassTest {
    private int a;
    protected int b;
    public int c;
    int d;
    private static int e;


    abstract int geta(); //不能有方法体，不能用private

    protected abstract int getb();

    static void fun1() {
        System.out.println("静态方法");
    }

    private void fun() {
        System.out.println("私有普通方法");
    }

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("代码块");
    }

    public AbstractClassTest() {
        System.out.println("构造函数");
    }

}