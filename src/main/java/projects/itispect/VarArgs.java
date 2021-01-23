package projects.itispect;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/27 22:11
 */
public class VarArgs {
    private void varargs(int... nums) {
        if (nums.length == 0) {
            nums = new int[]{0};
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void varargsTest() {
//        varargs(1, 2);
        varargs();

    }
}