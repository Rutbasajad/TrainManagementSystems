import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    private String type;

    public Bogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("AC Chair"));
        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("First Class"));
        bogies.add(new Bogie("AC Chair"));
        bogies.add(new Bogie("Sleeper"));

        // Step 2: Convert to stream and group by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped result
        System.out.println("=== Train Consist Management App - UC9 ===\n");

        groupedBogies.forEach((type, list) -> {
            System.out.println("Bogie Type: " + type);
            System.out.println("Count: " + list.size());
            System.out.println("Bogies: " + list);
            System.out.println("------------------------");
        });
    }
}