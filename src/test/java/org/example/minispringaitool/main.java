package org.example.minispringaitool;

import org.example.minispringaitool.definition.MyToolCall;
import org.example.minispringaitool.llm.FakeChatModel;
import org.example.minispringaitool.tool.MyTool;
import org.example.minispringaitool.tool.WeatherTool;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {




        Map<String, MyTool> tools = new HashMap<>();

        tools.put("weather", new WeatherTool());
        FakeChatModel model = new FakeChatModel();


        MyToolCall toolCall = model.chat("北京天气怎么样");

        MyTool tool = tools.get(toolCall.getToolName());

        String result = tool.execute(tool.getName());
        System.out.println(result);
    }
}
