import java.util.*;

public class Q34_SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        int sum = List
        .stream()
        .mapToInt(x->x)
        .sum();
        System.out.println(sum);
    }
}
 