package com.train.app;

import java.util.ArrayList;
import java.util.List;

public class UseCase2PassengerBogies {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("=========================================\n");

        // 🔹 Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 🔹 Display bogies
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // 🔹 Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // 🔹 Check existence (READ operation)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie NOT found.");
        }

        // 🔹 Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}