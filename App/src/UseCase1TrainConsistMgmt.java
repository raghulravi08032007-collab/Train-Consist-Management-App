import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("=========================================\n");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display current train state
        System.out.println("Current Train Consist: " + trainConsist);

        // Extra loop (optional – you had it)
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}