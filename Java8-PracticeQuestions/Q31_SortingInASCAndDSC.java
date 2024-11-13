import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q31_SortingInASCAndDSC {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(43, 12, 98, 5, 76, 30, 25, 67, 9, 50);
        List<Integer> ascList = list
        .stream()
        .sorted()
        .collect(Collectors.toList());
        List<Integer> dscList = list
        .stream()
        .sorted(Collections.reverseOrder())
        .collect(Collectors.toList());
       System.out.println("List in ascending order:"+ascList);
       System.out.println("List in descending order:"+dscList);
    }    
}
