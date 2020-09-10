package com.scaiconsulting;

public class Main {

    public static void main(String[] args) {

        long maxLong = Long.MAX_VALUE ;
        long minLong = Long.MIN_VALUE;
        System.out.println("the maximum value of an long is : " + maxLong);
        System.out.println("the minimum value of an long is : " + minLong );

        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;
        System.out.println("the maximum value of an Integer is : " + maxInteger);
        System.out.println("the minimum value of an Integer is : " +  minInteger);

        short maxShort = Short.MAX_VALUE ;
        short minShort = Short.MIN_VALUE ;
        System.out.println("the maximum value of a short : " + maxShort );
        System.out.println("the minimum value of a short  : " + minShort );

        byte maxByte = Byte.MAX_VALUE ;
        byte minByte = Byte.MIN_VALUE ;
        System.out.println("the maximum value of a byte is : " + maxByte );
        System.out.println("the minimum value of a byte is : " + minByte );


        // Primitive Types challenge

        byte myByteVariable = 123 ;
        short myShortVariable = 12346 ;
        int myIntVariable = 12345678 ;
        int sum = myByteVariable + myShortVariable + myIntVariable ;
        long myLongVariable = 5000 + (sum*10) ;

        System.out.println("Long Variable = "+myLongVariable);

    }
}
