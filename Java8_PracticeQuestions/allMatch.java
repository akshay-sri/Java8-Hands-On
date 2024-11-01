import java.util.Arrays;
import java.util.*;
public class allMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,72,8,34,6,3);
        boolean flag = list.stream().allMatch(x->x%2!=0);
        System.out.println(flag);
    }
    
}
