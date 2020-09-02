package com.example.Daddyji.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    private int doctorID;
    private String doctorName;
    private String doctorHospital;
}
