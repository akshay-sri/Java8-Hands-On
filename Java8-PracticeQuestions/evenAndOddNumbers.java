import java.util.*;
import java.util.stream.Collectors;
public class evenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4,6,334,54,67,89,32));
        Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(map);
    }
}
