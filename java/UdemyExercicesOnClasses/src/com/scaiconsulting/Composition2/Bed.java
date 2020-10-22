package com.scaiconsulting.Composition2;

public class Bed {

    private String style ;
    private int pillow ;
    private int height ;
    private int sheets ;

    public Bed(String style, int pillow, int height, int sheets) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
    }

    public void make () {
        System.out.println("Bed is making (from Bed Class) ");
    }

}
