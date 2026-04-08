import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("========================================\n");

        // Create HashMap
        HashMap<String, Integer> bogieMap = new HashMap<>();

        // Add bogie-capacity pairs
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 60);
        bogieMap.put("First Class", 24);

        // Display mapping
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 mapping operations completed...");
    }
}