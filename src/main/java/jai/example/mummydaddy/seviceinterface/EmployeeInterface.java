package jai.example.mummydaddy.seviceinterface;

import jai.example.mummydaddy.model.Employee;

import java.util.Collection;


public interface EmployeeInterface {
    Collection<Employee> getAllEmployees();

    Employee getOneEmployeeById(int eId);

    String putEmployee(Employee employee);

    String postEmployee(Employee employee);

    Employee deleteEmployee(int eId);
}
