package org.example.minispringaitool.icontext;

import java.util.ArrayList;
import java.util.List;

public class MyApplicationContext {

    private final List<Object> beans =
            new ArrayList<>();


    public void register(Object bean){

        beans.add(bean);

    }


    public List<Object> getBeans(){

        return beans;

    }

}
