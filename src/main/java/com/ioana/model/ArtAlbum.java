package com.ioana.model;


public class ArtAlbum extends Book {

    private int numOfPages;
    private PaperQuality paperQuality;


    public ArtAlbum(String title, String author, String ISBN, String publishingHouse, double price, int numOfPages, PaperQuality paperQuality) {
        super(title, author, ISBN, publishingHouse, price);
        this.numOfPages = numOfPages;
        this.paperQuality = paperQuality;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public PaperQuality getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(PaperQuality paperQuality) {
        this.paperQuality = paperQuality;
    }
}
