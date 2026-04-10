import java.util.HashSet;
import java.util.Set;

public class UC3TrackUniqueBogieIDs {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("\nAdding bogie IDs (including duplicates)...");

        // Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Final set output
        System.out.println("\nFinal Set: " + bogieIds);

        // Program continues...
    }
}
