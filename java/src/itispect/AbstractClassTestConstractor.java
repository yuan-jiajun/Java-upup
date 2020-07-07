package itispect;

import org.junit.Test;

/**
 * @author yuanjiajun
 * @description
 * @date 2019/12/27 21:08
 */
public class AbstractClassTestConstractor {
    @Test
    public void testConstractor() {
        ConfigLocateStruct configLocateStruct =
                new ConfigLocateStruct("ip", new String[]{"yuan", "jia", "jun"}, new String[]{"yuan", "jia", "jun"},
                        "yuanjiajun",  new String[]{},1);
        String[] strings = configLocateStruct.getBlockLocateRegex();
        System.out.println(strings.length);
    }
}