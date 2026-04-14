import java.util.ArrayList;
import java.util.List;

public class UseCase8TrainConsistMgmtTest {

    public static void main(String[] args) {
        testFilter_CapacityGreaterThanThreshold();
    }

    public static void testFilter_CapacityGreaterThanThreshold() {
        System.out.println("Running: testFilter_CapacityGreaterThanThreshold");

        // Reference the class directly
        List<UseCase8TrainConsistMgmt.Bogie> list = new ArrayList<>();
        list.add(new UseCase8TrainConsistMgmt.Bogie("T1", "Sleeper", 75));
        list.add(new UseCase8TrainConsistMgmt.Bogie("T2", "General", 40));

        // Call the static method
        List<UseCase8TrainConsistMgmt.Bogie> result = UseCase8TrainConsistMgmt.filterHighCapacityBogies(list, 60);

        if (result.size() == 1 && result.get(0).getCapacity() == 75) {
            System.out.println("SUCCESS: Found bogie > 60");
        } else {
            System.out.println("FAILURE: Logic error in filtering");
        }
    }
}