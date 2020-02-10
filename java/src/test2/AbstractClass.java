package test2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/7 17:10
 */
public class AbstractClass {
    public static void main(String[] args) {
        Computer computer = new Computer(); //创建
        Camera camera1 = new Camera(); //创建Camera
        Phone phone1 = new Phone(); //创建Phone
        computer.useUsb(camera1); //使用computer中的定义的useUsb方法,并把对象camera1传递给形参
        computer.useUsb(phone1);//使用computer中的定义的useUsb方法,并把对象phone1传递给形参

    }

}

//定义一个接口,在接口中声明了两个方法
interface Usb {
    public static final int a = 3;

    public void start();

    public void stop();
}

//    编写照相机类,并实现Usb接口 —— implements是实现的意思
//    一个重要的原则,当一个类实现了一个接口,就要求该类把这个接口的所有方法统统实现

class Camera implements Usb {
    @Override
    public void start() {
        System.out.println("我是相机,我开始工作了");
    }

    @Override
    public void stop() {
        System.out.println("我是相机,我停止工作了");
    }
}

class Phone implements Usb {
    public void start() {
        System.out.println("我是手机,我开始工作了");
    }

    public void stop() {
        System.out.println("我是手机,我停止工作了");
    }
}

class Computer {
    public void useUsb(Usb usb)//前面的是Usb接口 后面的是局部变量usb
    {
        usb.start(); //让形参usb,调用Usb接口中的start方法
        usb.stop();  //让形参usb,调用Usb接口中的stiop方法
    }
}