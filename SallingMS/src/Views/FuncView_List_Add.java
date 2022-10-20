package Views;

import Bean.*;

import java.util.Scanner;

public class FuncView_List_Add
{
    private static Scanner Input= new Scanner(System.in);

    static
    {
        System.out.println("******Add Information To DataBase******");
    }
    public static User ADD_View()
    {
        System.out.println("Please Input Message You Want To Add In :");

        System.out.println("Username:");
        String Uname_add=Input.nextLine();

        System.out.println("Password:");
        String Upass_add=Input.nextLine();

        User U_INFO=new User(Uname_add,Upass_add);
        return U_INFO;
    }
}
