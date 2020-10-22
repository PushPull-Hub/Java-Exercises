package com.scaiconsulting.Encapsulation2;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex;


    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int value) {
        if (value >= 0 && value <= 100) {
            this.tonerLevel = tonerLevel + value;
            System.out.println("your toner level filled up, your current toner level is " + this.tonerLevel);
        } else if (value > 0) {
            this.tonerLevel = 100;
            System.out.println("the maximum value you can reach is 100% ");
        } else {
            System.out.println("Invalid data");
        }
        getTonerLevel();
    }

    public void printPages(int numberOfPages, boolean isDuplex) {
        if (this.tonerLevel > 0) {
            if (isDuplex) {
                this.printedPages = this.printedPages + (numberOfPages * 2);
                if (this.tonerLevel - (numberOfPages * 2) < 0) {
                    this.tonerLevel = 0;
                } else if (this.tonerLevel - (numberOfPages * 2) > 0) {
                    this.tonerLevel = this.tonerLevel - numberOfPages * 2;
                }
                getTonerLevel();
            } else {
                this.printedPages = this.printedPages+numberOfPages;
                this.tonerLevel = this.tonerLevel-numberOfPages;
                getTonerLevel();
            }
            System.out.println("the number of printed pages is " + this.printedPages);
            getTonerLevel();
        } else {
            System.out.println("the toner level is 0 try to fill it up .");
        }

    }

    public void getTonerLevel() {
        System.out.println("your current toner level is " + this.tonerLevel + " (from getTonerLevel method) .");

    }

}
