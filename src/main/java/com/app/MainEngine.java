package com.app;

public class MainEngine {

    public static void main(String[] args) {

        MyAnnotationEngine myAnnotationEngine = new MyAnnotationEngine();
        DataProcessor dataProcessor = new DataProcessor();
        myAnnotationEngine.process(dataProcessor);

        //DataProcessor dataProcessor2 = myAnnotationEngine.makeObject();
        //myAnnotationEngine.process(dataProcessor2);



    }
}
