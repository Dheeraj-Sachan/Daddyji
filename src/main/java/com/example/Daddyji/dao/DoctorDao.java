package com.example.Daddyji.dao;

import com.example.Daddyji.entity.Doctor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DoctorDao {
    private static Map<Integer, Doctor> map;

    static {
        map = new HashMap() {
            {
                put(1, new Doctor(1, "DHeeraj", "Yashoda Hospital"));
                put(2, new Doctor(2, "Vivek", "KIMS Hospital"));
                put(3, new Doctor(3, "Anjana", "Sunshine Hospital"));
                put(4, new Doctor(4, "Ashok Kumar", "Yashoda Hospital"));


            }
        };

    }

    public Collection<Doctor> getAllDoctor() {
        return this.map.values();
    }

    public Doctor getOneDoctor(int doctorId) {
        return map.get(doctorId);

    }

    public String putDoctor(Doctor doctor) {
        map.put(doctor.getDoctorID(), doctor);
        return "It has been Put";
    }

    public String postDoctor(Doctor doctor) {
        map.put(doctor.getDoctorID(), doctor);
        return "It has been Posted";
    }

    public Doctor deleteDoctor(int dId) {
        return map.remove(dId);

    }


}
