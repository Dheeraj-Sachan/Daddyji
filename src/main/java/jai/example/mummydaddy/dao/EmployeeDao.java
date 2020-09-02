package jai.example.mummydaddy.dao;

import jai.example.mummydaddy.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class EmployeeDao {
 public static    List<Employee> employeeList = Arrays.asList(new Employee(1, "Dheeraj Sachan", 97000),
            new Employee(2, "Vivek Sachan", 100000),
            new Employee(3, "Anjana Sachan", 1500000),
            new Employee(4, "Ashok Kumar", 4000000),
            new Employee(5, "Shiv Devi", 9000000),
            new Employee(6, "James", 770000),
            new Employee(7, "Robert", 6547976));


    public void sort() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        System.out.println("Prints all Employees");
        printAllEployee(employeeList);
        System.out.println("Prints all Employees ending with \"n\"");

        printNameEndingWithS(employeeList, new Condition() {
            @Override
            public Boolean test(Employee employee) {
                return employee.getEmployeeName().toLowerCase().endsWith("n");
            }
        });
        System.out.println("Prints all Employees ending with \"a\"");

        printNameEndingWithS(employeeList, new Condition() {
            @Override
            public Boolean test(Employee employee) {
                return employee.getEmployeeName().toLowerCase().startsWith("a");
            }
        });
    }

    public static void printAllEployee(List<Employee> employeeList) {
        for (Employee e : employeeList)
            System.out.println(e);


    }

    public static void printNameEndingWithS(List<Employee> employeeList,Condition condition) {
        System.out.println("********************");
        for (Employee e : employeeList) {
           if( condition.test(e))
               System.out.println(e);;

        }

    }
}

interface Condition {
    Boolean test(Employee employee);
}
