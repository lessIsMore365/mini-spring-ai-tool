package org.example.minispringaitool.registry;

import org.example.minispringaitool.callback.MyToolCallback;
import org.example.minispringaitool.invoker.MyMethodInvoker;

import java.util.HashMap;
import java.util.Map;

public class MyToolRegistry {

    private final Map<String, MyToolCallback> callbacks = new HashMap<>();

    public void register(MyToolCallback callback) {

        String name =
                callback.getDefinition().getName();

        if(callbacks.containsKey(name)){

            throw new IllegalArgumentException(
                    "Tool already exists : " + name);

        }

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
