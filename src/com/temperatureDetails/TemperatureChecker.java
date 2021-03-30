package com.temperatureDetails;

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
        return "Temperature Details : \n\n"+"Day - " + day + "\n" +
                "temperature : " + temperature + "\n" +
                "Speed of Wind : " + speedOfWind +
                "\nFeels Like temperature : " + feelsLikeTemperature();
    }
}
