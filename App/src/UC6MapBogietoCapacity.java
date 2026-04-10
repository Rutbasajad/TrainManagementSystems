import java.util.HashMap;
import java.util.Map;

public class UC6MapBogietoCapacity{

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("\nAdding bogie capacities...");

        // Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie capacities
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        // Example lookup
        System.out.println("\nChecking capacity of Sleeper bogie...");
        int capacity = bogieCapacityMap.get("Sleeper");
        System.out.println("Sleeper Capacity: " + capacity + " seats");

        // Program continues...
    }
}