package com.kodilla.testing.weather.stub;

import java.util.*;

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
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }


    public double averangeTemperature(){
        double result = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            result += temperature.getValue();
        }
        return  result / temperatures.getTemperatures().size();

    }

    public double medianaTemperature(){
        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> element : temperatures.getTemperatures().entrySet()){
            list.add(element.getValue());
        }
        Collections.sort(list);
        double result = 0;
        if(list.size() % 2 != 0){
            result += list.get((list.size()-1)/2);
        }else{
            result += list.get((list.size()-1)/2);
            result += list.get((list.size())/2);
            result /= 2;
        }

        return result;
    }

}