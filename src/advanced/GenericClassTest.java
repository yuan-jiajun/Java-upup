package advanced;

/**
 * @author yuanjiajun
 * @date 2019/5/24
 * @time 19:04
 */
public class GenericClassTest<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericClassTest<Integer> integerGenericClassTest = new GenericClassTest<Integer>();
        GenericClassTest<String> stringGenericClassTest = new GenericClassTest<String>();

        integerGenericClassTest.add(10);
        stringGenericClassTest.add("菜鸟教程");

        System.out.printf("整型值为 :%d\n\n", integerGenericClassTest.get());
        System.out.printf("字符串为 :%s\n", stringGenericClassTest.get());
    }
}
