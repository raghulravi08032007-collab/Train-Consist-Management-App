import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   UC11 - Validate Train ID & Cargo Code");
        System.out.println("=========================================\n");

        Scanner sc = new Scanner(System.in);

        // 🔹 Input from user
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // 🔹 Regex Patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // 🔹 Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // 🔹 Match input
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // 🔹 Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        // 🔹 Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        sc.close();
    }
}