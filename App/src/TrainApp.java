import java.util.LinkedHashSet;

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("UC5 - Preserve Insertion Order of Bogies");

        LinkedHashSet<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(train + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 formation setup completed...");
    }
}