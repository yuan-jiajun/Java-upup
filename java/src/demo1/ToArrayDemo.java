package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/17 18:13
 */
public class ToArrayDemo {
    public static void main(String[] args) {
        String[] toArrayResults;
        String[] blockContainedRegex = new String[]{"yuan", "jia", "jun"};
//        String[] blockExclusiveRegex=new String[]{"yuan","jia","jun"};
        String[] blockExclusiveRegex = new String[]{"is", "me"};

        List<String> list = new ArrayList<String>(Arrays.asList(blockContainedRegex));
        list.addAll(Arrays.asList(blockExclusiveRegex));

//下面2行代码都不能正确运行
//        toArrayResults = list.toArray();
//        toArrayResults = (String[]) list.toArray();

//        方法1
//        toArrayResults = list.toArray(new String[20]);

//        方法2
        Object[] toArrayResultsObject = list.toArray();
        toArrayResults = Arrays.copyOf(toArrayResultsObject, toArrayResultsObject.length, String[].class);

        for (String toArrayResult : toArrayResults) {
            System.out.print(toArrayResult + " ");
        }
    }
}