package javastudy.sequenceofnewclass2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/29 18:54
 */
public class ChildClazz extends FatherClazz {
    int childOne = 11;
    int childTwo = getChildTwo();

    {
        int childThree = 33;
        System.out.println("childOne:" + childOne + "," + "childTwo: " + childTwo + "," + "childThree:" + childThree);
    }

    public ChildClazz() {
        this(88);
        System.out.println("childClazz's construct function!");
    }

    static int c = 5;

    public ChildClazz(int num) {
        System.out.println("childClazz's construct function with variable : " + num);
    }

    {
        System.out.println("childClazz is starting...");
    }

    static int d = 5;

    public int getChildTwo() {
        System.out.println("Hi, I'm childClazz's getTwo method ...");
        return 22;
    }

    static {
        System.out.println("childClazz static code is running ...");
    }

    @Override
    public void methodFirst() {
        System.out.println("method is childClazz");
        super.methodFirst();
    }
}
