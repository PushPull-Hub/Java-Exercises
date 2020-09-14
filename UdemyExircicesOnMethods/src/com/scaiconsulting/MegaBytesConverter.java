package com.scaiconsulting;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytez = kiloBytes / 1024;
            int kiloBytez = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytez + " MB " + kiloBytez + " KB");
        }

    }
}
