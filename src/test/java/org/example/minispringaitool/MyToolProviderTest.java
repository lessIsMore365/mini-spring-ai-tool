package org.example.minispringaitool;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolCall;
import org.example.minispringaitool.invoker.MyMethodInvoker;
import org.example.minispringaitool.manager.MyToolManager;
import org.example.minispringaitool.provider.MyToolProvider;
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

        provider.register(
                service,
                registry
        );

        MyToolCall toolCall =
                new MyToolCall();

        toolCall.setToolName("weather");

        toolCall.setArguments(
                """
                {
                    "city":"北京"
                }
                """);

        MyToolManager myToolManager = new MyToolManager(registry);

        Object result =
                myToolManager.execute(toolCall);
        System.out.println( result);



    }
}
