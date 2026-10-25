package com.pluralsight;

import java.util.*;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Enter full name
        System.out.print("Please enter your full name: ");
        String fullName = inputScanner.nextLine();

        // Trimming name
        String trimmedName = fullName.trim();

        String[] nameInParts = trimmedName.split("\\s+");

        // Name processing and display
        if (nameInParts.length == 2){
            System.out.println("First name: " + nameInParts[0]);
            System.out.println("Last name: " + nameInParts[1]);
        } else if (nameInParts.length == 3) {
            System.out.println("First name: " + nameInParts[0]);
            System.out.println("Middle name: " + nameInParts[1]);
            System.out.println("Last name: " + nameInParts[2]);
        }else {
            System.out.println("Invalid format.");
        }

    }
}
