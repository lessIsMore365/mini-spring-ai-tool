package org.example.minispringaitool.provider;

import org.example.minispringaitool.annotation.MyTool;
import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.invoker.MyMethodInvoker;
import org.example.minispringaitool.registry.MyToolRegistry;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyToolProvider {

    public void register(Object tool,
                         MyToolRegistry registry) {

        for (Method method : tool.getClass().getMethods()) {

            if (!method.isAnnotationPresent(MyTool.class)) {
                continue;
            }

            MyTool annotation = method.getAnnotation(MyTool.class);

            MyMethodInvoker callback =
                    new MyMethodInvoker(
                            tool,
                            method,
                            method.getParameterTypes()[0]
                    );

            registry.register(annotation.name(), callback);

            System.out.println("注册 Tool：" + annotation.name());
        }
    }

}