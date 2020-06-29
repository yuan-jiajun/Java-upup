package utils;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/25 0:15
 */
public class QuikSort {

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start + 1;
            int high = end;
            while (true) {
                while (low < end && data[low] <= base)
                    low++;
                while (high > start && data[high] >= base)
                    high--;

                if (low < high) {
                    System.out.println(java.util.Arrays.toString(data) +
                            "low_high_swap_old_low: " + low + " low_high_swap_old_high: " + high);
                    swap(data, low, high);
                    System.out.println(java.util.Arrays.toString(data) +
                            "low_high_swap_new_low: " + low + " low_high_swap_new_high: " + high);
                } else {
                    break;
                }
            }
            System.out.println(java.util.Arrays.toString(data) +
                    "start_high_swap_old_low: " + low + " start_high_swap_old_high: " + high);
            swap(data, start, high);
            System.out.println(java.util.Arrays.toString(data) +
                    "start_high_swap_new_low: " + low + " start_high_swap_new_low: " + high);
            System.out.println("==== " + start + " ====");
            System.out.println("==== " + end + " ====");

            subSort(data, start, high - 1);
            subSort(data, high + 1, end);
        }
    }

    public static void quickSort(int[] data) {
        subSort(data, 0, data.length - 1);
    }


    public static void main(String[] args) {
        int[] data = {10, -16, 30, 23, -30, -49, 25, 21, 30};
        System.out.println(java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println(java.util.Arrays.toString(data));
    }
}