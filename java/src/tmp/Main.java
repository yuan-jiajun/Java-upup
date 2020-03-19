package tmp;

import java.util.Scanner;

/**
 * @author yuanjiajun
 * @description https://www.nowcoder.com/practice/46eb436eb6564a62b9f972160e1699c9
 * @date 2020/3/19 23:50
 */
public class Main {
    public static void main(String[] args) {
//    @Test
//    public void test(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int[] res = new int[0];
        int[] restmp;
        boolean flag = false;
        for (int i = l; i <= Math.sqrt(n); i++) {
//            Practice1 practice1 = new Practice1();
//            restmp = practice1.getNL(n, i);
            restmp = getNL(n, i);

            if (restmp != null) {
                flag = true;
                res = restmp;
                break;
            }
        }
        if (flag) {
            for (int re : res) {
                System.out.print(re + " ");
            }
        } else {
            System.out.println("No");
        }
    }

    public static int[] getNL(int n, int l) {
        int[] res = new int[l];
        int mid = n / l;
        int start = (int) (Math.floor(mid - l / 2.0) + 1);
        boolean flag = false;

        int count = 0;
        for (int i1 = 0; i1 < res.length; i1++) {
            res[i1] = start;
            count += start;
            start++;
        }
        if (count == n) {
            flag = true;
        }


        if (!flag) {
            return null;
        }
        return res;
    }
}