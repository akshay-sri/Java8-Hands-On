import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;
public class Q9_FirstCharCountInList {
    public static void main(String[] args) {
        String[] names = {"Alice","Bob","Sachin","David","Eva","Akshay","Ayushi","Subhash"};
        Map<Character,Long> ans = Arrays
        .stream(names)
        .collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
        System.out.println(ans);
    }
}
