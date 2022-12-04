package com.jdkproxy;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
