import java.util.LinkedHashSet;
import java.util.Set;

public class UC5PreserveInsertionOrderofBogies {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("\nAdding bogies to train...");

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate bogie (Sleeper)...");
        trainFormation.add("Sleeper"); // duplicate ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Also print as a collection
        System.out.println("\nFormation List: " + trainFormation);

        // Program continues...
    }
}