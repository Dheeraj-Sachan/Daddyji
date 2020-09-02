package preeti.prasad.insominiac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import preeti.prasad.insominiac.controller.EducaionController;

@SpringBootApplication
public class PreetiPrasad implements CommandLineRunner {
    @Autowired
    EducaionController educaionController;
    public static void main(String[] args) {
        SpringApplication.run(preeti.prasad.insominiac.PreetiPrasad.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(educaionController.getAllStudent());;
    }
}
