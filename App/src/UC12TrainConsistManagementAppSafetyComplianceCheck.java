import java.util.*;
import java.util.stream.Collectors;

// Goods Bogie Class
class GoodsBogie {
    private String type;    // Cylindrical, Rectangular, etc.
    private String cargo;   // Petroleum, Coal, Grain, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " - " + cargo;
    }
}

// Main Application
public class UC12TrainConsistManagementAppSafetyComplianceCheck {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Step 2: Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );

        // Step 3: Display result
        System.out.println("=== Train Consist Management App - UC12 ===\n");

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✔");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}