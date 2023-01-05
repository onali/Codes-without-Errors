import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x + y;
        System.out.println(z);

        String s = scanner.nextLine();
        System.out.println(s);

        Student student = new Student("John", "Doe");
        student.printName();
    }
}

class Student {
    String firstName;
    String lastName;

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printName() {
        System.out.println(firstName + " " + lastName);
    }
}