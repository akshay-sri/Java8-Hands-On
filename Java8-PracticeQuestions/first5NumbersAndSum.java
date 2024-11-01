import java.util.Arrays;
import java.util.List;

public class first5NumbersAndSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(87, 23, 56, 14, 92, 39, 61, 3, 75, 48);

        // get first 5 numbers
        int sum5 = list
        .stream()
        .limit(5)
        .reduce((x,y)->x+y).get();
        System.out.println("Sum of first 5:"+sum5);

        // skip first 5 numbers
        int skip5 = list
        .stream()
        .skip(5)
        .reduce((x,y)->x+y).get();
        System.out.println("Sum after skipping first 5:"+skip5);
    }
}
