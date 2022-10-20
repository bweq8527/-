package Dao;

import Bean.User;
import JDBC.JDBC_Utils;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class UserDao_Imp implements UserDao
//接口的实现
{
    /**访问数据库需要创建
    Connection 连接对象
     Statement 运行环境对象
     Resultset 结果集对象
     */
    Connection connection= JDBC_Utils.get_a_Connection();
    Statement statement=JDBC_Utils.set_a_Statement(connection);


    @Override
    public int LogIn(User USER_INFO)
    {
        //创建预编译环境
        PreparedStatement pre_statement=null;

        try
        {
            /**
             * 这段代码是用setString()方法修改SQL语句空缺部分，但是由于未知原因无法运行
             */
//            String SQL_sentence_UserLogIn="SELECT type FROM user_info WHERE u_name=? AND u_pass=? ";
//                    //这个语句的意思是，查询满足“uname是？，且upass是？”的“type”的值（？是可变字符串）
//            pre_statement = connection.prepareStatement(SQL_sentence_UserLogIn);
//
//            System.out.println("@Test:User_Info.getName()="+USER_INFO.getName());
//            System.out.println("@Test:User_Info.getPassword()="+USER_INFO.getPassword());
//            System.out.println("@Test:SQL_sentence="+SQL_sentence_UserLogIn);
//
//            pre_statement.setString(1,USER_INFO.getName());
//            pre_statement.setString(2,USER_INFO.getPassword());
//
//            System.out.println("@Test:SQL_sentence="+SQL_sentence_UserLogIn);

            /**
             * 改为以下代码
             */
            String SQL_sentence_UserLogIn=
                    "SELECT type FROM user_info WHERE u_name = '"+
                            USER_INFO.getName()+"' AND u_pass = '"+
                            USER_INFO.getPassword()+"'";
//            System.out.println("@Test:User_Info.getName()="+USER_INFO.getName());
//            System.out.println("@Test:User_Info.getPassword()="+USER_INFO.getPassword());
//            System.out.println("@Test:SQL_sentence="+SQL_sentence_UserLogIn);
            pre_statement=connection.prepareStatement(SQL_sentence_UserLogIn);

            /**
             * SQL语句中一定不能忘记单引号，52至54行被注释代码检查出了这个错误！
             */

            //结果集为Type的值，为1表示管理员，0表示普通用户
            ResultSet res=pre_statement.executeQuery(SQL_sentence_UserLogIn);

            while(res.next())
                return res.getInt("type");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBC_Utils.close(connection,pre_statement,null);
        }

        return -1;
    }

    @Override
    public boolean AddInfo(User USER_INFO)
    {
        //创建环境
        PreparedStatement pre_statement=null;

        try
        {
            String SQL_sentence_UserAdd=
                    "INSERT INTO user_info (id,u_name,u_pass,type)\n" +
                            "VALUES(7,'user6','asdqwe',0);";

            pre_statement=connection.prepareStatement(SQL_sentence_UserAdd);
            int res=pre_statement.executeUpdate(SQL_sentence_UserAdd);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBC_Utils.close(connection,pre_statement,null);
        }
        return false;
    }

    @Override
    public boolean DeleteInfo(String uname) {
        return false;
    }

    @Override
    public boolean ModifyInfo(String uname) {
        return false;
    }

    @Override
    public User QueryInfo(String uname) {
        return null;
    }
}
