import java.util.Scanner;

public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   UC20 - Safe Search with Validation");
        System.out.println("=========================================\n");

        // 🔹 Example array (try empty {} to test exception)
        String[] bogieIDs = {"BG101", "BG205", "BG309"};

        // 🔹 FAIL-FAST CHECK
        if (bogieIDs.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train.");
        }

        // 🔹 User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔹 Linear Search after validation
        boolean found = false;

        for (String id : bogieIDs) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // 🔹 Result
        if (found) {
            System.out.println("Bogie Found ✅");
        } else {
            System.out.println("Bogie NOT Found ❌");
        }

        sc.close();
    }
}