import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lowercaseString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sunshine", "Rainbow", "Journey", "Harmony", "Whisper", "Twilight", "Breeze", "Starlight", "Melody", "Dream");
        List<String> ans = list.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
        System.out.println(ans);
    }
}
