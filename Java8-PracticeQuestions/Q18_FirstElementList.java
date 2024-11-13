import java.util.*;
public class Q18_FirstElementList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6,3));
        list
        .stream()
        .findFirst()
        .ifPresent(System.out::println);
    }
}
