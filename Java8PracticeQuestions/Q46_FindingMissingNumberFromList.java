package Java8PracticeQuestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q46_FindingMissingNumberFromList {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,5,6,7,8,9);

        int min = Collections.min(list);
        int max = Collections.max(list);
        //duplicate numbers if present will be removed automatically
        Set<Integer> set = new HashSet<>(list);

        // range - when you want to exclude the upper limit
        // rangeClosed - when you want to include the upper limit
        List<Integer> ans = IntStream.rangeClosed(min,max)
                .filter(n-> !set.contains(n))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
