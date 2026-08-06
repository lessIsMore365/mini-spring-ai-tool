package org.example.minispringaitool;

import org.example.minispringaitool.bootstrap.MyFrameworkBootstrap;
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
        context.register(new WeatherService());
        context.register(new OrderService());




        MyToolRegistry registry =
                new MyToolRegistry();

        List<MyToolCallbackProvider> providers =
                List.of(
                        new MethodToolCallbackProvider()
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
