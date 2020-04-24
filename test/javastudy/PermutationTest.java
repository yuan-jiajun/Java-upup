package javastudy;

import java.util.List;

import static org.junit.Assert.*;

public class PermutationTest {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3};
        List<List<Integer>> list = new Permutation().permute(test);
        System.out.println("count: " + list.size());
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }

    }
}