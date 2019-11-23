package test;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/11/22 22:26
 */
public class stringlist_test {

    private String[] str = {"a", "b", "c", "d", "e"};
    private String[] str2 = new String[5];

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        String[] string = {"yuan","jiajun"};
        list.add(Arrays.toString(string));
        System.out.println(list.get(0));

        StringBuffer string_buffer = new StringBuffer();
        StringBuilder string_builder = new StringBuilder();
        String string_reader_tmp = null;
        string_reader_tmp = "null";
        string_buffer=null;
        string_buffer.append(string_reader_tmp);
        System.out.println(string_buffer.toString());
        string_builder.append(string_reader_tmp);
        System.out.println(string_builder.toString());
    }

}