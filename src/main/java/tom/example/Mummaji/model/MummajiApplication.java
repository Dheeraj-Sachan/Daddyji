package tom.example.Mummaji.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tom.example.Mummaji.model.dao.PersonDao;

@SpringBootApplication
public class MummajiApplication implements CommandLineRunner {
    @Autowired
    PersonDao personDao;

    public static void main(String[] args) {
        SpringApplication.run(tom.example.Mummaji.model.MummajiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personDao.call();
    }
}
