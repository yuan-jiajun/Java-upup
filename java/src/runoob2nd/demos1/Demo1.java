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

    public void Print(int x) {
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
}