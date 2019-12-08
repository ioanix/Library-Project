package com.ioana.model;

public enum PaperQuality {

    POOR("Poor",35-55), GOOD("Good", 90), EXTRA("Extra", 130-250);

    private String type;
    private int number;

    PaperQuality(String type, int number) {

        this.type = type;
        this.number = number;
    }


    public void paperDetails() {

        switch(type) {

            case "Poor":
                System.out.println("This is not a very good quality paper");
                break;

            case "Good":
                System.out.println("This paper's quality is ok");
                break;

            case "Extra":
                System.out.println("This is the best paper");
                break;

        }
    }


    @Override
    public String toString() {

        return this.type;
    }
}
