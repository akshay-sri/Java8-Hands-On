import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Q15_EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,6,334,54,67,89,32));
        List<Integer> even = list
        .stream()
        .filter(x->x%2==0)
        .collect(Collectors.toList());
        System.out.println(even);
    }
}
