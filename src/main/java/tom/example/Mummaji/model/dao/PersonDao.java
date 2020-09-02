package tom.example.Mummaji.model.dao;

import org.springframework.stereotype.Repository;
import tom.example.Mummaji.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class PersonDao {
    static List<Person> people = Arrays.asList(
            new Person(1, "Dheeraj", "Sachan"),
            new Person(2, "Ravi", "Singh"),
            new Person(3, "Kishore", "Kompally"),
            new Person(4, "Vivek", "Singh")
    );


    public void call() {

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        displayPerson();
        System.out.println("**********************************************");
        getLstNameAsc();
        System.out.println("**********************************************");
        startsWithA();
    }


    public static void displayPerson() {
        for (Person p : people)
            System.out.println(p);
    }

    public static void getLstNameAsc() {
        for (Person p : people) {
            if (p.getLastName().endsWith("n")) System.out.println(p);
        }
    }

    public static void startsWithA() {
        for (Person p : people) {
            if (p.getFistName().toLowerCase().startsWith("a"))
                System.out.println(p);
        }
    }
}

interface inter {
Boolean yes(Person person);
}
