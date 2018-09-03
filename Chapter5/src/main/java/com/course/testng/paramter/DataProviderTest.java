package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    //通过DataProvider传递参数自动化
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name =" + name + ";   age = " + age);
    }

    //数据来源,通过dataprovider传入上方的方法中
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

}
