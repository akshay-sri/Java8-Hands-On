import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class listOfListsToList {
    public static void main(String[] args) {
        List<List<String>> list = 
        Arrays.asList(Arrays.asList("one","two"),Arrays.asList("three","four"));
        List<String> ans =list
        .stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
        System.out.println(ans);
    }
}