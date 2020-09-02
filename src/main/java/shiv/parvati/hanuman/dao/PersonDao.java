package shiv.parvati.hanuman.dao;

import org.springframework.stereotype.Repository;
import shiv.parvati.hanuman.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class PersonDao {

    static List<Person> list = Arrays.asList(
            new Person(1, "Dheeraj Sachan", "Army School"),
            new Person(2, "Vivek Sachan", "Harward"),
            new Person(3, "Anjana Sachan", "Pokhrayan"),
            new Person(4, "Ashok Kumar", "Cincinnati")

    );

    public void callAll() {
        System.out.println("Sort all in School Alphabetical Order");
        Collections.sort(list, (p1, p2) -> p1.getPName().compareTo(p2.getPName()));
        System.out.println("Print All the Persons");
        print(list, p -> true);
        System.out.println("Print all the persons with name ending with \"n\"");
        print(list, p -> p.getPName().toLowerCase().endsWith("n"));
        System.out.println("Print all the persons with name starting with \"A\"");
        print(list, p -> p.getPName().toLowerCase().startsWith("a"));

    }

    public static void print(List<Person> list, Check check) {
        for (Person p : list)
            if (check.test(p))
                System.out.println(p);

    }
}

interface Check {
    Boolean test(Person person);
}
