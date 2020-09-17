package com.scaiconsulting.Encapsulation;

public class Player {
    public String name;
    public int health = 100;
    public String Weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player Knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
