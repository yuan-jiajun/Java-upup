package javastudy.myhashmap;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/3/29 23:30
 */
public class MainActivity {

    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map1 = new MyHashMap<Integer, Integer>();
        MyHashMap<String, String> map2 = new MyHashMap<String, String>();

        map1.put(1, 2000);
        map1.put(48, 3000);
        map1.put(99, 4000);
        map1.put(149, 5000);
        showlog("key=1  value=" + map1.get(1));
        showlog("key=48  value=" + map1.get(48));
        showlog("key=99  value=" + map1.get(99));
        showlog("key=149  value=" + map1.get(149));
        showlog("key=255  value=" + map1.get(255)); //不存在这个Key

        map2.put("index1", "Android");
        map2.put("index2", "Java");
        map2.put("index3", "Development");
        map2.put("index4", "HashMap");
        showlog("key=index1  value=" + map2.get("index1"));
        showlog("key=index2  value=" + map2.get("index2"));
        showlog("key=index3  value=" + map2.get("index3"));
        showlog("key=index4  value=" + map2.get("index4"));
        showlog("key=index5  value=" + map2.get("index5")); //不存在这个Key
    }

    private static void showlog(String info) {
        System.out.print(info + "\n");
    }
}