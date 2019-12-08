package com.ioana.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    private MyList list;

    @BeforeEach
    void setUp() {

        list = new MyList();
        System.out.println("Running a test...");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sizeOfTheList() {

        assertEquals(0, list.sizeOfTheList());
    }

    @Test
    void getElement() {

        list.addElement(5);
        assertEquals(5, list.getElement(0));
    }

    @Test
    void addElement() {

        list.addElement(5);
        assertEquals(1, list.sizeOfTheList());
    }

    @Test
    void removeElement() {

        list.addElement(4);
        list.addElement(3);
        list.addElement(2);

        list.removeElement(1);
        assertEquals(2, list.sizeOfTheList());
    }
}