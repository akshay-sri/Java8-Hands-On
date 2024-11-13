import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class Q38_ListInParticularFormat {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Litchi");
        String ans = fruits
        .stream()
        .collect(Collectors.joining("," ,"[","]"));
        System.out.println(ans);
    }
}
