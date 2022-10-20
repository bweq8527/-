package Controller;

import Dao.UserDao_Imp;
import Bean.*;
import Views.IndexView;
import Views.LoadView;


public class Ctrl_LogIn_Logic
//检测登录操作是否成功
//成功则会返回0或1，不成功返回-1
{
    public static int Logic_LogIn(User USER_INFO)
    {

        //实例化一个UserDao_Imp对象用于实现各种由SQL语句实现的功能（）
        UserDao_Imp SQL_Opera = new UserDao_Imp();
        int flag_log_in =SQL_Opera.LogIn(USER_INFO);

        return flag_log_in;
    }


    public static User Logic_Type_Judge(User USER_INFO)
    //检测用户权限从而决定切换至某界面
    {
        switch (Logic_LogIn((USER_INFO)))
        {
            case -1:
            {
                System.out.println("----------------Load Failed----------------");
                System.out.println("Please Check Username or Password");
                return IndexView.IndexView();
                //无法登录，回调至输入用户名和密码
            }
            case 1:
            {
                System.out.println("----------------Load As MANAGER:----------------");
                LoadView.Load_Manager_View(USER_INFO);
                return USER_INFO;
                //以管理员身份登录成功
            }
            case 0:
            {
                System.out.println("----------------Load As USER:----------------");
                LoadView.Load_User_View(USER_INFO);
                return USER_INFO;
                //以普通用户身份登录成功
            }

            default:return USER_INFO;
        }

    }

    public static void Logic_NextOpera(String next_opera,User USER_INFO)
    {
        if(next_opera.equals("Y"))
        {
            System.out.println("Loading...");
            Logic_Type_Judge(USER_INFO);
        }
        else
            System.out.println("Quiting...");
    }
}
