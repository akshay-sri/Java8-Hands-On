import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class nthHighestAge {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put( "Aditya",24);
        map.put("Akash", 24);
        map.put("Rohit",30);
        map.put("Virat", 30);
        map.put("Sachin", 40);
        map.put("MSD", 40);
        getNthHighestAge(map, 2); //2nd highest age
    }
    public static void getNthHighestAge(Map<String,Integer> e,int n){
        Map.Entry<Integer,List<String>> ans = e.entrySet()
        .stream()
        .collect(Collectors.groupingBy(
            Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
        .collect(Collectors.toList())
        .get(n-1);
        System.out.println(ans);
    }
}
