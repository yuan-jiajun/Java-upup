package runoob2nd.demos1;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/9 22:14
 */
public class Person {
    public static void println(String s) {
        System.out.println(s);
    }

    Person() {
        println("父类·无参数构造方法： " + "A Person.");
    }//构造方法(1)

    Person(String name) {
        println("父类·含一个参数的构造方法： " + "A person's name is " + name);
    }//构造方法(2)
}

class Chinese extends Person {
    Chinese() {
//        super(); // 调用父类构造方法（1）
        super(); // 调用父类构造方法（1）
        println("子类·调用父类”无参数构造方法“： " + "A Chinese.");
    }

    Chinese(String name) {
        super(name);// 调用父类具有相同形参的构造方法（2）
        println("子类·调用父类”含一个参数的构造方法“： " + "Her name is " + name);
    }

    Chinese(String name, int age) {
//        this(name, age);//非法构造器，会recursive constructor invocation
        this(name);// 调用具有相同形参的构造方法（3）
        this.test();
        println("子类：调用子类具有相同形参的构造方法：Her age is " + age);
    }

    public void test() {
        println("test");
    }

    public static void main(String[] args) {
        Chinese cn = new Chinese();
        println("==========11===========");
        cn = new Chinese("yuanjiajun");
        println("===========22==========");
        cn = new Chinese("qinsuqi", 16);
    }

    Integer a=Integer.valueOf(1);
}