import java.util.Arrays;
import java.util.stream.IntStream;

public class merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {34, 12, 5, 67, 23, 8};
        int[] arr2 = {9, 45, 2, 56, 3, 71, 18};
        int[] ans = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(ans));
    }
}
