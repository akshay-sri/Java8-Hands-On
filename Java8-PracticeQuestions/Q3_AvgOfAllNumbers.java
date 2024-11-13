import java.util.*;
public class Q3_AvgOfAllNumbers {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(arr);
        //average cannot be applied directly on stream so first we need to convert to int(mapToInt())
        double ans = list
        .stream()
        .mapToInt(e->e)
        .average()
        .getAsDouble();
        System.out.println(ans);
    }
}
