package com.test;

import org.junit.jupiter.api.Test;

public class TestClass {
    //理解String类的不可变性
    @Test
    public void test(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
