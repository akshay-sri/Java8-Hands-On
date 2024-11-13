import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q30_SortAccordingToLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sunshine", "Rainbow", "Journey", "Harmony","ant", "Whisper", "Twilight", "Breeze", "Starlight", "Melody", "Dream");
        List<String> ans = list
        .stream()
        .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());
        System.out.println(ans);
    }
}
