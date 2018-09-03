package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    //通过xml文件实现参数自动化
    @Test
    @Parameters({"name1","age1"})  //接收两个参数
    public void paramTest1(String name,int age){
        System.out.println("name ="+name+" ; age = "+age);
    }
}
