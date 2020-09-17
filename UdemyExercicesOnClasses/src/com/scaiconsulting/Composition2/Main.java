package com.scaiconsulting.Composition2;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("Est");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(10, "Red");
        Bed bed = new Bed("Modern", 2, 2, 1);
        Lamp lamp = new Lamp("Classic", false);

        Bedroom bedRoom = new Bedroom("Hamza's Bed", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.turnOnLight();
        bedRoom.getCeilingColor();

    }


}
