package shiv.parvati.hanuman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shiv.parvati.hanuman.dao.PersonDao;

@SpringBootApplication
public class HanumanApplication implements CommandLineRunner {
    @Autowired
    PersonDao personDao;


    public static void main(String[] args) {
        SpringApplication.run(shiv.parvati.hanuman.HanumanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personDao.callAll();
    }
}