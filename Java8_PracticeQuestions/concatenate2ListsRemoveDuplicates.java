import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class concatenate2ListsRemoveDuplicates {
    public static void main(String[] args) {
        String[] str1 = {"apple","banana","orange"};
        String[] str2 = {"banana","kiwi","grape"};
        List<String> ans = Stream
        .concat(Arrays.stream(str1), Arrays.stream(str2))
        .distinct()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(ans); 
    }
}
