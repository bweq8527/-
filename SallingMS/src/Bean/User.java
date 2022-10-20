package Bean;

public class User
{
    /////////////////////////
    //参数

    private int id;
    private String name;
    private String password;
    private boolean type;
    //权限类型：0为用户，1为管理员

    /////////////////////////
    //构造方法

    public User()
    //默认，无参构造的用户数据
    /*
    默认用户名:Username
    默认密码:123456
    默认权限:用户
     */
    {
        name="Username";
        password="123456";
    }
    public User(String n,String p)
    //前端接收的用户数据
    {
        name = n;
        password = p;
    }
    public User(String n,String p,boolean t)
    //用于与“判断权限”功能相关的用户数据
    {
        name=n;
        password=p;
        type=t;
    }
    public User(int i,String n,String p,boolean t)
    //用于与“数据库操作”功能相关的用户数据
    {
        name=n;
        password=p;
        type=t;
        id=i;
    }


    /////////////////////////
    //getter、setter方法

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public boolean isType() {
        return type;
    }
    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setType(boolean type) {
        this.type=type;
    }

}
