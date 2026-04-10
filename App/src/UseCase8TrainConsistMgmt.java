import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {

    // 🔹 Bogie class (reuse from UC7)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   UC8 - Filter Passenger Bogies (Streams)");
        System.out.println("=========================================\n");

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury", 80));

        // 🔹 Display original list
        System.out.println("Original Bogies:");
        System.out.println(bogies);

        // 🔹 Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 🔹 Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        System.out.println(filteredBogies);

        // 🔹 Verify original list unchanged
        System.out.println("\nOriginal List After Filtering:");
        System.out.println(bogies);
    }
}