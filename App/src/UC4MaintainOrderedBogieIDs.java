import java.util.LinkedList;

public class UC4MaintainOrderedBogieIDs {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("\nAdding bogies to train...");

        // Add bogies (order matters)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert Pantry Car at position 2 (index starts from 0)
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry");

        System.out.println("After Insertion: " + trainConsist);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("Final Train Consist: " + trainConsist);

        // Program continues...
    }
}