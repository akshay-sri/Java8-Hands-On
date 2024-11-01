import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondHighestAndLowest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 3, 12, 9, 7, 14, 6, 3, 12, 9, 5, 14, 6, 7);
        int secondHighest = list
        .stream()
        .sorted(Collections.reverseOrder())
        .distinct()
        .skip(1)
        .findFirst()
        .get();
        
        int secondLowest = list
        .stream()
        .sorted()
        .distinct()
        .skip(1)
        .findFirst()
        .get();

        System.out.println("Second Highest is:"+secondHighest);
        System.out.println("Second Lowest is:"+secondLowest);
    }
}
