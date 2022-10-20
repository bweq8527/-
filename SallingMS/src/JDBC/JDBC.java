package JDBC;

import java.sql.*;
import java.io.*;

public class JDBC
{
    public static void jdbc()
    {

          System.out.println("@Test:");
//        try
//        {
//            /*加载MySQL驱动*/
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded Successfully\n");
//
//            /*连接数据库，获得连接对象“con”等*/
//            Connection con = DriverManager.getConnection
//                    ("jdbc:mysql://127.0.0.1:3306/saling_sm?", "root", "ztyydx123");
//            System.out.println("DataBase Collected Successfully\n");
//
//            /*创建执行环境，用于运行SQL语句*/
//            Statement statement = con.createStatement();//创建执行环境
//            //SQL语句，执行增删查改等操作//
//            //练习：查询语句，查所有信息表
//            {//职员信息表
//                ResultSet res1 = statement.executeQuery("SELECT * FROM staff_info;");//建立结果集，收集查询语句的结果
//
//                System.out.println("\n--------STAFF INFORMATION--------\n");
//                System.out.println("ID\t\t\tName\t\t\tAchievement\t\t\tSalary\n");
//                while (res1.next())
//                {
//                    System.out.print(res1.getInt("Staff_ID") + "\t\t\t");
//                    System.out.print(res1.getString("Staff_name") + "\t\t\t");
//                    System.out.print(res1.getFloat("Staff_achievement") + "\t\t\t");
//                    System.out.print(res1.getFloat("Staff_salary") + "\t\t\t\n");
//                }
//            }
//            {//客户信息表
//                ResultSet res2 = statement.executeQuery("SELECT * FROM custom_info;");//建立结果集，收集查询语句的结果
//
//                System.out.println("\n--------CUSTOM INFORMATION--------\n");
//                System.out.println("ID\t\t\tName\t\t\tAddress\t\t\tTel\t\t\tProduct ID\t\t\tProduct number\n");
//                while (res2.next())
//                {
//                    System.out.print(res2.getInt("Custom_ID") + "\t\t\t");
//                    System.out.print(res2.getString("Custom_name") + "\t\t\t");
//                    System.out.print(res2.getString("Custom_addr") + "\t\t\t");
//                    System.out.print(res2.getString("Custom_tel") + "\t\t\t");
//                    System.out.print(res2.getInt("Custom_Prod.ID") + "\t\t\t");
//                    System.out.print(res2.getFloat("Custom_Prod.num") + "\t\t\t\n");
//                }
//            }
//            {//交易单据信息表
//                ResultSet res3 = statement.executeQuery("SELECT * FROM trade_info;");//建立结果集，收集查询语句的结果
//
//                System.out.println("\n--------TRADING DOCUMENTS INFORMATION--------\n");
//                System.out.println("ID\t\t\tStaff ID\t\t\tCustom ID\t\t\tProduct ID\t\t\tIN/OUT Deport\n");
//                while (res3.next())
//                {
//                    System.out.print(res3.getInt("ID") + "\t\t\t");
//                    System.out.print(res3.getInt("Trade_staff.ID") + "\t\t\t");
//                    System.out.print(res3.getInt("Trade_custom.ID") + "\t\t\t");
//                    System.out.print(res3.getInt("Trade_product.ID") + "\t\t\t");
//                    System.out.print(res3.getByte("IN_OR_OUT") + "\t\t\t\n");
//                }
//            }
//
//        }
//        catch (ClassNotFoundException e)//处理驱动加载失败的异常
//        {
//            e.printStackTrace();
//            System.out.println("Driver loaded Failed\n");
//        }
//        catch (Exception e_o)//其他所有异常,包括“SQLSyntaxErrorException”等
//        {
//            e_o.printStackTrace();
//            System.out.println("DataBase Collected Failed\n");
//        }
//
    }
}
