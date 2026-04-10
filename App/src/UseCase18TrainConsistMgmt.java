import java.util.Scanner;

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   UC18 - Linear Search (Bogie ID)");
        System.out.println("=========================================\n");

        // 🔹 Array of bogie IDs (unsorted)
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔹 Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++) {

            if (bogieIDs[i].equals(key)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // 🔥 Early termination
            }
        }

        // 🔹 Result if not found
        if (!found) {
            System.out.println("Bogie NOT found");
        }

        sc.close();
    }
}