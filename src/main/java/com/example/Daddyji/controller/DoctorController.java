package com.example.Daddyji.controller;

import com.example.Daddyji.entity.Doctor;
import com.example.Daddyji.serviceimplementation.DoctorInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.Collection;

@RestController
@RequestMapping
public class DoctorController {
    @Autowired
    DoctorInterfaceImpl doctorInterface;

    @GetMapping("/getAllDoctor")
    public Collection<Doctor> getAllDoctor() {
        return doctorInterface.getAllDoctor();
    }

    @GetMapping(value = "/getOneStudent/{id}")
    public Doctor getOneDoctor(@PathVariable("id") int id) {
        return doctorInterface.getOneDoctor(id);

    }

    @PutMapping
    public String putOneDoctor(@RequestBody Doctor doctor) {
        return doctorInterface.putDoctor(doctor);

    }

    @PostMapping
    public String postDoctor(@RequestBody Doctor doctor) {
        return doctorInterface.postDoctor(doctor);

    }

    @DeleteMapping("/deleteDoctor/{id}")
    public Doctor deleteDoctor(@PathVariable("id") int id) {
        return doctorInterface.deleteDoctor(id);

    }

}
