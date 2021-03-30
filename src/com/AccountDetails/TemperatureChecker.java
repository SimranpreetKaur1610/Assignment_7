package com.AccountDetails;

public class TemperatureChecker{
    private final String day;
    private final float temperature;
    private final float speedOfWind;

    public TemperatureChecker(String day, float temperature, float speedOfWind){
        this.day = day;
        this.temperature = temperature;
        this.speedOfWind = speedOfWind;
    }

    public float feelsLikeTemperature(){
        return temperature * speedOfWind; // Calculate feels like temperature.
    }

    public String outputString(){
        return "output";
    }
}
