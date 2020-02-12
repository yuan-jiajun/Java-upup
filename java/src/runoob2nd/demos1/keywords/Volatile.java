package runoob2nd.demos1.keywords;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/11 17:03
 */
public class Volatile implements Runnable {
    private volatile boolean active;

    public void run() {
        active = true;
        while (active) // 第一行
        {
            System.out.println("running");
        }
    }

    public void stop() {
        active = false; // 第二行
        System.out.println("stopping");
    }
//    通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），在另一个线程调用 stop() 方法。
//    如果 第一行 中缓冲区的 active 值被使用，那么在 第二行 的 active 值为 false 时循环不会停止。
//    但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。

    @Test
    public void testVolatile() {
        new Thread();//todo 创建线程
    }
}