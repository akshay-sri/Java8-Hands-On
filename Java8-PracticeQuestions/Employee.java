public class Employee {
    int age;
    String name;
    String dept;
    public Employee(int age, String name, String dept){
        this.age = age;
        this.name = name;
        this.dept = dept;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDept(){
        return dept;
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", dept=" + dept + '\'' +
                '}';
    }
}
