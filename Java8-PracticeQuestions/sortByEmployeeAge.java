import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;
public class sortByEmployeeAge {
    public static void main(String[] args) {
        Employee e1 = new Employee(30, "Alice");
        Employee e2 = new Employee(25, "Bob");
        Employee e3 = new Employee(40, "Sachin");
        Employee e4 = new Employee(28, "David");
        Employee e5 = new Employee(32, "Eva");
        List<Employee> employees = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
        List<Employee> sortedEmployees = employees
        .stream()
        .sorted(Comparator.comparing(Employee::getAge))
        .collect(Collectors.toList());
        System.out.println("Sorted Employee list by age:"+sortedEmployees);
    }
    
}
