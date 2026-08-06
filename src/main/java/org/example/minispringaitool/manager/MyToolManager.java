package org.example.minispringaitool.manager;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolCall;
import org.example.minispringaitool.registry.MyToolRegistry;
import org.example.minispringaitool.resolver.MyToolResolver;

public class MyToolManager {



    private final MyToolResolver resolver;

    public MyToolManager(MyToolResolver resolver) {
        this.resolver = resolver;
    }


    public Object execute(MyToolCall toolCall) {

//        MyToolCallback callback = registry.get(toolCall.getToolName());
        MyToolCallback callback =
                resolver.resolve(
                        toolCall);
        if (callback == null) {
        }

        return callback.call(toolCall.getArguments());
    }

}
