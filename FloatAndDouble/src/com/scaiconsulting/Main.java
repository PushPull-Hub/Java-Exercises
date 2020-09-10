package com.scaiconsulting;

public class Main {

    public static void main(String[] args) {

        float maxFloatValue = Float.MAX_VALUE ;
        float minFloatValue = Float.MIN_VALUE ;
        System.out.println("The Maximum Float Value is : " + maxFloatValue); // 3.4028235E38
        System.out.println("The Minimum Float Value is : " + minFloatValue); // 1.4E-45

        double maxDoubletValue = Double.MAX_VALUE ;
        double minDoubleValue = Double.MIN_VALUE ;
        System.out.println("The Maximum Double Value is : " + maxDoubletValue); //  1.7976931348623157E308
        System.out.println("The Minimum Double Value is : " + minDoubleValue); //  4.9E-324


        int myIntValue = 5 ;
        float myFloatValue = 5f ;
        double myDoubleValue = 5D ;

        System.out.println("Int value is :" + myIntValue ); // 5
        System.out.println("float value is :" + myFloatValue); // 5.0
        System.out.println("double  value is :" + myDoubleValue); // 5.0

        System.out.println(myIntValue / 3 ); // 2
        System.out.println(myFloatValue / 3f ); // 1.6666666
        System.out.println(myDoubleValue / 3d ); // 1.6666666666666667


        // floating challenge

        int weightInPounds = 200 ;
        double weightConvertedToKilograms = weightInPounds * 0.45359237 ;
        System.out.println(weightConvertedToKilograms);


    }
}
