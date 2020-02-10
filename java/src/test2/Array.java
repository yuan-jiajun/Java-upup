package test2;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/13 10:00
 */
public class Array extends Thread{

    public static void main(String[] args) {
        String[][] strings = new String[10][12];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings[" + i + "].length=" + strings[i].length);
            for (int j = 0; j < strings[i].length; j++) {
                System.out.println("strings[" + i + "]" + "[" + j + "]"+".length=" + strings[i].length);
            }
        }
        System.out.println(strings.length);
    }

    public void call(){
        start();
    }
}