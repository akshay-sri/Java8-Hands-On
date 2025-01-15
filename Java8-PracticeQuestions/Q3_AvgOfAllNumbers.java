import java.util.*;
public class Q3_AvgOfAllNumbers {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        //average cannot be applied directly on stream so first we need to convert to int(mapToInt())
        double a = Arrays.stream(arr).mapToInt(x->x).average().getAsDouble();
        System.out.println(a);
    }
}
