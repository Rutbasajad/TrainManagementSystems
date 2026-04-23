import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11TrainConsistManagementAppRegexValidation {

    public static void main(String[] args) {

        // Sample inputs (you can change or take user input via Scanner if needed)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Step 1: Define regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Step 3: Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 4: Validate Train ID
        System.out.println("=== Train Consist Management App - UC11 ===\n");

        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID: " + trainId);
        } else {
            System.out.println("Train ID is INVALID: " + trainId);
        }

        // Step 5: Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID: " + cargoCode);
        } else {
            System.out.println("Cargo Code is INVALID: " + cargoCode);
        }
    }
}