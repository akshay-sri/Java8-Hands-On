import java.util.*;
import java.util.stream.Collectors;
public class Q21_ListToMapRemoveDuplicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(30, "Alice","IT");
        Employee e2 = new Employee(25, "Bob","HR");
        Employee e3 = new Employee(40, "Sachin","Support");
        Employee e4 = new Employee(28, "David","HR");
        Employee e5 = new Employee(40, "Sachin","Support");
        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
        Map<String,Integer> map = employees
        .stream()
        .collect(Collectors.toMap(Employee::getName,Employee::getAge,
        (x,y)->x,()-> new TreeMap<>(Comparator.naturalOrder())));
        System.out.println(map);
    }
}
