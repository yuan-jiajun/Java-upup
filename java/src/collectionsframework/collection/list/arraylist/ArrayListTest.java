package collectionsframework.collection.list.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author yuanjiajun
 * @date 2019/5/24
 * @time 15:20
 */

/*三种方法都是用来遍历ArrayList集合，第三种方法是采用迭代器的方法，该方法可以不用担心在遍历的过程中会超出集合的长度*/

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");

        for (String str : list) {
            System.out.println(str);
        }

        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i <strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        Iterator<String> ite=list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

    }

    @Test
    public  void test() {
        List<String> list = new ArrayList<String>();
        String s=null;
        s="yuan";
        list.add(s);
        s="jia";
        list.add(s);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
