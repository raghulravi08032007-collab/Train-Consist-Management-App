import java.util.ArrayList;
import java.util.List;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class UseCase14TrainConsistMgmt {

    // 🔹 Passenger Bogie class
    static class PassengerBogie {
        String name;
        int capacity;

        // Constructor with validation
        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   UC14 - Custom Exception Validation");
        System.out.println("=========================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // ✅ Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));

            // ❌ Invalid bogie (uncomment to test)
            bogies.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // 🔹 Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}