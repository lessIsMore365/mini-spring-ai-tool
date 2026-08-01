package org.example.minispringaitool.service;

public class WeatherResponse {

    private String result;

    public WeatherResponse(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
