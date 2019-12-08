package com.ioana.model;

public class Atlas extends Book {


    private String maps;
    private int numOfPages;

    public Atlas() {


    }


    public Atlas(String title, String author, String ISBN, String publishingHouse, double price, String maps, int numOfPages) {
        super(title, author, ISBN, publishingHouse, price);
        this.maps = maps;
        this.numOfPages = numOfPages;
    }


    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {

        return super.getPrice() * 199.99;
    }

    @Override
    public String toString() {

        return super.toString() + getMaps() + getNumOfPages();
    }

}
