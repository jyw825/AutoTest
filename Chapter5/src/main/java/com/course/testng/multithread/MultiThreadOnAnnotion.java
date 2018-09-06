package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion{
    @Test(invocationCount = 10,threadPoolSize = 3)  //用注解的方式实现多线程
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
