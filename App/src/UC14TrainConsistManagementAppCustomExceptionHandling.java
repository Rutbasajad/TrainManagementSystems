import java.util.*;

// ===============================
// Custom Exception Class
// ===============================
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ===============================
// Passenger Bogie Class
// ===============================
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

// ===============================
// Main Application
// ===============================
public class UC14TrainConsistManagementAppCustomExceptionHandling {

    public static void main(String[] args) {

        System.out.println("=== UC14 Custom Exception Handling ===\n");

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            System.out.println("Created: " + b1);
            System.out.println("Created: " + b2);

            // Invalid bogies (uncomment to test exceptions)
            PassengerBogie b3 = new PassengerBogie("First Class", -10);
            PassengerBogie b4 = new PassengerBogie("Second Class", 0);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Occurred ❌");
            System.out.println(e.getMessage());
        }

        System.out.println("\nProgram continues safely ✔");
    }
}