package com.app.sample;

import com.app.DataProcessor;
import com.app.MyType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MySampleAnnotationEngine {

    public void process(Object object){
        Method[] methods = object.getClass().getDeclaredMethods();
        for(Method m: methods){
            processAnnotations(m, object);
        }
    }

    private void processAnnotations(Method m, Object instance){
        Annotation[] annotations = m.getDeclaredAnnotations();
        for(Annotation an: annotations){
            if(an instanceof MyType){
                MyType myType = (MyType) an;
                String message = myType.message();
                boolean enabled = myType.enabled();
                if(enabled){
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
        String name = "com.app.com.app.DataProcessor";
        try {
            Object object = Class.forName(name).newInstance();
            return (DataProcessor) object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
