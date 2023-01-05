package com.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Novel{
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Pride and Prejudice", 1));
        books.add(new Book("To Kill a Mockingbird", 2));
        books.add(new Book("The Great Gatsby", 3));
        books.add(new Book("Moby-Dick", 4));

        Map<String, Author> authors = new HashMap<>();
        authors.put("Jane Austen", new Author("Jane Austen", 101));
        authors.put("Harper Lee", new Author("Harper Lee", 102));
        authors.put("F. Scott Fitzgerald", new Author("F. Scott Fitzgerald", 103));
        authors.put("Herman Melville", new Author("Herman Melville", 104));

        for (Book book : books) {
            Author author = authors.get(book.getName().substring(0, 2));
            book.setAuthor(author);
        }
    }
}

class Book {
    String name;
    int bookId;
    Author author;

    public Book(String name, int bookId) {
        this.name = name;
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

class Author {
    String name;
    int authorId;

    public Author(String name, int authorId) {
        this.name = name;
        this.authorId = authorId;
    }
}
