package com.scaiconsulting;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500) ;
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition= calculateHighScorePosition(400);
        displayHighScorePosition("Mohammed", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Maya" , highScorePosition);

    }

    public static void displayHighScorePosition ( String playerName , int highScoreposition ) {
        System.out.println(playerName +" managed to get into "+ highScoreposition +" on the high score table ");
    }

    public static int calculateHighScorePosition (int playerScore) {
        int highScorePosition ;

        if (playerScore >= 1000 ){
            highScorePosition = 1 ;
        }else if (playerScore >= 500 ) {
            highScorePosition = 2 ;
        } else if (playerScore >= 100 ) {
            highScorePosition = 3 ;
        } else {
            highScorePosition = 4 ;
        }
        return highScorePosition ;
    }
}
