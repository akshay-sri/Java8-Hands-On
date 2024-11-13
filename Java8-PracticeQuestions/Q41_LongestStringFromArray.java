import java.util.Arrays;

public class Q41_LongestStringFromArray {
    public static void main(String[] args) {
        String[] s = {"Apple","Banana","Litchi","Mango"};
        String ans = Arrays.stream(s).reduce((x,y)->x.length()>=y.length()?x:y).toString();
        System.out.println(ans);
    }
}
