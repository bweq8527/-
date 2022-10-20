package Views;

import Bean.User;
import Controller.Ctrl_LogIn_Logic;
import Dao.*;

import java.util.Scanner;

public class IndexView
{
    private static Scanner Input=new Scanner(System.in);
    //键盘输入

    public static User IndexView()
    {
        //首先引导用户输入用户名和密码
        System.out.println("Please Input Username:");
        String u_name=Input.nextLine();
        System.out.println("Please Input Password:");
        String u_pswd=Input.nextLine();

        User USER_INFO =new User(u_name,u_pswd);

        //然后通过Controller从数据库比对，判断用户名和密码是否匹配，检查登录状态
        Ctrl_LogIn_Logic.Logic_LogIn(USER_INFO);

        /*然后询问是否登录，
        确认登录（Y）则跳转到登录后的界面
        拒绝登录（N）则退出
         */
        System.out.println("Load In Now?(Input 'Y' to Load In)");
        String next_opera=Input.nextLine();

        //用户决定退出系统或登入系统
        //（之后隐式完成的功能：根据用户权限决定下一步的操作（转到管理员界面还是普通用户界面））
        Ctrl_LogIn_Logic.Logic_NextOpera(next_opera,USER_INFO);

        return USER_INFO;
    }
}
