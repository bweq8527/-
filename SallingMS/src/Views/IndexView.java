package Views;

import Bean.User;

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

        /*然后询问是否登录，
        确认登录（Y）则跳转到登录后的界面
        拒绝登录（N）则退出
         */
        System.out.println("Load In Now?(Input 'Y' to Load In)");
        String next_opera=Input.nextLine();
        if(next_opera.equals("Y"))
        {
            System.out.println("Loading...");
            LoadView.Type_Judge(USER_INFO);
        }
        else
            System.out.println("Quiting...");

        return USER_INFO;
    }
}
