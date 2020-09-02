package preeti.prasad.insominiac.daoeducation;

import org.springframework.stereotype.Repository;
import preeti.prasad.insominiac.model.Education;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class EducationDao {
    List<Education> list = Arrays.asList(
            new Education(1, "Anjana Sachan", "Army School"),
            new Education(2, "Vivek Sachan", "Kendriya Vidyalaya"),
            new Education(3, "Ashok Sachan", "Oxford Vidyalaya"),
            new Education(4, "Dheeraj Sachan", "Harvard "));

    public List<Education> call() {
        Collections.sort(list, (e1, e2) -> e1.getStudentName().compareTo(e2.getStudentName()));
        System.out.println("Print all Students");
        return list;
    }

    public Education getOneStudent(int eId) {
        for (Education e : list) {
            if (eId == e.getStudentID())
                return e;

        }
        return new Education(0, "Nothing", "Nothing");
    }

    public String putStudent(Education education) {
        Boolean b = false;
        for (Education e : list) {
            if (education.getStudentID() == e.getStudentID())
                b = true;

        }
        if (b == false)
            list.add(education);
        return "The Student has been inserted";
    }

    public String postStudent(Education education) {
        list.add(education);
        return "The new Student has been poseted";
    }

    public String deleteStudent(int eId) {
        for (Education education : list) {
            if (education.getStudentID() == eId) ;
            list.remove(education);

        }
        return "It has been removed";
    }
}