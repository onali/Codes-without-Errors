package com.example;

import java.util.ArrayList;

public class Stat{
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("New York", "NY"));
        cities.add(new City("Los Angeles", "CA"));
        cities.add(new City("Chicago", "IL"));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            City city = cities.get(i % cities.size());
            person.setCity(city);
        }
    }
}

class City {
    String name;
    String state;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }
}

class Person {
    String name;
    int age;
    City city;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
