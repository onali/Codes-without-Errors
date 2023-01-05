package com.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class School2{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));
        students.add(new Student("Dave", 4));
        students.add(new Student("Eve", 5));

        Map<String, Course> courses = new HashMap<>();
        courses.put("Math", new Course("Math", 101));
        courses.put("Science", new Course("Science", 102));
        courses.put("English", new Course("English", 103));
        courses.put("History", new Course("History", 104));
        courses.put("PE", new Course("PE", 105));

        for (Student student : students) {
            ArrayList<Course> studentCourses = new ArrayList<>();
            for (int i = 0; i < student.getName().length() % 5; i++) {
                studentCourses.add(courses.get(student.getName().substring(i, i + 2)));
            }
            student.setCourses(studentCourses);
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
    }

    public String getName() {
        return name;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
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
