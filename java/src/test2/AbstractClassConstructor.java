package test2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/16 20:49
 */
public class AbstractClassConstructor {
    public static void main(String[] args) {
        BigDogs a = new BigDogs();
        a.move();
    }
}

abstract class Animal {
    private int age = 10;

    public Animal(int age) {
        this.age = age;
        System.out.println("初始化Animal11111111");
    }

    public Animal() {
        System.out.println("初始化Animal222222222");
    }

    public void move() {
        System.out.println("跑步数：" + this.age);
    }
}

abstract class Dog extends Animal {
    public Dog(int age) {
        super(age);//去掉会报异常
        System.out.println("初始化Dog");
    }
}

class BigDogs extends Dog {
    public BigDogs() {
        super(20);
        System.out.println("初始化BigDog");
    }
}

