import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;
public class frequencyOfEachWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language and java is Object Oriented";
        Map<String,Long> ans = Arrays
        .stream(sentence.split("\\s+"))
        .collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
        System.out.println(ans);
    }
}
