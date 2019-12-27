package parsetool;
import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Publication> list= new ArrayList<Publication>();
        list = ParseTool.getParserAuthor();
        for(int i=0;i<list.size();i++)
        {
            if (list.get(i)!=null)
                WriteToMysql.writeToMysql(list.get(i));
        }
    }
}
