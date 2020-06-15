package annotation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/6/15 22:48
 */

@MyAnnotation(name = "class", id = 0, gid = Long.class) //类成员注解//使用了类注解
public class UserAnnotation {
    @MyAnnotation(name = "variable", id = 1, gid = Long.class) //类成员注解
    private Integer age;

    @MyAnnotation(name = "construct", id = 2, gid = Long.class)//构造方法注解
    public UserAnnotation() {

    }

    @MyAnnotation(name = "public method", id = 3, gid = Long.class) //类方法注解
    public void a() {
        @MyAnnotation(name = "local variable", id = 3, gid = Long.class)//使用了局部变量注解
                Map m = new HashMap(0);
    }

    @MyAnnotation(name = "protected method", id = 4, gid = Long.class) //类方法注解
    protected void b(@MyAnnotation(name = "method variable", id = 5, gid = Long.class) Integer a) { //使用了方法参数注解
    }

    @MyAnnotation(name = "private method", id = 5, gid = Long.class) //类方法注解
    private void c() {
        Map<String, String> m = new HashMap<String, String>(0);
    }

    public void d(Integer a) {
    }
}


