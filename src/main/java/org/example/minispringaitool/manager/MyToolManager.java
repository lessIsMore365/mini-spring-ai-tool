package org.example.minispringaitool.manager;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolCall;
import org.example.minispringaitool.registry.MyToolRegistry;

public class MyToolManager {

    private final MyToolRegistry registry;

    public MyToolManager(MyToolRegistry registry) {
        this.registry = registry;
    }

    public Object execute(MyToolCall toolCall) {

        MyToolCallback callback = registry.get(toolCall.getToolName());

        if (callback == null) {
        }

        return callback.call(toolCall.getArguments());
    }

}
