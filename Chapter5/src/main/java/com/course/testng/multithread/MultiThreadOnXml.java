package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    //xml文件实现多线程测试
    @Test
    public void test1(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
