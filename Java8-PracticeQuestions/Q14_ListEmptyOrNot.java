import java.util.*;
public class Q14_ListEmptyOrNot {
    public static void main(String[] args) {
        List<Integer> list = null;
        Optional<List<Integer>> optional = Optional.ofNullable(list);
        optional.ifPresentOrElse(System.out::println, ()->System.out.println("List is empty"));
    }
}
