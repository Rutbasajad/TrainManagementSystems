import java.util.*;
import java.util.stream.Collectors;

public class UC8FilterPassengerBogiesUsingStreams {

    public static void main(String[] args) {

        // UC7: Existing bogie list (reused)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 90));
        bogies.add(new Bogie("General", 60));
        bogies.add(new Bogie("Premium AC", 100));

        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // UC8: Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        bogies.forEach(System.out::println);
    }
}