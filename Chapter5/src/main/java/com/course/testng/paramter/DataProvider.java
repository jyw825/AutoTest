package com.course.testng.paramter;

import org.testng.annotations.Test;

public class DataProvider {
    //通过DataProvider传递参数自动化
    @Test(dataProvider = "")
    public void testDataProvider(String name,int age){
        System.out.println("name =" + name + ";   age = " + age);
    }

    //数据来源
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
    }

}
