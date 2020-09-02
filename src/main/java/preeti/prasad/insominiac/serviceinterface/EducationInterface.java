package preeti.prasad.insominiac.serviceinterface;

import preeti.prasad.insominiac.model.Education;

import java.util.List;

public interface EducationInterface {
    List<Education> getAllStudent();
    Education getOneStudent();
    String putStudent(Education education);
    String postStudent(Education education);
    String deleteStudent(int sId);

}
