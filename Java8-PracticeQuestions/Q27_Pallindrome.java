import java.util.*;
import java.util.stream.Collectors;;
public class Q27_Pallindrome {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("racecar", "rotor", "Journey", "Harmony", "level", "civic", "Breeze", "madam", "Melody", "Dream");
        list = list.stream()
        .filter(s->s.equals(new StringBuilder(s).reverse().toString()))
        .collect(Collectors.toList());
        System.out.println(list);
    }
}
