package Tests;

import Bean.User;
import Views.IndexView;
import org.junit.jupiter.api.Test;

public class Test_IndexView
{
    @Test
    public static void Test_1() throws Exception
    {
        User u1=IndexView.IndexView();
        System.out.println(u1);
        System.out.println("ID:"+u1.getId());
        System.out.println("Name:"+u1.getName());
        System.out.println("Password:"+u1.getPassword());
        System.out.println("Type:"+u1.isType());

    }
}
