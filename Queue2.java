package com.example;

import java.util.Date;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class Queue2{
    public static void main(String[] args) {
        School school = new School("Acme High School");

        Student alice = new Student("Alice", 11);
        Student bob = new Student("Bob", 12);
        Student charlie = new Student("Charlie", 10);
        school.addStudent(alice);
        school.addStudent(bob);
        school.addStudent(charlie);

        Course math = new Course("Math", 101);
        Course science = new Course("Science", 102);
        Course english = new Course("English", 103);
        school.addCourse(math);
        school.addCourse(science);
        school.addCourse(english);

        Enrollment enrollment1 = new Enrollment(alice, math);
        Enrollment enrollment2 = new Enrollment(bob, math);
        Enrollment enrollment3 = new Enrollment(charlie, math);
        Enrollment enrollment4 = new Enrollment(bob, science);
        Enrollment enrollment5 = new Enrollment(charlie, science);
        Enrollment enrollment6 = new Enrollment(charlie, english);
        school.addEnrollment(enrollment1);
        school.addEnrollment(enrollment2);
        school.addEnrollment(enrollment3);
        school.addEnrollment(enrollment4);
        school.addEnrollment(enrollment5);
        school.addEnrollment(enrollment6);

        Exam exam1 = new Exam(math, new Date());
        Exam exam2 = new Exam(science, new Date());
        Exam exam3 = new Exam(english, new Date());
        school.addExam(exam1);
        school.addExam(exam2);
        school.addExam(exam3);

        exam1.addScore(alice, 95);
        exam1.addScore(bob, 75);
        exam1.addScore(charlie, 65);
        exam2.addScore(bob, 90);
        exam2.addScore(charlie, 80);
        exam3.addScore(charlie, 90);
    }
}

class School {
    String name;
    List<Student> students;
    List<Course> courses;
    List<Enrollment> enrollments;
    Stack<Exam> exams;

    public School(String name) {
        this.name = name;
        this.students = new LinkedList<>();
        this.courses = new LinkedList<>();
        this.enrollments = new LinkedList<>();
        this.exams = new Stack<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addEnrollment(Enrollment enrollment) {
       
enrollments.add(enrollment);
    }

    public void addExam(Exam exam) {
        exams.push(exam);
    }
}

class Student {
    String name;
    int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
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

class Enrollment {
    Student student;
    Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}

class Exam {
    Course course;
    Date date;
    Map<Student, Integer> scores;

    public Exam(Course course, Date date) {
        this.course = course;
        this.date = date;
        this.scores = new HashMap<>();
    }

    public void addScore(Student student, int score) {
        scores.put(student, score);
    }
}
