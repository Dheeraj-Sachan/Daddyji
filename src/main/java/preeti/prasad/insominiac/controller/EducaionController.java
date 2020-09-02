package preeti.prasad.insominiac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import preeti.prasad.insominiac.daoeducation.EducationDao;
import preeti.prasad.insominiac.model.Education;

import java.util.List;

@RestController
@RequestMapping("/education")
@Service
public class EducaionController {
    @Autowired
    EducationDao educationDao;

    @GetMapping
    public List<Education> getAllStudent() {
        return educationDao.call();
    }

    @GetMapping("/getOneStudent/{id}")
    public Education getOneStudent(@PathVariable ("id") int id) {
        return educationDao.getOneStudent(id);
    }


}
