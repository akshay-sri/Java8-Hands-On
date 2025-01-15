import java.util.Map;
import java.util.stream.Collectors;

public class Q4_CharWithCount {
    public static void main(String[] args) {
        String s = "Akshay Srivastava";
        Map<Character,Long> ans = s
        .chars() // it returns int stream
        .mapToObj(c->(char) c)
        .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(ans);
    }
}
