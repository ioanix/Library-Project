package com.ioana.model;

public class Magazine extends Book {


    private String pictures;
    private int numPages;

    public Magazine() {


    }


    public Magazine(String title, String author, String ISBN, String publishingHouse, double price, String pictures, int numPages) {
        super(title, author, ISBN, publishingHouse, price);
        this.pictures = pictures;
        this.numPages = numPages;
    }

    public String getPictures() {
        return pictures;
    }


    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {

        return super.toString() + getPictures() + getNumPages();
    }
}
