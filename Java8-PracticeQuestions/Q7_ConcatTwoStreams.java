import java.util.stream.*;
public class Q7_ConcatTwoStreams {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3);
        Stream<Integer> s2 = Stream.of(4,5,6);
        Stream.concat(s1, s2).forEach(System.out::println);
    }
}
