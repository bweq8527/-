package Tests;

import JDBC.*;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_JDBCUtils
{
    static
    {
        System.out.println("Tests about <JDBC_Utils.class>");
        System.out.println("------------------------------\n\n");
    }
    @Test
    public static void test_query()throws Exception
    {
        //创建连接、运行环境
        Connection conn = JDBC_Utils.get_a_Connection();
        Statement statement=conn.createStatement();

        //创建结果集并对结果集中的数据进行处理
        System.out.println("TEST 1       Query All Information:\n\n");
        //测试查询语句，查所有信息表
        //职员信息表
            ResultSet res1 = statement.executeQuery("SELECT * FROM staff_info;");//建立结果集，收集查询语句的结果

            System.out.println("\n--------STAFF INFORMATION--------\n");
            System.out.println("ID\t\t\tName\t\t\tAchievement\t\t\tSalary\n");
            while (res1.next())
            {
                System.out.print(res1.getInt("Staff_ID") + "\t\t\t");
                System.out.print(res1.getString("Staff_name") + "\t\t\t");
                System.out.print(res1.getFloat("Staff_achievement") + "\t\t\t");
                System.out.print(res1.getFloat("Staff_salary") + "\t\t\t\n");
            }

        //客户信息表
            ResultSet res2 = statement.executeQuery("SELECT * FROM custom_info;");//建立结果集，收集查询语句的结果

            System.out.println("\n--------CUSTOM INFORMATION--------\n");
            System.out.println("ID\t\t\tName\t\t\tAddress\t\t\tTel\t\t\tProduct ID\t\t\tProduct number\n");
            while (res2.next())
            {
                System.out.print(res2.getInt("Custom_ID") + "\t\t\t");
                System.out.print(res2.getString("Custom_name") + "\t\t\t");
                System.out.print(res2.getString("Custom_addr") + "\t\t\t");
                System.out.print(res2.getString("Custom_tel") + "\t\t\t");
                System.out.print(res2.getInt("Custom_Prod.ID") + "\t\t\t");
                System.out.print(res2.getFloat("Custom_Prod.num") + "\t\t\t\n");
            }

        //交易单据信息表
            ResultSet res3 = statement.executeQuery("SELECT * FROM trade_info;");//建立结果集，收集查询语句的结果

            System.out.println("\n--------TRADING DOCUMENTS INFORMATION--------\n");
            System.out.println("ID\t\t\tStaff ID\t\t\tCustom ID\t\t\tProduct ID\t\t\tIN/OUT Deport\n");
            while (res3.next())
            {
                System.out.print(res3.getInt("ID") + "\t\t\t");
                System.out.print(res3.getInt("Trade_staff.ID") + "\t\t\t");
                System.out.print(res3.getInt("Trade_custom.ID") + "\t\t\t");
                System.out.print(res3.getInt("Trade_product.ID") + "\t\t\t");
                System.out.print(res3.getByte("IN_OR_OUT") + "\t\t\t\n");
            }


        //释放资源
        JDBC_Utils.close(conn,statement,res1);
        JDBC_Utils.close(conn,statement,res2);
        JDBC_Utils.close(conn,statement,res3);

    }
}
