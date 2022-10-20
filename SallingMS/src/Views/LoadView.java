package Views;

import Bean.*;

import java.util.Scanner;

public class LoadView
{
    private static Scanner Input= new Scanner(System.in);
    //用Input获取键盘输入

    static
    {
        System.out.println("----------------Welcome!-----------------");
    }


    public static void Type_Judge(User USER_INFO)
    //检测用户权限
    {

        if(USER_INFO.isType())
        {
            System.out.println("----------------Load As MANAGER:----------------");
            Load_Manager_View(USER_INFO);
        }
        else
        {
            System.out.println("----------------Load As USER:----------------");
            Load_User_View(USER_INFO);
        }
    }

    public static User Load_Manager_View(User USER_INFO)
    {
        System.out.println("\n\nPlease Select Function And Input A/B/C or D:");
        String Controller=Input.nextLine();
        //储存用户选择的功能

        System.out.println("-----------------------------\n"+"@Test:Controller is:"+Controller);

        if(Func_Select_1.Contains(Controller))
        //判断程序是否提供用户选择的功能，如果不支持功能则回调
        {
            System.out.println("-----------------------------");
            switch (Func_Select_1.Value(Controller))
            {
                case A:{System.out.println("Turn to A:Add Message");break;}
                case B:{System.out.println("Turn to B:Delete Message");break;}
                case C:{System.out.println("Turn to C:Query Message");break;}
                case D:{System.out.println("Turn to D:Modify Message");break;}
            }
            return USER_INFO;
        }
        else
        {
            System.out.println("\n-----------------------------\n"+"Sorry , The Function You Selected Is False");
            return Load_User_View(USER_INFO);//功能不支持，回调，让用户重新输入
        }
    }
    public static User Load_User_View(User USER_INFO)
    {

        System.out.println("\n\nPlease Select Function And Input A/B/C or D:");
        String Controller=Input.nextLine();
        //储存用户选择的功能

        System.out.println("-----------------------------\n"+"@Test:Controller is:"+Controller);

        if(Func_Select_1.Contains(Controller))
        //判断程序是否提供用户选择的功能，如果不支持功能则回调
        {
            System.out.println("-----------------------------");
            switch (Func_Select_1.Value(Controller))
            {
                case A:{System.out.println("Turn to A:Add Message");break;}
                case B:{System.out.println("Turn to B:Delete Message");break;}
                case C:{System.out.println("Turn to C:Query Message");break;}
                case D:{System.out.println("Turn to D:Modify Message");break;}
            }
            return USER_INFO;
        }
        else
        {
            System.out.println("\n-----------------------------\n"+"Sorry , The Function You Selected Is False");
            return Load_User_View(USER_INFO);//功能不支持，回调，让用户重新输入
        }
    }
}
