package com.app.sample;

public class SampleCarMain {

    /*public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.drive();
        car.stop();

        System.out.println("-----------------------");

        Device device = new Device();
        device.message();
        device.ring();
        device.watch();
    }*/


    public static void main(String[] args) {
        MySampleAnnotationEngine mySampleAnnotationEngine = new MySampleAnnotationEngine();
        Car car = new Car();
        mySampleAnnotationEngine.process(car);
        System.out.println("-----------------------------------");
        Car car2 = new Car();
        mySampleAnnotationEngine.process(car2);

        System.out.println("######################################");
        Device device = new Device();
        mySampleAnnotationEngine.process(device);
        System.out.println("-----------------------------------");
        Device device2 = new Device();
        mySampleAnnotationEngine.process(device2);


    }

}
