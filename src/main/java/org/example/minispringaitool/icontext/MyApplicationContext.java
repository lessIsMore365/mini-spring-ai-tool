package org.example.minispringaitool.icontext;

import java.util.ArrayList;
import java.util.List;

public class MyApplicationContext {

    private final List<Class<?>> beanClasses =
            new ArrayList<>();


    public void register(Class<?> clazz ){

        beanClasses.add(clazz);

    }


    public List<Class<?>> getBeanClasses(){

        return beanClasses;
    }

}
