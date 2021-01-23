package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。 方法的名称就是参数的名称，返回值类型就是参数的类型。
 * 可以通过default来声明参数的默认值。
 * 在这里可以看到@Retention和@Target这样的元注解，用来声明注解本身的行为。
 * @Retention用来声明注解的保留策略，有CLASS、RUNTIME和SOURCE这三种， 分别表示注解保存在类文件、JVM运行时刻和源代码中。
 * 只有当声明为RUNTIME的时候，才能够在运行时刻通过反射API来获取到注解的信息。
 * @Target用来声明注解可以被添加在哪些类型的元素上，如类型、方法和域等。  *就可以定义一个注解了，它将自动继承Annotation
 * @Target 表示该注解用于什么地方，可能的值在枚举类 ElemenetType 中，包括：
 *           ElemenetType.CONSTRUCTOR 构造器声明
 *           ElemenetType.FIELD 域声明（包括 enum 实例）
 *           ElemenetType.LOCAL_VARIABLE 局部变量声明
 *           ElemenetType.METHOD 方法声明
 *           ElemenetType.PACKAGE 包声明
 *           ElemenetType.PARAMETER 参数声明
 *           ElemenetType.TYPE 类，接口（包括注解类型）或enum声明
 *           
 *      @Retention 表示在什么级别保存该注解信息。可选的参数值在枚举类型 RetentionPolicy 中，包括：
 *           RetentionPolicy.SOURCE 注解将被编译器丢弃
 *           RetentionPolicy.CLASS 注解在class文件中可用，但会被VM丢弃
 *           RetentionPolicy.RUNTIME VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息。
 *           
 *       @Documented 将此注解包含在 javadoc 中 ，它代表着此注解会被javadoc工具提取成文档。在doc文档中的内容会因为此注解的信息内容不同而不同。相当与@see,@param 等。
 *       
 *       @Inherited 允许子类继承父类中的注解，例子中补充。
 **/

//@Target({TYPE,METHOD,FIELD,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)

/**
 *   @interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。
 *   方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。可以通过default来声明参数的默认值。
 *   */

public @interface MyAnnotation {

    String name();

    int id() default 0;

    Class<Long> gid();

}
