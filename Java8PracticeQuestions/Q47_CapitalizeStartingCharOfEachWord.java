package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q47_CapitalizeStartingCharOfEachWord {

    public static void main(String[] args) {
        String input = "hello java world";
        String output = Arrays.stream(input.split("\\s+"))
                .map(word -> word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase())
                .collect(Collectors.joining());
        System.out.println(output);
    }
}
