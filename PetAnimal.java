package com.example;

import java.util.ArrayList;

public class PetAnimal{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Cat"));
        animals.add(new Animal("Fish"));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            Animal animal = animals.get(i % animals.size());
            person.setPet(animal);
        }
    }
}

class Animal {
    String type;

    public Animal(String type) {
        this.type = type;
    }
}

class Person {
    String name;
    int age;
    Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}
