import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {
    // Nested Bogie class MUST be public and static for the test to see it
    public static class Bogie {
        private String id;
        private String type;
        private int capacity;

        public Bogie(String id, String type, int capacity) {
            this.id = id;
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() { return capacity; }
        @Override
        public String toString() { return id + ": " + capacity; }
    }

    public static List<Bogie> filterHighCapacityBogies(List<Bogie> list, int threshold) {
        return list.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }
}