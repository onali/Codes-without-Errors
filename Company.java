package com.example;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1));
        employees.add(new Employee("Bob", 2));
        employees.add(new Employee("Charlie", 3));

        ArrayList<Department> departments = new ArrayList<>();
        departments.add(new Department("IT", 101));
        departments.add(new Department("HR", 102));
        departments.add(new Department("Finance", 103));

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            Department department = departments.get(i);
            employee.setDepartment(department);
        }
    }
}

class Employee {
    String name;
    int employeeId;
    Department department;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

class Department {
    String name;
    int departmentId;

    public Department(String name, int departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }
}
