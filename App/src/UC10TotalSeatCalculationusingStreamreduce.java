import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
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

// Main Application
public class UC10TotalSeatCalculationusingStreamreduce {

    public static void main(String[] args) {

        // Step 1: Create list of bogies with capacity
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Extract capacities using map()
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // Step 3: Display result
        System.out.println("=== Train Consist Management App - UC10 ===");
        System.out.println("Total Seating Capacity of Train = " + totalSeats);
    }
}