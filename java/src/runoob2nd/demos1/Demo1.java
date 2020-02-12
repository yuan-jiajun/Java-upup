package runoob2nd.demos1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/9 15:29
 */
class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}

class InnerClass {
    private int age = 12;

    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new In().inPrint();
    }
}

public class Demo1 {
    @Test
    public void testFreshJuice() {
        FreshJuice juice = new FreshJuice();
//        juice.clone();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }

    @Test
    public void testFunctionInnerClass() {
        InnerClass innerClass = new InnerClass();
        innerClass.Print(3);
    }

    @Test
    public void testListSize() {
        List<String> testList = new ArrayList<String>();
        testList.add("yuan");
        for (String testString : testList) {
            System.out.println(testList.size());
        }
    }

    @Test
    public void testInteger() {
        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println(a1 == b1); //true
        System.out.println(a1.equals(b1));  // 输出 true

        Integer a2 = 128;
        Integer b2 = 128;
        System.out.println(a2 == b2); //false
        System.out.println(a2.equals(b2));  // 输出 true

        System.out.println(new Integer(100) == new Integer(100)); //false
        System.out.println(Integer.valueOf(100) == Integer.valueOf(100)); //true

        Integer int1 = 200;
        int int2 = 200;
        System.out.println(new Integer(200) == int1);//false
        System.out.println(int1 == int2);//true
    }
}