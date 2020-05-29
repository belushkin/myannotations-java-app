package com.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//@Target({ElementType.METHOD, ElementType.FIELD})
public @interface MyType {

    public boolean enabled() default true;

    String message() default "This is simple message";

}
