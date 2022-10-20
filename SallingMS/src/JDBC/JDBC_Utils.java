package JDBC;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Properties;

public class JDBC_Utils
{
    //封装成员变量
    private static String DRIVER;
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;

    //静态语句块
    static
    {
        //以流的形式读取配置文件

        /*
        JDBC.class              获得对象
        getClassLoader()        类加载器
        getResourceAsStream     以流的形式
        "db.properties"         要载入的文件的名称
        * */
        InputStream i_s =JDBC_Utils.class.getClassLoader().getResourceAsStream("db.properties");

        /*创建 Property 类的变量*/
        Properties p = new Properties();

        /*加载流文件*/
        try
        {
            p.load(i_s);//用p加载读取的文件流

            //提取配置文件中所需信息
            DRIVER=p.getProperty("driver");
            URL= p.getProperty("url");
            USERNAME=p.getProperty("username");
            PASSWORD=p.getProperty("password");

            System.out.println("Property Document loaded Successfully\n");

            try
            {
                //加载MySQL驱动
                Class.forName(DRIVER);
                System.out.println("Driver loaded Successfully\n");

            }
            catch (Exception e)
            {
                e.printStackTrace();
                System.out.println("Driver loaded Failed\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Property Document loaded Failed\n");

        }
    }
    //获得连接对象的方法
    public static Connection get_a_Connection()
    {
        try
        {
            System.out.println("DataBase Collected Successfully\n");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("DataBase Collected Failed\n");
            return null;
        }
    }

    //创建运行SQL语句环境对象的方法
    //(其实是多此一举，connection对象可以直接创建statement对象)
    public static Statement set_a_Statement(Connection connection)
    {
        try
        {
            Statement statement = connection.createStatement();
            return statement;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Statement Creating Failed");
            return null;
        }
    }


    //释放资源的方法
    public static void close(Connection c, Statement s, ResultSet r)
    {
        try
        {
            if(c!=null)c.close();c=null;
            if(s!=null)s.close();s=null;
            if(r!=null)r.close();r=null;
            //创建的 连接对象、运行环境对象、结果集对象，均要先关闭，然后让其指向空，随后被java垃圾回收

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
