package com.app;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyAnnotationEngine {

    public void process(DataProcessor dataProcessor){
        Method[] methods = dataProcessor.getClass().getDeclaredMethods();
        /*for(Method m: methods){
            System.out.println(m);
        }*/
        for(Method m: methods){
            processAnnotations(m, dataProcessor);
        }
    }

    private void processAnnotations(Method m, Object instance){
        Annotation[] annotations = m.getDeclaredAnnotations();
        for(Annotation an: annotations){
            if(an instanceof MyType){
                MyType myType = (MyType) an;
                String message = myType.message();
                boolean enabled = myType.enabled();
                //System.out.println(m);
                //System.out.println("enabled="+enabled);
                //System.out.println("message="+message);
                if(enabled){
                    //dataProcessor.doAction1();
                    try {
                        System.out.println("@Before------------: "+message);
                        m.invoke(instance);
                    }catch(Exception ex){
                        throw new RuntimeException(ex);
                    }
                }
            }
        }
    }

    public DataProcessor makeObject(){
        String name = "com.app.DataProcessor";
        try {
            Object object = Class.forName(name).newInstance();
            return (DataProcessor) object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
