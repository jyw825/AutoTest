package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass222中的stu11111111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass222中的stu2222222运行");
    }



}
