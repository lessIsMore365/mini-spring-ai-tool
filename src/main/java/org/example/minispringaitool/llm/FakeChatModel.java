package org.example.minispringaitool.llm;

import org.example.minispringaitool.definition.MyToolCall;

public class FakeChatModel {

//    public String chat(String prompt) {
//
//        if (prompt.contains("天气")) {
//            return "weather";
//        }
//
//        if (prompt.contains("计算")) {
//            return "calculator";
//        }
//
//        return "不知道";
//    }



    public MyToolCall chat(String prompt){

        if(prompt.contains("天气")){

            return new MyToolCall(
                    "weather",
                    "北京"
            );
        }

        return null;
    }

}