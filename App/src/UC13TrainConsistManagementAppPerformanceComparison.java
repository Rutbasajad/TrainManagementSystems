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
        return type + " (" + capacity + ")";
    }
}

// Main Application
public class UC13TrainConsistManagementAppPerformanceComparison {

    public static void main(String[] args) {

        // Step 1: Create dataset
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40),
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 65),
                new Bogie("Goods", 50),
                new Bogie("Sleeper", 80)
        );

        System.out.println("=== UC13 Performance Comparison (Loop vs Stream) ===\n");

        // =========================
        // LOOP BASED FILTERING
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================
        // STREAM BASED FILTERING
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================
        // OUTPUT RESULTS
        // =========================

        System.out.println("Loop Result: " + loopResult);
        System.out.println("Loop Execution Time (ns): " + loopTime + "\n");

        System.out.println("Stream Result: " + streamResult);
        System.out.println("Stream Execution Time (ns): " + streamTime + "\n");

        // =========================
        // COMPARISON RESULT
        // =========================
        if (loopResult.size() == streamResult.size()) {
            System.out.println("RESULT MATCH ✔ Both approaches give same output");
        } else {
            System.out.println("RESULT MISMATCH ❌");
        }
    }
}