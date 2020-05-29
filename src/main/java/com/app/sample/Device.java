package com.app.sample;

import com.app.MyType;

public class Device {


    @MyType(enabled = false)
    public void ring(){
        System.out.println("device.ring().hashCode="+hashCode());
    }

    @MyType(enabled = true)
    public void watch(){
        System.out.println("device.watch().hashCode="+hashCode());
    }

    @MyType(enabled = false)
    public void message(){
        System.out.println("device.message().hashCode="+hashCode());
    }
}
