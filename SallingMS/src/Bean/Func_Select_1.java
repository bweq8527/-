package Bean;

public enum Func_Select_1
//包含功能：增、删、查、改
{
    //枚举的成员（在此处为视窗中应提供的各种功能）
    A("Add Messages"),
    B("Delete Messages"),
    C("Query Messages"),
    D("Modify Messages");

    private String func;
    //枚举的私有变量，以 字符串形式 表达的 要实现的功能的名称

    Func_Select_1()
    //枚举类的构造方法1：默认，无参构造
    {
        this.func=null;
    }
    Func_Select_1(String func)
    //枚举类的构造方法2：以字符串构造
    {
        this.func=func;
        //System.out.println("Function:"+this.func);
    }
    public static boolean Contains(String elem)
    //判断元素 elem 是否被包含在该枚举量中
    {
        System.out.println("@Test:elem is:"+elem);
        System.out.println("@Test:A.name is:"+A.name());
        System.out.println("@Test:A.func is:"+A.func);
        System.out.println("@Test:B.name is:"+B.name());
        System.out.println("@Test:B.func is:"+B.func);
        System.out.println("@Test:C.name is:"+C.name());
        System.out.println("@Test:C.func is:"+C.func);
        System.out.println("@Test:D.name is:"+D.name());
        System.out.println("@Test:D.func is:"+D.func);

        if(A.name().equals(elem)||B.name().equals(elem)||C.name().equals(elem)||D.name().equals(elem))
        {
            System.out.println("@Test:Functions Selecting Menu contains elem"+"\""+elem+"\"");
            return true;
        }
        else
        {
            System.out.println("@Test:Functions Selecting Menu doesn't contain elem"+"\""+elem+"\"");
            return false;
        }
    }
    public static Func_Select_1 Value(String elem)
    //根据字符串返回一个枚举变量
    {
        if     (A.name().equals(elem))return A;
        else if(B.name().equals(elem))return B;
        else if(C.name().equals(elem))return C;
        else if(D.name().equals(elem))return D;
        else return null;
        //最后这行不能删，删了报错；但是由于能调用此方法意味着最后一个else所代表
        // 的情况不可能满足，所以调用该方法的switch语句不可能得到一个空指针
        //但其实如果没有这个保证，本方法返回了一个空指针的话，调用者switch
        //语句会产生NullPointerException异常



    }


}
//枚举变量Selections表示功能范围
