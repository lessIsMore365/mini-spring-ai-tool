package org.example.minispringaitool.invoker;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolDefinition;

import java.lang.reflect.Method;


public class MyMethodInvoker implements MyToolCallback {


    private final Object target;


    private final Method method;


    private final Class<?> parameterType;

    private final MyToolDefinition definition;




    private final ObjectMapper mapper =
            new ObjectMapper();



    public MyMethodInvoker(
            Object target,
            Method method,
            Class<?> parameterType,
            MyToolDefinition definition) {


        this.target = target;

        this.method = method;

        this.parameterType = parameterType;

        this.definition=definition;
    }


    @Override
    public MyToolDefinition getDefinition() {

        return definition;
    }

    @Override
    public Object call(String input) {

        // JSON转换

        // method.invoke()

        try {


            Object argument =
                    mapper.readValue(
                            input,
                            parameterType
                    );


            return method.invoke(
                    target,
                    argument
            );


        } catch(Exception e){

            throw new RuntimeException(e);

        }
    }
}