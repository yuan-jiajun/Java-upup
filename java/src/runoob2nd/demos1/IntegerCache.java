package runoob2nd.demos1;

import java.lang.reflect.Field;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/10 16:24
 */
public class IntegerCache {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Integer.class.getDeclaredClasses()[0];
        Field field = clazz.getDeclaredField("cache");
        field.setAccessible(true);
        Integer[] cache = (Integer[]) field.get(clazz);
        cache[132] = cache[133];
        int a = 2;
        int b = a + a;
        System.out.printf("%d+%d=%d", a, a, b);
        System.out.println();
        System.out.println(a + "+" + a + "=" + b);
    }
}