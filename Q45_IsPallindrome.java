import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q45_IsPallindrome {
    public static boolean isPalindrome(String str) {

        // Remove spaces and convert to lowercase for uniformity
        List<Character> list = 
        str.chars()
        .mapToObj(c->(char)c)
        .map(c->c.toLowerCase(c))
        .filter(c->c!=' ')
        .collect(Collectors.toList());

        return
        IntStream.range(0, list.size()/2) 
        .allMatch(i->list.get(i)==list.get(list.size()-1-i));

    }   
     public static void main(String[] args) {
        System.out.println(Q45_IsPallindrome.isPalindrome("A man a plan a canal Panama"));
    }
}