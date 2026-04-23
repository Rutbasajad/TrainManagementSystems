import java.util.*;

// ===============================
// Custom Runtime Exception
// ===============================
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ===============================
// Goods Bogie Class
// ===============================
class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargo) {

        try {
            // Safety rule: Rectangular cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Cargo Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Exception Occurred ❌");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed for " + shape + "\n");
        }
    }
}

// ===============================
// Main Application
// ===============================
public class UC15TrainConsistManagementAppCargoSafetyHandling {

    public static void main(String[] args) {

        System.out.println("=== UC15 Cargo Safety Handling ===\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        GoodsBogie b3 = new GoodsBogie("Box");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will trigger exception)
        b2.assignCargo("Petroleum");

        // Safe assignment
        b3.assignCargo("Coal");

        System.out.println("Program continues safely ✔");
    }
}