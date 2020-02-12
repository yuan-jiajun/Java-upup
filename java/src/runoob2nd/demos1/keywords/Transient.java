package runoob2nd.demos1.keywords;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/11 17:21
 */

//当对象被序列化时（写入字节序列到目标文件）时，transient阻止实例中那些用此关键字声明的变量持久化；
// 当对象被反序列化时（从源文件读取字节序列进行重构），这样的实例变量值不会被持久化和恢复。
public class Transient {//定义一个需要序列化的类

    @Test
    public void testTransient() throws FileNotFoundException, IOException, ClassNotFoundException {
        People a = new People("李雷", 30);
        System.out.println(a); //打印对象的值
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("resource//iofolder//testTransient.txt"));
        os.writeObject(a);//写入文件(序列化)
        os.close();
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("resource//iofolder//testTransient.txt"));
        a = (People) is.readObject();//将文件数据转换为对象（反序列化）
        System.out.println(a); // 年龄 数据未定义
        is.close();
    }
}

class People implements Serializable {
    private String name; //姓名
    private transient Integer age; //年龄

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "姓名 = " + name + " ,年龄 = " + age;
    }
}


