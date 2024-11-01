import java.util.Random;
import java.util.stream.*;
public class print10RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream
        .generate(r::nextInt)
        .limit(10)
        .forEach(System.out::println);
    }
}
