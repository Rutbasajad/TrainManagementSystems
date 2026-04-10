import java.util.ArrayList;
import java.util.List;

public class UC2AddPassengerBogiestoTrain {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("\nAdding passenger bogies...");

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Remove a bogie
        System.out.println("\nRemoving AC Chair bogie...");
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("Passenger Bogies after removal: " + passengerBogies);

        // Check existence
        System.out.println("\nChecking if Sleeper bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogie List: " + passengerBogies);

        // Program continues...
    }
}