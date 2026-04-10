import java.util.LinkedList;

public class UseCase4LinkedListConsist {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("=========================================\n");

        // 🔹 Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // 🔹 Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // 🔹 Display initial train
        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // 🔹 Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry");

        System.out.println("\nAfter adding Pantry Car:");
        System.out.println(train);

        // 🔹 Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // 🔹 Final message
        System.out.println("\nFinal Train Consist Updated Successfully!");
    }
}