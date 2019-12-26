package com.bjsxt.springbootthymeleaf.pojo;

/**
 * @author hanyueqian
 * @date 2019/12/22 0022-下午 16:38
 */
public class User
{
    private int Id;
    private String name;
    private int age;

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public User()
    {
    }

    public User(int id, String name, int age)
    {
        Id = id;
        this.name = name;
        this.age = age;
    }
}
