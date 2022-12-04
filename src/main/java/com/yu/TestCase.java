package com.yu;

import org.junit.jupiter.api.Test;

public class TestCase {
    @Test
    public void test1(){
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }

    //测试懒汉式---Singleton1类
    @Test
    public void test2(){
        Singleton1 instance3 = Singleton1.getInstance();
        Singleton1 instance4 = Singleton1.getInstance();
        System.out.println(instance3 == instance4);

    }
}
