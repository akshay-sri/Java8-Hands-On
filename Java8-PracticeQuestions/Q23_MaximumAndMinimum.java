import java.util.*;
public class Q23_MaximumAndMinimum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,7,9,10,45,21,46,67,24);
        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum from list is:"+max);
        System.out.println("Minimum from list is:"+min);
    }
}
