package org.example.minispringaitool;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolCall;
import org.example.minispringaitool.definition.MyToolDefinition;
import org.example.minispringaitool.invoker.MyMethodInvoker;
import org.example.minispringaitool.manager.MyToolManager;
import org.example.minispringaitool.provider.MyToolProvider;
import org.example.minispringaitool.registry.MyToolRegistration;
import org.example.minispringaitool.registry.MyToolRegistry;
import org.example.minispringaitool.service.WeatherService;

import java.util.List;
import java.util.Map;

public class MyToolProviderTest {

    static void main() {

        WeatherService service =
                new WeatherService();

// Framework组件

        MyToolRegistry registry =
                new MyToolRegistry();

        MyToolProvider provider =
                new MyToolProvider();


        // Framework初始化阶段


        MyToolRegistration registration =
                provider.register(service);

        /*
         * 给LLM看的
         */

        MyToolDefinition definition =
                registration.getDefinition();


        System.out.println(
                "发送给LLM:"
        );


        System.out.println(definition);



        /*
         * 给JVM执行的
         */

        MyToolCallback callback =
                registration.getCallback();



        String json =
                """
                {
                  "city":"北京"
                }
                """;


        Object result =
                callback.call(json);



        System.out.println(result);



    }
}
