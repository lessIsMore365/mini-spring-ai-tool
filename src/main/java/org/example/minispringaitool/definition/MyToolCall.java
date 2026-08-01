package org.example.minispringaitool.definition;

public class MyToolCall {


    //生成构造
    public MyToolCall(String toolName, String arguments) {
        this.toolName = toolName;
        this.arguments = arguments;
    }

    private String toolName;

    private String arguments;


    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }
}
