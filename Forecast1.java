package com.example;

import java.util.List;
import java.util.Vector;
import java.util.Stack;

class Forecast {
    private List<Location> locations;

    public Forecast() {
        this.locations = new Vector<Location>();
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public List<Location> getLocations() {
        return locations;
    }
}

class Location {
    private String name;
    private List<WeatherCondition> weatherConditions;

    public Location(String name) {
        this.name = name;
        this.weatherConditions = new Vector<WeatherCondition>();
    }

    public void addWeatherCondition(WeatherCondition weatherCondition) {
        weatherConditions.add(weatherCondition);
    }

    public String getName() {
        return name;
    }

    public List<WeatherCondition> getWeatherConditions() {
        return weatherConditions;
    }
}

class WeatherCondition {
    private String type;
    private double temperature;

    public WeatherCondition(String type, double temperature) {
        this.type = type;
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public double getTemperature() {
        return temperature;
    }
}

public class Forecast1 {

    public static void main(String[] args) {
        Forecast forecast = new Forecast();

        Location seattle = new Location("Seattle");
        seattle.addWeatherCondition(new WeatherCondition("cloudy", 15.0));
        seattle.addWeatherCondition(new WeatherCondition("rainy", 14.0));
        forecast.addLocation(seattle);

        Location sanFrancisco = new Location("San Francisco");
        sanFrancisco.addWeatherCondition(new WeatherCondition("sunny", 20.0));
        sanFrancisco.addWeatherCondition(new WeatherCondition("sunny", 21.0));

    }
}