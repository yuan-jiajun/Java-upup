package advanced;

/**
 * @author yuanjiajun
 * @date 2019/5/30
 * @time 9:57
 */
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
