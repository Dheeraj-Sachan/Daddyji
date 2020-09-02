package jai.example.mummydaddy;

import jai.example.mummydaddy.dao.EmployeeDao;
import jai.example.mummydaddy.dao.EmployeeDaoNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MummyDaddyJiApplication implements CommandLineRunner {
    @Autowired
    EmployeeDaoNew employeeDao;

    public static void main(String[] args) {
        SpringApplication.run(jai.example.mummydaddy.MummyDaddyJiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Calling through MummyDaddyJiApplication");
        employeeDao.sort();

    }
}
