package com.example;

import java.util.ArrayList;

public class Vehicle2{
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2010));
        cars.add(new Car("Honda", "Accord", 2012));
        cars.add(new Car("Ford", "Fusion", 2014));

        ArrayList<Owner> owners = new ArrayList<>();
        owners.add(new Owner("Alice", 25));
        owners.add(new Owner("Bob", 30));
        owners.add(new Owner("Charlie", 35));

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            Owner owner = owners.get(i);
            car.setOwner(owner);
        }
    }
}

class Car {
    String make;
    String model;
    int year;
    Owner owner;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

class Owner {
    String name;
    int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
