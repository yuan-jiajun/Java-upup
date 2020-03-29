package collectionsframework.map.hashmap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/19 9:38
 */
public class HashMapConflictKey {
    @Test
    public void testMapConflictKey() {
        Map<String, String> hahsMap = new HashMap<String, String>();

        hahsMap.put("1", "yuan");
        hahsMap.put("2", "jia");
        hahsMap.put("3", "jun");
        hahsMap.put("3", "jun2");
//        hahsMap.remove("3","jun");
//        hahsMap.remove("3","jun2");


        for (Map.Entry<String, String> entry : hahsMap.entrySet()) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }
    }
}
