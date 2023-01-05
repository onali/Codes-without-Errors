package com.example;

import java.util.ArrayList;

public class ArrList8{
    public static void main(String[] args) {
        Library library = new Library("My Library", "123 Main St");

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"), "123-456-789"));
        books.add(new Book("To Kill a Mockingbird", new Author("Harper Lee"), "234-567-890"));
        books.add(new Book("Pride and Prejudice", new Author("Jane Austen"), "345-678-901"));
        library.setBooks(books);

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("Alice", "111-111-111"));
        members.add(new Member("Bob", "222-222-222"));
        members.add(new Member("Charlie", "333-333-333"));
        library.setMembers(members);

        library.setLibrarians(new ArrayList<Librarian>());
    }
}

class Library {
    String name;
    String address;
    ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<Librarian> librarians;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public void setLibrarians(ArrayList<Librarian> librarians) {
        this.librarians = librarians;
    }
}

class Book {
    String title;
    Author author;
    String isbn;

    public Book(String title, Author author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }
}

class Member {
    String name;
    String cardNumber;

    public Member(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }
}

class Librarian {
    // Librarian class implementation goes here
}
