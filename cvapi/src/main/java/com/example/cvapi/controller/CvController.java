package com.example.cvapi.controller;

import com.example.cvapi.model.ContactInfo;
import com.example.cvapi.model.Cv;
import com.example.cvapi.model.AcademicExperience;
import com.example.cvapi.model.ProfessionalExperience;
import com.example.cvapi.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CvController {

    @Autowired
    private CvService cvService;

    @GetMapping("/academic")
    public List<AcademicExperience> getAcademicExperience() {
        return cvService.getCv().getAcademicExperience();
    }

    @GetMapping("/professional")
    public List<ProfessionalExperience> getProfessionalExperience() {
        return cvService.getCv().getProfessionalExperience();
    }

    @GetMapping("/contact")
    public ContactInfo getContactInformation() {
        return cvService.getContactInfo();
    }
}
