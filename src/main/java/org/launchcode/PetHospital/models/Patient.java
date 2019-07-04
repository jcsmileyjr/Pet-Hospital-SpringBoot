package org.launchcode.PetHospital.models;

import java.util.List;

//This class is used to describe the pets treated in the Hospital
public class Patient {
    private String fullname;
    private String treament;
    private double donation;
    private String doctorName;

    public Patient(String fullname, String treament, double donation, String doctorName) {
        this.fullname = fullname;
        this.treament = treament;
        this.donation = donation;
        this.doctorName = doctorName;
    }

    public String getFullname() {
        return fullname;
    }

    public String getTreament() {
        return treament;
    }

    public double getDonation() {
        return donation;
    }

    public String getDoctorName() {
        return doctorName;
    }
}

