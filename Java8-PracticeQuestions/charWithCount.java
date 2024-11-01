import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class charWithCount {
    public static void main(String[] args) {
        String s = "Akshay Srivastava";
        Map<Character,Long> ans = s
        .chars()
        .mapToObj(c->(char) c)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ans);
    }
}
