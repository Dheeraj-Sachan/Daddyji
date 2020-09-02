package mummy.dayy.dadi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tom.example.Mummaji.model.dao.PersonDao;

@SpringBootApplication
public class DadiApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(mummy.dayy.dadi.DadiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}