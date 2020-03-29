package collectionsframework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author yuanjiajun
 * @date 2019/5/24
 * @time 15:28
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //first method
        System.out.println("traverse key & value by Map.keySet");
        for (String key : map.keySet()) {
            System.out.println("key = " + key + " and value = " + map.get(key));
        }
        System.out.println();

        //second method
        System.out.println("traverse key & value by Map.entrySet");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key = "+entry.getKey()+" and value = "+entry.getValue());
        }
        System.out.println();

        //third method
        System.out.println("traverse key & value by Map.entrySet");
        for(Map.Entry<String,String> entry :map.entrySet()){
            System.out.println("key = "+entry.getKey()+" and value = "+entry.getValue());
        }
        System.out.println();

        //fourth method
        System.out.println("traverse all the values by Map.values(),but could not traverse the keies");
        for(String value:map.values()){
            System.out.println("value = "+value);
        }
        System.out.println();
    }
}
