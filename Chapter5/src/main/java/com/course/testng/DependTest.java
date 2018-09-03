package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
//依赖测试,test2依赖于test1，test1先执行再执行test2，如果test1失败了，就不执行test2(就会被忽略掉);run test1时只执行test1，run test2时先执行test1，再执行test2；即test1是test2的一些前置工作
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
    @Test
    public void test3(){
        System.out.println("test3 run");
    }

}
