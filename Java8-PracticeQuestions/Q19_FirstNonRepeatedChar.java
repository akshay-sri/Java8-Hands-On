import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q19_FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "abracadabra";
        Character ch = s
        .chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(x->x.getValue()==1)
        .map(Map.Entry::getKey)
        .findFirst()
        .get();
        System.out.println(ch);
    }
}
