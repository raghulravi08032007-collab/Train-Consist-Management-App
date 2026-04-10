import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmt {

    // 🔹 Goods Bogie class
    static class GoodsBogie {
        String type;   // Cylindrical / Open / Box
        String cargo;  // Petroleum / Coal / Grain

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=========================================");
        System.out.println("   UC12 - Safety Compliance Check");
        System.out.println("=========================================\n");

        // 🔹 Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // ❌ Try this to test failure:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // 🔹 Display bogies
        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);

        // 🔹 Safety validation using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // 🔹 Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is UNSAFE ❌");
        }
    }
}