package com.scaiconsulting;

import java.util.Scanner;

public class UserInput {
    public static void readingUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth :");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            int age = yearOfBirth > 0 && yearOfBirth <= 2020 ? 2020 - yearOfBirth : 0;
            if (age != 0) {
                System.out.println("your name is " + name + ", and you're " + age + " years old");
            } else {
                System.out.println("Invalid year of Birth");
            }

        } else {
            System.out.println("Unable to parse year of birth ...");
        }
        scanner.close();
    }


}
