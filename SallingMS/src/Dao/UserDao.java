package Dao;

import Bean.*;

public interface UserDao
//对数据库访问操作的接口类
{
    /**
     * 验证登录状态的方法
     * 1表示管理员登录
     * 2表示普通用户登录
     * 0表示登录失败
     */
    int LogIn(User USER_INFO);

    /**
     * 验证添加信息是否成功
     * true 添加成功
     * false 添加失败
     */
    boolean AddInfo(User USER_INFO);

    /**
     * 验证删除信息是否成功
     * true 添加成功
     * false 添加失败
     */
    boolean DeleteInfo(String uname);

    /**
     * 验证修改信息是否成功
     * true 添加成功
     * false 添加失败
     */
    boolean ModifyInfo(String uname);

    /**
     * 查询修改信息是否成功
     * true 添加成功
     * false 添加失败
     */
    User QueryInfo(String uname);

}
