import java.util.*;
import java.util.stream.Collectors;
public class Q26_NumbersStartsWith2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,-24,45,26,82,29,222,260,54,266));
        List<Integer> ans = list
        .stream()
        .filter(x->x.toString().startsWith("2") || x.toString().startsWith("-2"))
        .map(Integer::valueOf)
        .collect(Collectors.toList());
        System.out.println(ans);
    }
}
