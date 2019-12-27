package hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/19 9:38
 */
public class MapMerge {
    private String key;
    private String value;

    @Test
    public void testMapMerge() {
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();


        map1.put("employee1.getName()", "employee1");
        map1.put("employee2.getName()", "employee2");
        map1.put("employee3.getName()", "employee3");

        map2.put("employee2.getName()", "employee1");
        map2.put("employee4.getName()", "employee2");
        map2.put("employee5.getName()", "employee3");

//        Map<String, String> map3 = new HashMap<>(map1);
        map1.putAll(map2);

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }

    }
}
