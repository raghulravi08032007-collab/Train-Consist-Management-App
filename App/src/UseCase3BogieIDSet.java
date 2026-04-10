package com.train.app;

import java.util.HashSet;
import java.util.Set;

public class UseCase3BogieIDSet {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("=========================================\n");

        // 🔹 Create HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // 🔹 Add bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // 🔹 Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        // 🔹 Show size (duplicates removed automatically)
        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());
    }
}