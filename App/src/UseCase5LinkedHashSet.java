import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5LinkedHashSet {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   UC5 - LinkedHashSet Train Formation");
        System.out.println("=========================================\n");

        // 🔹 Create LinkedHashSet
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Add duplicate (will be ignored)
        trainFormation.add("Sleeper");

        // 🔹 Display final formation
        System.out.println("Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);
    }
}