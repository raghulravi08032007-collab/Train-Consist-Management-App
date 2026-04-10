import java.util.Arrays;
import java.util.Scanner;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   UC19 - Binary Search (Bogie ID)");
        System.out.println("=========================================\n");

        // 🔹 Unsorted array (we will sort first)
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 🔹 Sort array (IMPORTANT for binary search)
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // 🔹 User input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔹 Binary Search
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                System.out.println("Bogie Found at position: " + mid);
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        // 🔹 Not found case
        if (!found) {
            System.out.println("Bogie NOT found");
        }

        sc.close();
    }
}