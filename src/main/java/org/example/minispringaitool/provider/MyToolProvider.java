package org.example.minispringaitool.provider;

import org.example.minispringaitool.annotation.MyTool;
import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolDefinition;
import org.example.minispringaitool.invoker.MyMethodInvoker;
import org.example.minispringaitool.registry.MyToolRegistration;
import org.example.minispringaitool.registry.MyToolRegistry;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyToolProvider {

    public MyToolRegistration register(Object tool) {

        for (Method method : tool.getClass().getMethods()) {

            if (!method.isAnnotationPresent(MyTool.class)) {
                continue;
            }

            MyTool annotation = method.getAnnotation(MyTool.class);





            /*
             * 2. 创建 Definition
             */

            MyToolDefinition definition =
                    new MyToolDefinition(
                            annotation.name(),
                            annotation.description(),
                            """
                            {
                              "type":"object",
                              "properties":{
                                "city":{
                                  "type":"string"
                                }
                              }
                            }
                            """
                    );

            /*
             * 1. 创建 Callback
             */
            MyMethodInvoker callback =
                    new MyMethodInvoker(
                            tool,
                            method,
                            method.getParameterTypes()[0],
                            definition
                            );

            return new MyToolRegistration(
                    definition,
                    callback
            );
        }
        throw new RuntimeException(
                "没有找到Tool"
        );
    }

}