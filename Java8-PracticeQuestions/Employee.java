public class Employee {
    int age;
    String name;
    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
