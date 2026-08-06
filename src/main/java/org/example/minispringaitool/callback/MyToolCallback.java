package org.example.minispringaitool.callback;

import org.example.minispringaitool.definition.MyToolDefinition;

public interface MyToolCallback {


    MyToolDefinition getDefinition();

    Object call(String input);


}
