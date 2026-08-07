package org.example.minispringaitool.factory;

public class MyBeanFactory {

    public Object create(Class<?> clazz){

        try{

            return clazz.getDeclaredConstructor()
                    .newInstance();

        }
        catch(Exception e){

            throw new RuntimeException(e);

        }

    }

}
