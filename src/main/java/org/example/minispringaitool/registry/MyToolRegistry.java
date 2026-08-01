package org.example.minispringaitool.registry;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.invoker.MyMethodInvoker;

import java.util.HashMap;
import java.util.Map;

public class MyToolRegistry {

    private final Map<String, MyToolCallback> callbacks = new HashMap<>();

    public void register(String name, MyToolCallback callback) {
        callbacks.put(name, callback);
    }

    public MyToolCallback get(String name) {
        return callbacks.get(name);
    }

    public void print() {
        callbacks.forEach((k, v) ->
                System.out.println(k + " -> " + v.getClass().getSimpleName()));
    }
}
