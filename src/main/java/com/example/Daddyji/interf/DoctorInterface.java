package com.example.Daddyji.interf;

import com.example.Daddyji.entity.Doctor;

import java.util.Collection;

public interface DoctorInterface {
    Collection<Doctor> getAllDoctor();

    Doctor getOneDoctor(int doctorId);

    String putDoctor(Doctor doctor);

    String postDoctor(Doctor doctor);

    Doctor deleteDoctor(int dId);
}
