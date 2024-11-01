import java.util.*;

public class sumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        Optional<Integer> sum = List
        .stream()
        .reduce((x,y)->x+y);
        System.out.println(sum.get());
    }
}
 