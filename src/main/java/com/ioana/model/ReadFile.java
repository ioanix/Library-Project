package com.ioana.model;

import java.io.File;
import java.util.Scanner;

public class ReadFile {


    private Scanner sc;

    public void openFile() {

        try {

            sc = new Scanner(new File("/Users/ioanatagurean/documents/documents.txt"));
        }

        catch(Exception e) {

            System.out.println("Could not open file");
        }
    }

    public void readFile() {

        while(sc.hasNext()) {

            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            String d = sc.next();
            String e = sc.next();

            System.out.printf("%s %s %s %s %s\n", a, b, c, d, e);


        }
    }

    public void closeFile() {

        sc.close();
    }
}
