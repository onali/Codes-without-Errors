package com.example;

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1001));
        students.add(new Student("Bob", 1002));
        students.add(new Student("Charlie", 1003));

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 101));
        courses.add(new Course("Science", 102));
        courses.add(new Course("English", 103));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            Course course = courses.get(i);
            student.enrollInCourse(course);
        }
    }
}

class Student {
    String name;
    int studentId;
    ArrayList<Course> courses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }
}

class Course {
    String name;
    int courseId;

    public Course(String name, int courseId) {
        this.name = name;
        this.courseId = courseId;
    }
}
