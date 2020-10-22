package com.scaiconsulting;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isDogWakeUp, int hourOfDay) {
        if (isDogWakeUp) {
            if (hourOfDay >= 0 && (hourOfDay < 8 || hourOfDay > 22) && hourOfDay < 24)
                return true;
        }
        return false;
    }

}
