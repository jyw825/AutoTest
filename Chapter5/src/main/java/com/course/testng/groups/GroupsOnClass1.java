package com.course.testng.groups;


import org.testng.annotations.Test;
//组测试中的类测试
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的stu11111111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2222222运行");
    }

}
