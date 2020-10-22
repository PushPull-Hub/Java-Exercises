package com.scaiconsulting.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Emo";
        player.health = 20;
        player.Weapon = "pistol";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("the" + player.name + "'s" + " remaining health is " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("the" + player.name + "'s" + " remaining health is " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Elo", 200, "Knife");
        System.out.println(enhancedPlayer.getName() + "'s" + "initial health is : " + enhancedPlayer.getHealth());
    }

}
