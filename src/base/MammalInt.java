package base;

/**
 * @author yuanjiajun
 * @date 2019/5/23
 * @time 15:28
 */
public class MammalInt implements Animal {
    public int a = 200;

    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        System.out.println(m.a);
    }
}
