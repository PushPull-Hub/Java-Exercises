package com.scaiconsulting;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2 ;
        System.out.println("1 + 2 =" + result);
        int previousResult = result ;
        System.out.println("previous result is : " + previousResult);
        result = result + 1 ;
        System.out.println( "result after adding 1 is : " + result);
        System.out.println("previous result after adding 1 to result is : " + previousResult);

        // the remainder
        result = result % 3 ;
        System.out.println(result); // 1

        // abbreviation
        result++ ; // result = result + 1
        result-- ; // result = result -1
        result+=2 ; // result = result +2
        result*=10 ; //  result = result * 10


        int topScore = 100 ;
        int yourScore = 90 ;
        if (yourScore >= topScore) {
            System.out.println("you got the higher score");
        } else {
            System.out.println("You didn't get the higher score ");
        }

        // && Logical AND operator
        // || Logical OR operator
    }
}
