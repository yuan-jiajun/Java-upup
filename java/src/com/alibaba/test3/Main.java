package com.alibaba.test3;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/31 15:34
 */
public class Main {
    public static void main(String[] args) {
        double tmp[] = new double[10];
        double min = 0;
        double mintmp = 0;
        int res = 0;
        boolean flag = true;
        for (int x = 0; x <= 210; x++) {
            mintmp = 0;
            tmp[0] = 0.1 * Math.abs(x - 1);
            tmp[1] = 0.1 * Math.abs(x - 9);
            tmp[2] = 0.15 * Math.abs(x - 20);
            tmp[3] = 0.05 * Math.abs(x - 31);
            tmp[4] = 0.05 * Math.abs(x - 90);
            tmp[5] = 0.1 * Math.abs(x - 110);
            tmp[6] = 0.15 * Math.abs(x - 180);
            tmp[7] = 0.15 * Math.abs(x - 190);
            tmp[8] = 0.05 * Math.abs(x - 200);
            tmp[9] = 0.1 * Math.abs(x - 210);
            for (int i1 = 0; i1 < tmp.length; i1++) {
                mintmp += tmp[i1];
            }
            if (flag) {
                min = mintmp;
                flag = false;
            }
            if (mintmp < min) {
                min = mintmp;
                res = x;
            }
        }
        System.out.println(res);

    }
}