package com.example.Daddyji.serviceimplementation;

import com.example.Daddyji.dao.DoctorDao;
import com.example.Daddyji.entity.Doctor;
import com.example.Daddyji.interf.DoctorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DoctorInterfaceImpl implements DoctorInterface {
    @Autowired
    DoctorDao doctorDao;

    @Override
    public Collection<Doctor> getAllDoctor() {
        return doctorDao.getAllDoctor();
    }

    @Override
    public Doctor getOneDoctor(int doctorId) {
        return doctorDao.getOneDoctor(doctorId);
    }

    @Override
    public String putDoctor(Doctor doctor) {
        return doctorDao.putDoctor(doctor);
    }

    @Override
    public String postDoctor(Doctor doctor) {
        return doctorDao.postDoctor(doctor);
    }

    @Override
    public Doctor deleteDoctor(int dId) {
        return doctorDao.deleteDoctor(dId);
    }
}
