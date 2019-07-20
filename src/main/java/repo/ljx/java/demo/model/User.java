package main.java.repo.ljx.java.demo.controller.model;

import java.util.Date;

public class User {
    private int user_id;//id属性
    private String name;//姓名属性
    private int age;//年龄属性
    private int sex;//性别属性,0为女，1为男，可以自己设置
    private Date create_time;//这个用户被创建的时间

    public int getUser_id(){//id的get方法，让其他模块可以获取id
        return user_id;
    }

    public void setUser_id(int new_user_id){//id的set方法，给User对象赋值
        this.user_id = new_user_id;//赋值语句
    }

    //下同

    public String getName(){
        return name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int new_age){
        this.age = new_age;
    }

    public Date getCreate_time(){
        return create_time;
    }

    public void setCreate_time(Date new_create_time){
        this.create_time = new_create_time;
    }

    public int getSex(){
        return sex;
    }

    public void setSex(int new_sex){
        this.sex = new_sex;
    }
}
