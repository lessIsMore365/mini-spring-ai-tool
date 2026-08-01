package org.example.minispringaitool.tool;
public class WeatherTool implements MyTool {

    @Override
    public String getName() {
        return "weather";
    }

    @Override
    public String execute(String city) {

        return city + " 今天晴天，30℃";

    }

}
