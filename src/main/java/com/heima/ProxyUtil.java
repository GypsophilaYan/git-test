package com.heima;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static ProxyObject createProxy(ProxyObject targetObject){
        ProxyObject proxyObject = (ProxyObject) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{ProxyObject.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName() == "sing"){
                    System.out.println("准备话筒，收钱200块");
                }else if (method.getName().equals("dance")){
                    System.out.println("准备场地，收钱300块");
                }

                return method.invoke(targetObject,args);
            }
        });
        return proxyObject;
    }
}
