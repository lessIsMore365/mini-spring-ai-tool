package org.example.minispringaitool.bootstrap;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.icontext.MyApplicationContext;
import org.example.minispringaitool.provider.MethodToolCallbackProvider;
import org.example.minispringaitool.provider.MyToolCallbackProvider;
import org.example.minispringaitool.registry.MyToolRegistry;
import org.example.minispringaitool.service.WeatherService;

import java.util.List;

public class MyFrameworkBootstrap {

    private final MyApplicationContext context;


    private final List<MyToolCallbackProvider> providers;


    private final MyToolRegistry registry;

    public MyFrameworkBootstrap(
            MyApplicationContext context, List<MyToolCallbackProvider> providers, MyToolRegistry registry){

        this.context = context;
        this.providers = providers;
        this.registry = registry;
    }


    public void initialize(){

        for (MyToolCallbackProvider provider : providers) {
            List<MyToolCallback> callbacks = provider.getToolCallbacks(context);

            for (MyToolCallback callback : callbacks) {
                registry.register(callback);
            }
        }


    }




}
