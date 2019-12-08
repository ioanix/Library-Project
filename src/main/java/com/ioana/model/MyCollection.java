package com.ioana.model;

import java.util.ArrayList;

public class MyCollection<T extends Book> { // clasa nou pentru a demonstra cum am folosit generics


    private String nameOfTheCollection;
    private ArrayList<T> lista = new ArrayList<>(); // am pus un generic T pentru a ma asigura ca intr-o anumita colectie se pot adauga doar
                                                    // un anume tip de carti



    public MyCollection(String nameOfTheCollection) {

        this.nameOfTheCollection = nameOfTheCollection;
    }


    public String getNameOfTheCollection() {
        return nameOfTheCollection;
    }


    public boolean addToCollection(T item) {

        if(lista.contains(item)) {

            System.out.println(item.getTitle() + " is already in this collection");
            return false;

        } else {

            lista.add(item);
            System.out.println(item.getTitle() + " was added to the collection");
            return true;

        }
    }

    public void printCollection() {

//        for(int i = 0; i < lista.size(); i++) {
//
//            System.out.println(nameOfTheCollection + ": " + lista.get(i).getTitle() + " " + lista.get(i).getAuthor());
//        }

        for(T collection : lista) {

            System.out.println( nameOfTheCollection + ": " + collection.getTitle() + " " + collection.getAuthor());
        }
    }
}
