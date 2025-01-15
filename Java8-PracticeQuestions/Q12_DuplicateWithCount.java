import java.util.*;
import java.util.stream.Collectors;
public class Q12_DuplicateWithCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 3, 2, 4);
        Map<Integer,Long> map = list
        .stream()
        .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        map
        .entrySet()
        .stream()
        .filter(m->m.getValue()>1)
        .forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
    }
}
