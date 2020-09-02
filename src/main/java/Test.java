import jai.example.mummydaddy.model.Employee;

import java.util.Collections;

import static jai.example.mummydaddy.dao.EmployeeDao.employeeList;

public class Test {
    public static void main(String[] args) {
        TestInterface testInterface = employee -> employee.getEmployeeName().toLowerCase().startsWith("a");
        for (Employee e : employeeList)
            if (testInterface.test(e))
                System.out.println(e);
        System.out.println("^^^^^^^^^");

        Collections.sort(employeeList, (e1, e2) -> {
            if (e1.getESalary() < e2.getESalary()) return -1;
            else if (e1.getESalary() > e2.getESalary()) return +1;
            else return 0;
        });
        for (Employee e : employeeList) System.out.println(e);


    }
}
