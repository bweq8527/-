package Tests;

import Bean.User;
import Views.*;
import org.junit.jupiter.api.Test;

public class Test_LoadView
{
    @Test
    public static void Test_2() throws Exception
    {
        User u1=IndexView.IndexView();
        System.out.println("\n\n---USER INFO DETAILS:---");
        System.out.println(u1);
        System.out.println("ID:"+u1.getId());
        System.out.println("Name:"+u1.getName());
        System.out.println("Password:"+u1.getPassword());
        System.out.println("Type:"+u1.isType());
        System.out.println("------------------------");

    }
}
