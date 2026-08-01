package org.example.minispringaitool.service;

import org.example.minispringaitool.annotation.MyTool;

public class WeatherService {



    @MyTool(
            name = "weather",
            description = "查询城市天气"
    )
    public WeatherResponse weather(
            WeatherRequest request) {


        System.out.println(
                "查询天气：" + request.getCity()
        );


        return new WeatherResponse(
                request.getCity() + " 晴天 30℃"
        );
    }

}