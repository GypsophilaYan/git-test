package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Target {

    public static void main(String[] args) {
        MyInterfaceImpl target = new MyInterfaceImpl();
        MyInterface proxy = (MyInterface)Proxy.newProxyInstance(Target.class.getClassLoader(), new Class[]{MyInterface.class}, new InvocationHandler() {
            /*invoke方法执行时间：通过代理对象调用目标对象中的原生方法时会自动调用InvocationHandler实现类中的invoke方法
            第一个参数：Object proxy  指的是当前代理类对象 ---------①
            第二个参数：Method method  代理类对象所调用的方法  -----②
            第三个参数：Object[] args   该方法所对应的参数----------③
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法之前执行" + method.getName() + "传递的参数..." + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("方法之后执行被代理的对象..." + target);
                return result;
            }
        });
        //通过代理对象调用目标对象中的原生方法时会自动调用InvocationHandler实现类中的invoke方法
        int add = proxy.add(1, 2);      //例如，proxy对应①，add对应②，1,2对应③
        System.out.println(add);
        String update = proxy.update("100");
        System.out.println(update);


    }



}
