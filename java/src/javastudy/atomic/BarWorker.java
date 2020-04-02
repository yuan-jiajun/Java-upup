package javastudy.atomic;

import java.util.concurrent.TimeUnit;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/1 12:59
 */
public class BarWorker implements Runnable {

    private String name;
    private static boolean exists = false;

    public BarWorker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (!exists) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            exists = true;
            System.out.println(name + ":enter");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + ":leave");
            exists = false;
        } else {
            System.out.println(name + ":give up");
        }
    }

    public static void main(String[] args) {
        BarWorker bar1 = new BarWorker("bar1");
        BarWorker bar2 = new BarWorker("bar2");
        new Thread(bar1).start();
        new Thread(bar2).start();

    }
}