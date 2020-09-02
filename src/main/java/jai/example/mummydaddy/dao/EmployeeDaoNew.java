package jai.example.mummydaddy.dao;

import jai.example.mummydaddy.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeDaoNew {
    public static List<Employee> employeeList = Arrays.asList(new Employee(1, "Dheeraj Sachan", 97000),            new Employee(2, "Vivek Sachan", 100000),
            new Employee(3, "Anjana Sachan", 1500000),
            new Employee(4, "Ashok Kumar", 4000000),
            new Employee(5, "Shiv Devi", 9000000),
            new Employee(6, "James", 770000),
            new Employee(7, "Robert", 6547976));

    public void sort() {
        Collections.sort(employeeList, (e1, e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
        System.out.println("Prints all Employees");
        printNameEndingWith(employeeList, p -> true);
        System.out.println("Prints all Employees ending with \"n\"");

        printNameEndingWith(employeeList, p -> p.getEmployeeName().toLowerCase().endsWith("g"));
        System.out.println("Prints all Employees ending with \"a\"");

        printNameEndingWith(employeeList, p -> p.getEmployeeName().toLowerCase().endsWith("n"));
    }


    public static void printNameEndingWith(List<Employee> employeeList, Condition condition) {
        System.out.println("********************");
        for (Employee e : employeeList) {
            if (condition.test(e))
                System.out.println(e);
        }
    }
}


