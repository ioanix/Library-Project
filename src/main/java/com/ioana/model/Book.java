package com.ioana.model;

import java.util.ArrayList;
import java.util.List;


public class Book {

    private String title;
    private String author;
    private String ISBN;
    private String publishingHouse;
    private double price;
    int totalNumOfBooks = 1;

    private List<Novel> myList = new ArrayList<>();

    public Book() {

    }


    public Book(String title, String author, String ISBN, String publishingHouse, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publishingHouse = publishingHouse;
        this.price = price;
    }


    public void bookCheck(String isbn) throws InvalidBookException { // custom exception

        if(isbn.length() <= 2) {

            throw new InvalidBookException("Invalid ISBN");
        }
    }


    private int findNovel(Novel novel) {

        return this.myList.indexOf(novel);

    }

    public int findNovel(String name) {

        for (int i = 0; i < myList.size(); i++) {

            Novel novel = myList.get(i);
            if (novel.getTitle().equals(name)) {

                return i;
            }
        }

        return -1;
    }

    public int findNovelByISBN(String ISBN) throws InvalidBookException {

        if(ISBN.length() <= 2) {

            throw  new InvalidBookException("Invalid ISBN");

        }

        for(int i = 0; i < myList.size(); i++) {

            Novel novel = myList.get(i);
            if(novel.getISBN().equals(ISBN)) {

                return i;
            }
        }

        return -1;


    }

    public Novel queryListOfBooks(String name) {

        int position = findNovel(name);

        if (position >= 0) {

            return myList.get(position);
        }

        return null;
    }

    public boolean addNovel(Novel novel) {

        if (findNovel(novel) >= 0) {

            System.out.println(novel.getTitle() + " is already on the list");
            return false; // novel already on the list
        }

        myList.add(novel);
        return true;
    }

    public boolean deleteNovel(Novel novel) {

        int position = findNovel(novel);
        if (position < 0) {

            System.out.println(novel.getTitle() + " was not found");
            return false;

        }

        myList.remove(position);
        System.out.println(novel.getTitle() + " was deleted form the list.");
        return true;
    }


//
//    public void addItem(String item) {
//
//        myList.add(item);
//    }
//
//    public void printTheList() {
//
//        System.out.println("There are " + myList.size() + " books in your list");
//
//        for(int i = 0; i < myList.size(); i++) {
//
//            System.out.println((i + 1) +". " + myList.get(i));
//        }
//    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalNumOfBooks() {

        return totalNumOfBooks;
    }

    public void addBook(int newBook, String newTitle) {

        totalNumOfBooks += newBook;
        System.out.println("The book added is called " + newTitle);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return this.getTitle() + this.getAuthor() + this.getISBN() + this.getPublishingHouse() + " " + this.getPrice();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Book) {

            Book book = (Book) obj;

            if(book.title.equals(this.title) && book.author.equals(this.author)) {

                return true;
            }

            else {

                return false;
            }

        } else {

            return false;
        }
    }


//    @Override
//    public boolean equals(Object obj) { // un alt mod de a suprascrie metoda equals()
//
//        if(this == obj) {
//
//            return true;
//        }
//
//        if(obj instanceof Book) {
//
//            String objTitle = ((Book) obj).title;
//            String objAuthor = ((Book) obj).author;
//
//            if(this.title.equals(objTitle) && this.author.equals(objAuthor)) { // foloseste equals() din clasa String
//
//                return true;
//            }
//        }
//
//        return false;
//    }



}























