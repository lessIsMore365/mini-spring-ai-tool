package org.example.minispringaitool.resolver;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolCall;
import org.example.minispringaitool.registry.MyToolRegistry;

public class DefaultToolResolver
        implements MyToolResolver{


    private final MyToolRegistry registry;

    public DefaultToolResolver(MyToolRegistry registry) {
        this.registry = registry;
    }
    @Override
    public MyToolCallback resolve(
            MyToolCall toolCall){


        return registry.get(
                toolCall.getToolName());

    }

}