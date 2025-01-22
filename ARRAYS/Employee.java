
import java.util.Arrays;

class Employees implements Comparable<Employees> {

    private String name;
    private int age;
    private int salary;

    public Employees(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employees employee) {
        if (age == employee.age) {
            return (salary - employee.salary);
        }
        return age - employee.age;
    }

    public String toString() {
        return String.format("Employee{"
                + "salary=" + salary
                + ", name='" + name + '\''
                + ", age=" + age
                + '}');
    }

}

public class Employee {

    public static void main(String[] args) {
        Employees[] employees = {
            new Employees(50000, "John", 25),
            new Employees(60000, "Martin", 30),
            new Employees(75000, "Sam", 28),
            new Employees(40000, "Raj", 24),
            new Employees(80000, "Ankit", 32)
        };
        Arrays.sort(employees);
        System.out.println("Sorted Array: " + Arrays.toString(employees));
    }
}
