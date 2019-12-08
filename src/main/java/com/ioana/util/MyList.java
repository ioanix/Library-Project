package com.ioana.util;


import java.util.Arrays;


public class MyList {



    private int[] elementsList = new int[0];

    //private int x = 2;




    public int sizeOfTheList() {


        return this.elementsList.length;
    }


    public int getElement(int index) {

        System.out.println("Element at index " + index + " is " + elementsList[index]);
        return elementsList[index];
    }


    public void addElement(int newElement) { // metoda de adaugare

        int[] newArray = Arrays.copyOf(this.elementsList, this.elementsList.length + 1); // we declare another array in which we copy all the values from the initial array,
                                                                                                   // but the length will be the length of the original array + 1


        newArray[newArray.length - 1] = newElement; // on the last index of the new array we put the new element

        elementsList = newArray; // dereferencing the field elementsList to now point to what the newArray is pointing to

        System.out.println(newElement + " was added to the list");


    }


    public void removeElement(int index) {

        int k  = 0;

        int[] newArray = new int[this.elementsList.length - 1]; // declare a new array of length equal to the length of the old array -1

        for(int i = 0; i < this.elementsList.length; i++) {

            if(index == i) { // if the index of the element we want to remove is = to i we continue with the execution of the program
                            // without adding the element to the newArray

                continue;
            }

            newArray[k++] = elementsList[i]; // copy the elements of the old array into the newArray

        }

        System.out.println(elementsList[index] + " was removed from the list");

        elementsList = newArray;


    }

    @Override
    public String toString() {

        return Arrays.toString(elementsList);
    }
}
