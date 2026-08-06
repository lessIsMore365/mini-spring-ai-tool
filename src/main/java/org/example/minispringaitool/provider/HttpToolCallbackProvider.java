package org.example.minispringaitool.provider;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.icontext.MyApplicationContext;

import java.util.List;

public class HttpToolCallbackProvider implements MyToolCallbackProvider{
    @Override
    public List<MyToolCallback> getToolCallbacks(MyApplicationContext context) {
        return List.of();
//        return loadConfig();
    }
}
