package com.example;

import java.util.Calendar;
import java.util.Scanner;

class Employee {
    String name;
    Calendar hireDate;

    public Employee(String name, Calendar hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }
}

public class Worker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        Calendar hireDate = Calendar.getInstance();

        Employee employee1 = new Employee(name, hireDate);

        System.out.print("Enter employee name: ");
        name = input.nextLine();
        hireDate = Calendar.getInstance();

        Employee employee2 = new Employee(name, hireDate);
    }
}