package newcoder.date20200323;

import java.util.Scanner;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/23 23:42
 */
public class Main {
    public static void main(String[] args) {
        int difference;
        difference = calcDifference();
        System.out.println(difference);
    }

    public static int calcDifference() {
        int difference = 0;
        Scanner in = new Scanner(System.in);
        int length1 = in.nextInt();
        int[] music1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            music1[i] = in.nextInt();
        }
        int length2 = in.nextInt();
        int[] music2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            music2[i] = in.nextInt();
        }

        String musicString1 = "";
        String musicString2 = "";
        StringBuffer sb = new StringBuffer();
        for (int i : music1) {
            sb.append(i).append(",");
        }
        musicString1 = sb.toString();
        sb = new StringBuffer();
        for (int i : music2) {
            sb.append(i).append(",");
        }
        musicString2 = sb.toString();
        if (musicString2.contains(musicString1))
            return difference;

        int[] music3 = new int[length1];
        for (int i = 0; i < music2.length - music1.length; i++) {
            int k = 0;
            int tmpDif = 0;
            for (int j = i; j < music1.length + i; j++) {
                music3[k] = music2[j];
                k++;
            }

            for (int m = 0; m < music1.length; m++) {
                tmpDif += ((music1[m] - music3[m]) * (music1[m] - music3[m]));
            }

            if (i == 0) {
                difference = tmpDif;
            }
            if (tmpDif < difference) {
                difference = tmpDif;
            }
        }
        return difference;
    }

}
