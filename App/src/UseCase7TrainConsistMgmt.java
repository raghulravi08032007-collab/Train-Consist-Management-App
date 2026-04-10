import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistMgmt {

    // 🔹 Inner Bogie class
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
        System.out.println("   UC7 - Sort Bogies by Capacity");
        System.out.println("=========================================\n");

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // 🔹 Display unsorted list
        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // 🔹 Sort using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 Display sorted list
        System.out.println("\nAfter Sorting (by Capacity):");
        System.out.println(bogies);
    }
}