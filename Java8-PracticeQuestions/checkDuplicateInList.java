import java.util.*;
public class checkDuplicateInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,6,3,4,6);
        if(list.stream().distinct().count()!=list.size()){
            System.out.println("Duplicate element present");
        }
        else{
            System.out.println("No Duplicate elements");
        }
    }
}
