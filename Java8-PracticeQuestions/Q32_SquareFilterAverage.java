import java.util.*;
public class Q32_SquareFilterAverage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6,3));
        double ans = list
        .stream()
        .map(x->x*x)
        .filter(x->x>4)
        .mapToInt(x->x)
        .average()
        .getAsDouble();
        System.out.println(ans);
    }
}
