import java.util.*;
import java.util.stream.Collectors;
public class duplicateNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 20, 30, 40, 50, -20, 60, 60, -20, -20));
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplIntegers = list
        .stream()
        .filter(x->!set.add(x))
        .collect(Collectors.toSet());
        System.out.println("Duplicate numbers are:"+duplIntegers);
        System.out.println("Distinct numbers"+set);
    }
}
