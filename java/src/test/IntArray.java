package test;

import java.util.Arrays;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/11/24 14:29
 */
public class IntArray {
    private int[] resulte_locate_count;

    public int[] getResulte_locate_count() {
        return resulte_locate_count;
    }

    public void setResulte_locate_count(int[] resulte_locate_count) {
        this.resulte_locate_count = resulte_locate_count;
    }

    public static void main(String[] args) {
        IntArray test = new IntArray();
        test.setResulte_locate_count(new int[]{});
        int[] resulte_locate_counts = test.getResulte_locate_count();
        for (int resulte_locate_count : resulte_locate_counts) {
            System.out.println("=========");
            System.out.println(resulte_locate_counts[resulte_locate_count]);
        }
//        System.out.println(Arrays.toString(resulte_locate_count));

        int arrys[] = new int[]{19};
        for (int arry : arrys) {
            System.out.println("arry:" + arry);
        }


        String[] aclNumber_line_locate = new String[]{"yuanjiajun"};
        System.out.println(Arrays.toString(aclNumber_line_locate));
        String test2 = new String("yuanjiajunshiwo");
        boolean contain = test2.contains(Arrays.toString(aclNumber_line_locate));
        System.out.println("contain:" + contain);
        String test3 = new String("YUAN");
        boolean contain2 = test2.contains(test3);
        System.out.println("contain2:" + contain2);

    }
}