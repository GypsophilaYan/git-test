package com.heima;

public class TargetObject implements ProxyObject {
    private String name;

    public TargetObject() {
    }

    public TargetObject(String name) {
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在唱：" + name);
        return "非常感谢您的聆听";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在优雅的跳舞~~~");
    }
}
