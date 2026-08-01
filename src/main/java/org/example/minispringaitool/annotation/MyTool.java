package org.example.minispringaitool.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTool {

    /**
     * Tool名称
     */
    String name();

    /**
     * Tool描述
     */
    String description() default "";

}