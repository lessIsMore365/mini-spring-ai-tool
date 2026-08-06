package org.example.minispringaitool.registry;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolDefinition;

public class MyToolRegistration {


    private final MyToolDefinition definition;


    private final MyToolCallback callback;



    public MyToolRegistration(
            MyToolDefinition definition,
            MyToolCallback callback) {

        this.definition = definition;
        this.callback = callback;
    }



    public MyToolDefinition getDefinition() {
        return definition;
    }


    public MyToolCallback getCallback() {
        return callback;
    }
}
