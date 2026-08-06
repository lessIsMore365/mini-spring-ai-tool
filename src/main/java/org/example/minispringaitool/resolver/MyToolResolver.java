package org.example.minispringaitool.resolver;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.definition.MyToolCall;

public interface MyToolResolver {


    MyToolCallback resolve(
            MyToolCall toolCall);

}
