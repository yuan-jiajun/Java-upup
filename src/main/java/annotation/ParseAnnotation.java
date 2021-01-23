package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/6/15 23:44
 */
public class ParseAnnotation {
    /**
     * 简单打印出UserAnnotation 类中所使用到的类注解
     * 该方法只打印了 Type 类型的注解
     * @throws ClassNotFoundException
     */

    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("annotation.UserAnnotation");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            MyAnnotation myAnnotation = (MyAnnotation) annotation;
            System.out.println("id= \"" + myAnnotation.id() + "\"; name= \"" + myAnnotation.name() + "\"; gid = " + myAnnotation.gid());
        }
    }

    /**
     * 简单打印出UserAnnotation 类中所使用到的方法注解
     * 该方法只打印了 Method 类型的注解
     *
     * @throws ClassNotFoundException
     */
    public static void parseMethodAnnotation() {
        Method[] methods = UserAnnotation.class.getDeclaredMethods();
        for (Method method : methods) {
            /*
             * 判断方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = method.isAnnotationPresent(MyAnnotation.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("method = " + method.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }

    /**
     * 简单打印出UserAnnotation 类中所使用到的方法注解
     * 该方法只打印了 Method 类型的注解
     *
     * @throws ClassNotFoundException
     */
    public static void parseConstructAnnotation() {
        Constructor[] constructors = UserAnnotation.class.getConstructors();
        for (Constructor constructor : constructors) {
            /*
             * 判断构造方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = constructor.isAnnotationPresent(MyAnnotation.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                MyAnnotation annotation = (MyAnnotation) constructor.getAnnotation(MyAnnotation.class);
                System.out.println("constructor = " + constructor.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotation();
        System.out.println();
        parseMethodAnnotation();
        System.out.println();
        parseConstructAnnotation();
    }
}