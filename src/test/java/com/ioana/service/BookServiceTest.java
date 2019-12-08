package com.ioana.service;


import com.ioana.model.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BookServiceTest {


    private BookService bookService;

    @BeforeEach
    public void setup()  {

        bookService = new BookService();
        assertEquals(7, bookService.getNoOfBooks());
        System.out.println("Running a test...");
    }

    @AfterEach
    void tearDown() {


        System.out.println("trying to clean up");

    }

    @Test
    void populateResource() {
    }

    @Test
    void addBook() {

        System.out.println("Trying to run addBook");

        Book book = new Book();
        book.setTitle("bla bla");
        book.setAuthor("xbc");
        book.setISBN("456789");
        book.setPublishingHouse("nemira");
        book.setPrice(16.89);

        //int size = bookService.getNoOfBooks();

        bookService.addBook(book);

        assertEquals(8, bookService.getNoOfBooks());


    }

    @Test
    void getBookByIndex() {

        Book book = new Book("Tralala", "dsss", "123445", "sddd", 34);
        bookService.addBook(book);

        assertEquals(book, bookService.getBookByIndex(bookService.getNoOfBooks() - 1));


    }

    @Test
    void getBookByName() {

        Book book = new Book("Carte", "dss", "345", "dsss", 32);
        bookService.addBook(book);

        assertEquals(book, bookService.getBookByName("Carte"));
    }

    @Test
    void updateBook() {

        //fail("This test has yet to be implemented");

        Book book = new Book("Cartea mea" , "ddss", "3455", "ahaha", 21);
        bookService.addBook(book);

        Book book1 = new Book("Cartea mea 2", "sasas", "1234", "dsd", 24);

        bookService.updateBook(book, book1);

        assertEquals(book1, bookService.getBookByIndex(7));


    }

    @Test
    void deleteBook() {

        Book book = new Book("ahaha", "hahaha", "hdhdhhd", "hhhsh", 34);
        bookService.addBook(book);
        Book book1 = new Book("ahahaww", "hahahatt", "123445", "hhhshrr", 36);
        bookService.addBook(book);

        //assertEquals(9, bookService.getNoOfBooks());

        bookService.deleteBook(book);
        assertEquals(8, bookService.getNoOfBooks());

    }

    @Test
    void getNoOfBooks() {

        assertEquals(7, bookService.getNoOfBooks());
    }

}
