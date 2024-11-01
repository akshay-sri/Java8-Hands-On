import java.util.*;
import java.util.stream.Collectors;
public class listToMapRemoveDuplicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(30, "Alice");
        Employee e2 = new Employee(25, "Bob");
        Employee e3 = new Employee(40, "Sachin");
        Employee e4 = new Employee(28, "David");
        Employee e5 = new Employee(32, "Eva");
        Employee e6 = new Employee(40, "Sachin");
        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6);
        Map<String,Integer> map = employees
        .stream()
        .collect(Collectors.toMap(Employee::getName,Employee::getAge,
        (x,y)->x,()-> new TreeMap<>(Comparator.naturalOrder())));
        System.out.println(map);
    }
}
