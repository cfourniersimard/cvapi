package com.example.cvapi.model;

import java.util.List;

public class Cv {
    private List<AcademicExperience> academicExperience;
    private List<ProfessionalExperience> professionalExperience;
    private String email;
    private String phoneNumber;

    // Getters and setters
    public List<AcademicExperience> getAcademicExperience() {
        return academicExperience;
    }

    public void setAcademicExperience(List<AcademicExperience> academicExperience) {
        this.academicExperience = academicExperience;
    }

    public List<ProfessionalExperience> getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
