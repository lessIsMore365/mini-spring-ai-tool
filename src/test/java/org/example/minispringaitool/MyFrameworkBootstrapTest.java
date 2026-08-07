package org.example.minispringaitool;

import org.example.minispringaitool.bootstrap.MyFrameworkBootstrap;
import org.example.minispringaitool.factory.MyBeanFactory;
import org.example.minispringaitool.icontext.MyApplicationContext;
import org.example.minispringaitool.provider.MethodToolCallbackProvider;
import org.example.minispringaitool.provider.MyToolCallbackProvider;
import org.example.minispringaitool.registry.MyToolRegistry;
import org.example.minispringaitool.service.OrderService;
import org.example.minispringaitool.service.WeatherService;

import java.util.List;

public class MyFrameworkBootstrapTest {


    static void main() {
        MyApplicationContext context = new MyApplicationContext();
        context.register(WeatherService.class);
        context.register(OrderService.class);




        MyToolRegistry registry =
                new MyToolRegistry();


        MyBeanFactory myBeanFactory = new MyBeanFactory();

        List<MyToolCallbackProvider> providers =
                List.of(
                        new MethodToolCallbackProvider(myBeanFactory)
                );

        MyFrameworkBootstrap bootstrap =
                new MyFrameworkBootstrap(
                        context,
                        providers,
                        registry
                );

        bootstrap.initialize();
    }
}
