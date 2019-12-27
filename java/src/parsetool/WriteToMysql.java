package parsetool;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteToMysql {
    static String sqlStr = "jdbc:mysql://localhost:3306/Publications";
    static String rootName = "root";//数据库名
    static String rootPwd = "root";//数据库密码

    public static void writeToMysql(Publication publication) {
        System.out.println(publication);
        //1.加载driver驱动
        try {
            // 加载MySql的驱动类
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace();
        }
        //2.建立连接
        Statement st = null;
        //调用DriverManager对象的getConnection()方法，获得一个Connection对象
        Connection con  =null;
        try {
            //建立数据库连接
            con = DriverManager.getConnection(sqlStr, rootName,rootPwd);
            //INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
            String paperId= publication.getId();
            String authors = publication.getAuthors();
            //插入语句格式
            String sql = "insert into publication1(paperId,Authors) values(\""+paperId+"\",\""+authors+"\")";
            System.out.println(sql);
            st = (Statement) con.createStatement(); //创建一个Statement对象
            st.executeUpdate(sql);//提交数据更新
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
