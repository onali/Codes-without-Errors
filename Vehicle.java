
Vehicle.java
package com.example;

import java.util.ArrayList;

public class Vehicle {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Honda", "Accord", 2017));
        cars.add(new Car("Ford", "Mustang", 2016));

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            Car car = cars.get(i);
            person.setCar(car);
        }
    }
}

class Person {
    String name;
    int age;
    Car car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}