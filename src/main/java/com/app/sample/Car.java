package com.app.sample;

import com.app.MyType;

public class Car {

    @MyType(message = "Will be stop()")
    public void stop(){
        System.out.println("car.stop().hashCode="+hashCode());
    }

    @MyType(message = "Will be drive()")
    public void drive(){
        System.out.println("car.drive().hashCode="+hashCode());
    }

    @MyType(message = "Will be accelerate()")
    public void accelerate(){
        System.out.println("car.accelerate().hashCode="+hashCode());
    }
}
