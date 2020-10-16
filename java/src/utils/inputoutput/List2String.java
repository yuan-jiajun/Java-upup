package utils.inputoutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List2String {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("文学", "小说", "历史", "言情", "科幻", "悬疑");
        List<String> list2 = Arrays.asList("文学", "小说", "历史", "言情", "科幻", "悬疑");

        //方案一：使用String.join()函数，给函数传递一个分隔符合一个迭代器，一个StringJoiner对象会帮助我们完成所有的事情
        String string1 = String.join("-", list1);
        System.out.println(string1);

        //方案二：采用流的方式来写
        String string2 = list2.stream().collect(Collectors.joining("-"));
        System.out.println(string2);
    }
}
