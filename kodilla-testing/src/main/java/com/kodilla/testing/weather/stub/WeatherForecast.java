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
    public double AverageTemperature(Temperatures temperatures){
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

    public double MedianTemperature(Temperatures temperatures){
        ArrayList<Double> AllTemperatures = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            AllTemperatures.add(temperature.getValue());
        }
        Collections.sort(AllTemperatures);
        if(AllTemperatures.size()%2==0){
            int a = AllTemperatures.size()/2;
            double result = (AllTemperatures.get(a)+AllTemperatures.get(a-1))/2;
            return result;
        } else {
            int a = AllTemperatures.size()/2;
            double result = AllTemperatures.get(a);
            return result;
        }

    }
}