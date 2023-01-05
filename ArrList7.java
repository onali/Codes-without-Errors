package com.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ArrList7{
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Pizza", 1));
        foods.add(new Food("Hamburger", 2));
        foods.add(new Food("Taco", 3));
        foods.add(new Food("Sushi", 4));

        Map<String, Restaurant> restaurants = new HashMap<>();
        restaurants.put("Papa John's", new Restaurant("Papa John's", 101));
        restaurants.put("McDonald's", new Restaurant("McDonald's", 102));
        restaurants.put("Taco Bell", new Restaurant("Taco Bell", 103));
        restaurants.put("Sushi Bar", new Restaurant("Sushi Bar", 104));

        for (Food food : foods) {
            Restaurant restaurant = restaurants.get(food.getName() + "'s");
            food.setRestaurant(restaurant);
        }
    }
}

class Food {
    String name;
    int foodId;
    Restaurant restaurant;

    public Food(String name, int foodId) {
        this.name = name;
        this.foodId = foodId;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}

class Restaurant {
    String name;
    int restaurantId;

    public Restaurant(String name, int restaurantId) {
        this.name = name;
        this.restaurantId = restaurantId;
    }
}
