package com.ioana.service;

import com.ioana.model.Atlas;
import com.ioana.model.Book;
import com.ioana.model.Magazine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.apache.logging.log4j.Level;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class BookService  {

   // private static Logger logger = LogManager.getLogger(BookService.class);

    private List<Book> listOfBooks;


    public BookService() {

        //logger.log(Level.INFO, "INCEP POPULARE", listOfBooks);

        populateResource();

        //logger.log(Level.INFO, "termin POPULARE", listOfBooks);

    }


    //CRUD

    //CREATE

    public void populateResource() {

        //logger.log(Level.INFO, "in operatiune de populare", listOfBooks);

        listOfBooks = new ArrayList<>();

        //load from file

        try {


            File file = new File("documents.txt");
            //System.out.println("The absolute path is: " + file.getAbsolutePath());
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

                        //logger.log(Level.INFO, "gasit magazine", magazine);
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

    }

    public boolean addBook(Book book) {

        listOfBooks.add(book);
        return true;
    }

    //READ

    public Book getBookByIndex(int index) {

        return listOfBooks.get(index);
    }

    public Book getBookByName(String bookName) {

        for(Book book : listOfBooks) {

            if(book.getTitle().equals(bookName)) {

                return book;
            }
        }

        return null;
    }

    //UPDATE

    public void updateBook(Book oldBook, Book updatedBook) {

        Book foundBook = getBookByName(oldBook.getTitle());

        // metoda 1 - gasim index ul in interiorul listei si inlocuim in lista

        listOfBooks.set(listOfBooks.indexOf(foundBook), updatedBook);

        //metoda 2

//        foundBook.setTitle(updatedBook.getTitle());
//        foundBook.setAuthor(updatedBook.getAuthor());
//        foundBook.setISBN(updatedBook.getISBN());
//        foundBook.setPrice(updatedBook.getPrice());
//        foundBook.setPublishingHouse(updatedBook.getPublishingHouse());
//


    }

    //DELETE

    public void deleteBook(Book book) {

        listOfBooks.remove(getBookByName(book.getTitle()));
    }

    public int getNoOfBooks() {

        return listOfBooks.size();
    }
}
























