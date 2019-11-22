package getclassname;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/11/21 17:32
 */
public class getclassname {
        public static void main(String[] args)
        {
            List<Account> list = new LinkedList<Account>(); //int类型变量
            System.out.println(getType(list)); //打印变量类型为int
        }
        public static String getType(Object o){ //获取变量类型方法
            return o.getClass().toString(); //使用int类型的getClass()方法
        }

}