package org.example.minispringaitool.provider;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.factory.MyBeanFactory;
import org.example.minispringaitool.icontext.MyApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MethodToolCallbackProvider implements MyToolCallbackProvider{

    private final MyBeanFactory beanFactory;

    public MethodToolCallbackProvider(MyBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }


    @Override
    public List<MyToolCallback> getToolCallbacks(MyApplicationContext context) {

        ArrayList<Object> objects = new ArrayList<>();
        for(Class<?> clazz :
                context.getBeanClasses()){

            Object bean =
                    beanFactory.create(clazz);
            objects.add(bean);
        }

        return List.of();
//        return scanBeans();
    }
}
