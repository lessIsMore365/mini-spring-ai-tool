package org.example.minispringaitool.provider;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.icontext.MyApplicationContext;

import java.util.List;

public interface MyToolCallbackProvider {

    List<MyToolCallback> getToolCallbacks(MyApplicationContext context);
}
