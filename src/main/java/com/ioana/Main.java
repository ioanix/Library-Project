package com.ioana;


import com.ioana.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        List<Book> listOfBooks = new ArrayList<>(); // create an empty ArrayList of Book objects


        try {


            File file = new File("/Users/ioanatagurean/documents/documents.txt");
            Scanner sc = new Scanner(file); // use Scanner that will read from file

            while (sc.hasNext()) {

                String a = sc.nextLine(); // read a line from the file

                String[] array = a.split(";", 8); // separate the String into an array of Strings using ; as a separator


                //make temporary variables for the 5 types of data
                switch (array[2]) {

                    case "Magazine": {

//                        String tempTitle = array[0];
//                        String tempAuthor = array[1];
//                        String tempIsbn = array[3];
//                        String tempPublishing = array[4];
//                        double tempPrice = Double.parseDouble(array[5]);
//                        String tempPictures = array[6];
//                        int tempNumPages = Integer.parseInt(array[7]);
//
//                        Book tempBook = new Magazine(tempTitle, tempAuthor, tempIsbn, tempPublishing, tempPrice, tempPictures, tempNumPages); // create a temporary instance of Book

                        Magazine magazine = new Magazine();

                        magazine.setTitle(array[0]);
                        magazine.setAuthor(array[1]);
                        magazine.setISBN(array[3]);
                        magazine.setPublishingHouse(array[4]);
                        magazine.setPrice(Double.parseDouble(array[5]));
                        magazine.setPictures(array[6]);
                        magazine.setNumPages(Integer.parseInt(array[7]));

                        listOfBooks.add(magazine); // add the Object to the ArrayList ?? de ce ma lasa sa adaug in lista daca obiectul e de tip Magazine si nu de tip Book??
                        break;

                    }
                    case "Atlas": {

//                        String tempTitle1 = array[0];
//                        String tempAuthor1 = array[1];
//                        String tempIsbn1 = array[3];
//                        String tempPublishing1 = array[4];
//                        double tempPrice1 = Double.parseDouble(array[5]);
//                        String tempMaps = array[6];
//                        int tempNumPages1 = Integer.parseInt(array[7]);
//
//                        Book tempBook1 = new Atlas(tempTitle1, tempAuthor1, tempIsbn1, tempPublishing1, tempPrice1, tempMaps, tempNumPages1);

                        Atlas atlas = new Atlas();

                        atlas.setTitle(array[0]);
                        atlas.setAuthor(array[1]);
                        atlas.setISBN(array[3]);
                        atlas.setPublishingHouse(array[4]);
                        atlas.setPrice(Double.parseDouble(array[5]));
                        atlas.setMaps(array[6]);
                        atlas.setNumOfPages(Integer.parseInt(array[7]));

                        listOfBooks.add(atlas);
                        break;

                    }
                    default: {

//                        String tempTitle2 = array[0];
//                        String tempAuthor2 = array[1];
//                        String tempIsbn2 = array[3];
//                        String tempPublishing2 = array[4];
//                        double tempPrice2 = Double.parseDouble(array[5]);
//
//                        Book tempBook2 = new Book(tempTitle2, tempAuthor2, tempIsbn2, tempPublishing2, tempPrice2);
//                        listOfBooks.add(tempBook2);

                        Book book = new Book();

                        book.setTitle(array[0]);
                        book.setAuthor(array[1]);
                        book.setISBN(array[3]);
                        book.setPublishingHouse(array[4]);
                        book.setPrice(Double.parseDouble(array[5]));

                        listOfBooks.add(book);
                        break;

                    }


                }

            }

            sc.close();


        } catch (FileNotFoundException e) {

            System.out.println("File not found." + e.getMessage());
            e.printStackTrace();

        }


        System.out.println("\n");


        for (Book eachBook : listOfBooks) {

            System.out.println("****************");
            System.out.println(eachBook.toString());     // display the list of BooK Objects
        }

        System.out.println("****************\n");

        System.out.println("You have " + listOfBooks.size() + " elements in your list");

        System.out.println("*************\n");


        Book myBook = new Book("cartea", "sddd", "34", "dssd", 23);


        try {

            myBook.bookCheck("34");

        } catch (InvalidBookException e) {

            System.out.println("Caught the exception " + e.getMessage()); //am prins exceptia custom creata in clasa InvalidBookException

        }

        System.out.println("***************\n");


        Atlas atlas1 = new Atlas("Atlas de geografie", "ghhg", "123456", "humanitas", 35.5, "harta africii", 23);
        Magazine magazine1 = new Magazine("Forbes", "dsdd", "345678", "hsjsgdg", 15.4, "poze lideri", 20);


        MyCollection<Atlas> collectionOfAtlases = new MyCollection<>("Colectia de atlase"); // am instantiat un obiect din clasa MyCollection si se observa folosirea unui anumit tip pentru clasa
        collectionOfAtlases.addToCollection(atlas1);
        collectionOfAtlases.printCollection();


        MyCollection<Magazine> collectionOFMagazines = new MyCollection<>("Colectia de reviste");
        collectionOFMagazines.addToCollection(magazine1);
        collectionOFMagazines.printCollection();

        System.out.println("***************");

        PaperQuality paperQuality = PaperQuality.EXTRA; // am folosit enum - clasa PaperQuality
        String paper = paperQuality.toString();
        System.out.println("The quality of the paper for this art album is " + paper);
        paperQuality.paperDetails();






//        ReadFile file = new ReadFile();
//        file.openFile();
//        file.readFile();
//        file.closeFile();


//        Book atlas1 = new Atlas();
//        atlas1.setTitle("Book class -> Atlas de geografie");
//        System.out.println(atlas1.getTitle());
//        atlas1.addBook(1, "The jungle book");
//        System.out.println("The total number of books in the book class is " + atlas1.getTotalNumOfBooks());
//
//        atlas1.setPrice(10);
//
//
//        Book magazine1 = new Magazine();
//        magazine1.setTitle("Book class -> Dilema");
//        System.out.println(magazine1.getTitle());
//        magazine1.setPrice(10);
//
//
//        Book book = new Book();
//        book.setTitle("Shogun");
//        book.setPrice(45.6);
//        System.out.println("The book costs " + book.getPrice());
//        book.setPrice(10);
//
//        listOfBooks.add(atlas1);
//        listOfBooks.add(magazine1);
//        listOfBooks.add(book);


//        System.out.println("You have " + listOfBooks.size() +  " books in your list.");
//        System.out.println("Book list: ");

//        for(int index = 0; index < listOfBooks.size(); index++) {
//
//            System.out.println(listOfBooks.get(index).getClass() + " - " + listOfBooks.get(index).getPrice());
//
//
//        }

//        for(int i = 0; i < listOfBooks.size(); i++) {
//
//            System.out.println((i+1) + ". " + listOfBooks.get(i).getTitle());
//        }
//
//        Atlas atlas = new Atlas();
//        atlas.setMaps("Atlas class -> Harta Elvetiei");
//        System.out.println(atlas.getMaps());
//
//        Magazine magazine = new Magazine();
//        magazine.setPictures("Magazine class -> Poze cu animale");
//        System.out.println(magazine.getPictures());
//
//
//
//
//
    }
}




















