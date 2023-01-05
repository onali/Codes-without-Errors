package com.example;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ArrList9 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Acme Zoo");

        Animal lion = new Animal("Lion", Animal.Category.MAMMAL);
        Animal dolphin = new Animal("Dolphin", Animal.Category.MAMMAL);
        Animal snake = new Animal("Snake", Animal.Category.REPTILE);
        Animal parrot = new Animal("Parrot", Animal.Category.BIRD);
        zoo.addAnimal(lion);
        zoo.addAnimal(dolphin);
        zoo.addAnimal(snake);
        zoo.addAnimal(parrot);

        Enclosure lionEnclosure = new Enclosure(lion, Enclosure.Type.CAGE);
        Enclosure dolphinEnclosure = new Enclosure(dolphin, Enclosure.Type.POOL);
        Enclosure snakeEnclosure = new Enclosure(snake, Enclosure.Type.TERRARIUM);
        Enclosure parrotEnclosure = new Enclosure(parrot, Enclosure.Type.AVIARY);
        zoo.addEnclosure(lionEnclosure);
        zoo.addEnclosure(dolphinEnclosure);
        zoo.addEnclosure(snakeEnclosure);
        zoo.addEnclosure(parrotEnclosure);

        Keeper alice = new Keeper("Alice", new Date());
        Keeper bob = new Keeper("Bob", new Date());
        Keeper charlie = new Keeper("Charlie", new Date());
        zoo.addKeeper(alice);
        zoo.addKeeper(bob);
        zoo.addKeeper(charlie);

        Shift morningShift = new Shift(alice, new Date(), Shift.Period.MORNING);
        Shift afternoonShift = new Shift(bob, new Date(), Shift.Period.AFTERNOON);
        Shift eveningShift = new Shift(charlie, new Date(), Shift.Period.EVENING);
        zoo.addShift(morningShift);
        zoo.addShift(afternoonShift);
        zoo.addShift(eveningShift);

        morningShift.addEnclosure(lionEnclosure);
        morningShift.addEnclosure(snakeEnclosure);
        afternoonShift.addEnclosure(dolphinEnclosure);
        eveningShift.addEnclosure(parrotEnclosure);
    }
}

class Zoo {
    String name;
    List<Animal> animals;
    List<Enclosure> enclosures;
    List<Keeper> keepers;
    List<Shift> shifts;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
        this.enclosures = new ArrayList<>();
        this.keepers = new ArrayList<>();
        this.shifts = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void addKeeper(Keeper keeper) {
        keepers.add(keeper);
    }

    public void addShift(Shift shift) {
        shifts.add(shift);
    }
}

class Animal {
    String name;
    Category category;

    public Animal(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public enum Category {
        MAMMAL, REPTILE, BIRD
    }
}

class Enclosure {
    Animal animal;
    Type type;

    public Enclosure(Animal animal, Type type) {
        this.animal = animal;
        this.type = type;
    }

    public enum Type {
        CAGE, POOL, TERRARIUM, AVIARY
    }
}

class Keeper {
    String name;
    Date hireDate;

    public Keeper(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }
}

class Shift {
    Keeper keeper;
    Date date;
    Period period;
    List<Enclosure> enclosures;

    public Shift(Keeper keeper, Date date, Period period) {
        this.keeper = keeper;
        this.date = date;
        this.period = period;
        this.enclosures = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public enum Period {
        MORNING, AFTERNOON, EVENING
    }
}

