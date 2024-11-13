import java.util.*;
public class Q35_TotalNumberOfElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list.stream().count());
    }
}
