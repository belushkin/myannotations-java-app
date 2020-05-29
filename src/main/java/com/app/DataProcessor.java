package com.app;

public class DataProcessor {

    @MyType(enabled = false, message = "some message A")
    public void doAction1(){
        System.out.println("doAction1()");
    }

    @MyType(message = "some message B")
    public void doAction2(){
        System.out.println("doAction2()");
    }

    @MyType(enabled = false)
    public void doAction3(){
        System.out.println("doAction3()");
    }

}
