package jai.example.mummydaddy.serviceImplementation;

import jai.example.mummydaddy.model.Employee;
import jai.example.mummydaddy.seviceinterface.EmployeeInterface;

import java.util.Collection;

public class EmployeeInterfaceImpl implements EmployeeInterface {
    @Override
    public Collection<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getOneEmployeeById(int eId) {
        return null;
    }

    @Override
    public String putEmployee(Employee employee) {
        return null;
    }

    @Override
    public String postEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee deleteEmployee(int eId) {
        return null;
    }
}
