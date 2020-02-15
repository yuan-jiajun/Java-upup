package runoob2nd.demos3;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/15 20:46
 */

class Animal {
    String name;
    int age;
    public Animal() {
        name = "alex";
        age = 1;
    }
    public Animal(String nm, int ag) {
        name = nm;
        age = ag;
    }
    public void getInfo() {
        System.out.print(name + "'s age is " + age + '\n');
    }
    public void getSuperInfo() {
    }
    public static void hello() {
        System.out.println("Greeting from Animal");
    }
}

class Dog extends Animal {
    String name;
    int age;
    public Dog() {
        name = "prter";
        age = 3;
    }
    public Dog(String nm, int ag) {
        super(nm, ag);
    }
    public void getInfo() {
        System.out.print(name + "'s age is " + age + '\n');
    }
    // 通过super显式调用父类的非静态成员方法
    public void getSuperInfo() {
        super.getInfo();
    }
    public static void hello() {
        System.out.println("Greeting from Dog");
    }
}
public class PolymorghpicExtendDemo {
    public static void main(String[] args) {
        System.out.println("Polymorghpic Test");
        Animal a = new Dog();
        Animal b = new Dog("smith", 5);
        Dog c = new Dog();
        // 子类的非静态方法与变量覆盖父类
        a.getInfo();
        // 子类通过super调用父类的非静态成员方法和变量
        a.getSuperInfo();
        // 子类的静态方法被父类隐藏
        a.hello();
        b.getInfo();
        b.hello();
        c.hello();
    }
}

