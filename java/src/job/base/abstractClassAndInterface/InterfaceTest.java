package job.base.abstractClassAndInterface;

public interface InterfaceTest {
    public static int a = 1;       //常量

    void fun();     //抽象方法

    default void fun1() {
//        System.out.println("默认方法");
    }

    public static void fun2() {
        System.out.println("静态方法");
    }
}
