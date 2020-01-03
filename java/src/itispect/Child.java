package itispect;

import org.junit.Test;

import java.util.*;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/28 22:28
 */
public class Child extends Parent {
//    Map<String, String> map = new HashMap<String, String>();
//
//    public void setMap() {
//        String yuan = "yuan";
//        map.put("yuan", yuan);
//    }

    public Map<String, ConfigLocateStruct> map2 = new HashMap<String, ConfigLocateStruct>();
    private List<ConfigLocateStruct> lists = new ArrayList<ConfigLocateStruct>();

    public void add(ConfigLocateStruct configLocateStruct) {
        map2.put(configLocateStruct.getVariableName(), configLocateStruct);
    }

    public void setMap() {
//        lists.add(new ConfigLocateStruct("serialNum", new String[]{"yuan"}, new String[]{"jia"},
//                "regex", new String[]{"jun"}, 1));
//        lists.add(new ConfigLocateStruct("serialNum2", new String[]{"yuan"}, new String[]{"jia"},
//                "regex", new String[]{"jun"}));
//        lists.add(new ConfigLocateStruct("serialNum3", new String[]{"yuan"},new String[]{"jia"},
//                "regex"));
//        lists.add(new ConfigLocateStruct("serialNum4", new String[]{"yuan"},
//                "regex"));
//        lists.add(new ConfigLocateStruct("serialNum5", new String[]{"yuan"}, new String[]{"jia"},
//                "regex", new String[]{"jun"}));

        add(new ConfigLocateStruct("serialNum", new String[]{"yuan"}, new String[]{"jia"},
                "regex", new String[]{"jun"}, 1));
        add(new ConfigLocateStruct("serialNum2", new String[]{"yuan"}, new String[]{"jia"},
                "regex", new String[]{"jun"}));
        add(new ConfigLocateStruct("serialNum3", new String[]{"yuan"}, new String[]{"jia"},
                "regex"));
        add(new ConfigLocateStruct("serialNum4", new String[]{"yuan"},
                "regex"));
        add(new ConfigLocateStruct("serialNum5", new String[]{"yuan"}, new String[]{"jia"},
                "regex", new String[]{"jun"}));

        for (ConfigLocateStruct list : lists) {
            add(list);
        }
//        map2.put(configLocateStruct.getVariableName(), configLocateStruct);
//        add(new ConfigLocateStruct("serialNum2", new String[]{}, ""));
//        add(new ConfigLocateStruct("serialNum3", new String[]{}, ""));
    }

    @Test
    public Map<String, ConfigLocateStruct> getMap() {
        setMap();
        return map2;
    }

    public static void main(String[] args) {
        Child child = new Child();
        Map map = child.getMap();
        System.out.println();
    }

}