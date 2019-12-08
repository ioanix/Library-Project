package com.ioana.model;

public class Novel extends Book {


    private int numOfPages;
    private String type;


    public Novel(String title, String author, String ISBN, String publishingHouse, double price, int numOfPages, String type) {
        super(title, author, ISBN, publishingHouse, price);
        this.numOfPages = numOfPages;
        this.type = type;
    }


    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
