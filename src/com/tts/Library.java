package com.tts;

import java.util.ArrayList;
public class Library {
    String address;
    ArrayList<Book> list;

    public Library(String library) {
        address = library;
        list = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.list.add(book);
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 9pm.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                if (book.isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                } else{
                    book.rented();
                    System.out.println("You successfully borrowed " + book.getTitle());
                }
                return;
            }
        }
            System.out.println("Sorry, this book is not on our list.");
    }
    public void printAvaliableBooks() {
        if (this.list.isEmpty()) {
            System.out.println("No book in catalog.");
        }
        for (Book book : this.list) {
            System.out.println(book.getTitle());
        }
    }
    public void returnBook(String title) {

    }
}
