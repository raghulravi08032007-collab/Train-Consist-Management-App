import java.util.ArrayList;
import java.util.List;

// 🔹 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class UseCase15TrainConsistMgmt {

    // 🔹 Goods Bogie class
    static class GoodsBogie {
        String shape;   // Cylindrical / Rectangular
        String cargo;   // Petroleum / Coal / Grain

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // 🔹 Assign cargo with safety validation
        void assignCargo(String cargo) {
            try {
                // ❌ Unsafe rule
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // ✅ Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.\n");
            }
        }

        @Override
        public String toString() {
            return shape + " -> " + (cargo != null ? cargo : "No Cargo");
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   UC15 - Safe Cargo Assignment");
        System.out.println("=========================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        // 🔹 Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);

        // 🔹 Safe assignment
        b1.assignCargo("Petroleum");

        // 🔹 Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // 🔹 Another safe assignment
        b2.assignCargo("Coal");

        // 🔹 Final state
        System.out.println("Final Bogie Status:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }
    }
}