import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("=========================================\n");

        // 🔹 Create HashMap (Bogie → Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // 🔹 Insert bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 40);

        // 🔹 Display all bogie capacities
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // 🔹 Example lookup (important concept)
        System.out.println("\nCapacity of Sleeper: " + capacityMap.get("Sleeper"));
    }
}