import java.util.ArrayList;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("========================================\n");

        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + bogies + "\n");

        // Remove AC Chair
        bogies.remove("AC Chair");

        // After removing
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + bogies + "\n");

        // Check existence
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + bogies.contains("Sleeper") + "\n");

        // Final output
        System.out.println("Final Train Passenger Consist:");
        System.out.println(bogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}