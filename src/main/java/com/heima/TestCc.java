package com.heima;

import org.junit.jupiter.api.Test;

public class TestCc {
    @Test
    public void test1(){
        TargetObject targetObject = new TargetObject("小乔");
        ProxyObject proxyObject = ProxyUtil.createProxy(targetObject);
        String result = proxyObject.sing("晴天");
        System.out.println(result);
        proxyObject.dance();
    }
}
