import java.util.*;
public class Q2_ArrayToStream {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,7,6};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
