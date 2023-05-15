package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double averageTemperature(Temperatures temperatures){
        double averageTem = 0;
        double number = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            averageTem = averageTem + temperature.getValue();
            number++;
        }
        double result = averageTem/number;
        return result;
    }

    public double medianTemperature(Temperatures temperatures){
        ArrayList<Double> allTemperatures = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            allTemperatures.add(temperature.getValue());
        }
        Collections.sort(allTemperatures);
        if(allTemperatures.size()%2==0){
            int a = allTemperatures.size()/2;
            double result = (allTemperatures.get(a)+allTemperatures.get(a-1))/2;
            return result;
        } else {
            int a = allTemperatures.size()/2;
            double result = allTemperatures.get(a);
            return result;
        }

    }
}