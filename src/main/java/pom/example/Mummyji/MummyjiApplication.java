package pom.example.Mummyji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pom.example.Mummyji.charoccurence.GetCharOccurence;

@SpringBootApplication
public class MummyjiApplication implements CommandLineRunner {
    @Autowired
    GetCharOccurence getCharOccurence;

    public static void main(String[] args) {
        SpringApplication.run(MummyjiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        getCharOccurence.getOccurence("Preeti Prasad");
        System.out.println("This is inside Command Line runner");
    }
}
