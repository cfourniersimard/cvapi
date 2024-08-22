package com.example.cvapi.service;

import com.example.cvapi.model.AcademicExperience;
import com.example.cvapi.model.Cv;
import com.example.cvapi.model.ProfessionalExperience;
import com.example.cvapi.model.ContactInfo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CvService {
    public Cv getCv() {
        Cv cv = new Cv();

        AcademicExperience emba = new AcademicExperience();
        emba.setInstitution("École des sciences de la gestion (ESG UQAM)");
        emba.setDegree("Executive MBA, Business Administration and Management, General");
        emba.setDuration("Jan 2021 - Jan 2023");
        emba.setGrade("3.9");

        AcademicExperience mastersPM = new AcademicExperience();
        mastersPM.setInstitution("École des sciences de la gestion (ESG UQAM)");
        mastersPM.setDegree("Master’s Degree, Project Management");
        mastersPM.setDuration("2014 - 2016");
        mastersPM.setActivities("• Oversea Study - University of Technology Sydney, 2016, Australia.\n" +
                "• Executive Vice-President of the student Council for the Masters in Project Management\n" +
                "• Members of the Business School Academic Council\n" +
                "• Organisation of a Conference/Cocktail for the PM Community");

        AcademicExperience uts = new AcademicExperience();
        uts.setInstitution("University of Technology Sydney");
        uts.setDegree("Master’s Degree, Project Management");
        uts.setDuration("2016");
        uts.setActivities("• Oversea Study - University of Technology Sydney, 2016, Australia.");

        AcademicExperience bachelors = new AcademicExperience();
        bachelors.setInstitution("Université de Montréal");
        bachelors.setDegree("Baccalauréat, Labor and Industrial Relations");
        bachelors.setDuration("2009 - 2012");
        bachelors.setActivities("• Delegate for the academic affairs – Industrial Relations Student Council 2010-2011\n" +
                "• Delegate for the Cooperative – Industrial Relations Student Council 2010-2011\n" +
                "• Participation in two student exchanges:\n" +
                "  - Catholic University of Louvain: Fall 2011, Belgium.\n" +
                "  - Renmin University of China: summer 2011, Beijing.");

        List<AcademicExperience> academicExperiences = Arrays.asList(emba, mastersPM, uts, bachelors);
        cv.setAcademicExperience(academicExperiences);

        ProfessionalExperience laps = new ProfessionalExperience();
        laps.setTitle("Director of Software Development");
        laps.setCompany("Laps");
        laps.setDuration("May 2022 - Present");
        laps.setLocation("Montreal, Quebec, Canada");
        laps.setDescription("• Act as a servant leader and direct manager for three software engineering teams specialized in Ecommerce (15 devs)\n" +
                "• Implement an agile software development process.\n" +
                "• Organize SWAT and 360 workshops to define team’s OKRs.\n" +
                "• Create a project schedule to integrate a recent overseas acquisition.\n" +
                "• Define Individual Development Plans for all team members.");

        ProfessionalExperience projetsCK = new ProfessionalExperience();
        projetsCK.setTitle("Co-Founder");
        projetsCK.setCompany("Projets CK");
        projetsCK.setDuration("Aug 2023 - Present");
        projetsCK.setLocation("Montreal, Quebec, Canada");
        projetsCK.setDescription("Co-Founder at Projets CK | Consulting | Real Estate Management");

        ProfessionalExperience hydroQuebec = new ProfessionalExperience();
        hydroQuebec.setTitle("Scrum Master");
        hydroQuebec.setCompany("Hydro Québec");
        hydroQuebec.setDuration("Sep 2020 - May 2022");
        hydroQuebec.setLocation("Montreal, Quebec, Canada");
        hydroQuebec.setDescription("• Supporting the agile transformation of Hydro-Québec. Helping product and project teams improve processes and deliver value quicker.\n" +
                "• Clarify the product vision, identify personas and user flow through UX/UI wireframes\n" +
                "• Create a Story-map, Business processes and requirement, manage dependencies and PowerBI based KPIs\n" +
                "• Support and coach a cross-functional Product owner (product manager) Community of practice\n" +
                "• Support 4 agile teams working on $40M ERP/CMMS software project.");

        ProfessionalExperience stingray = new ProfessionalExperience();
        stingray.setTitle("IT Project Manager");
        stingray.setCompany("Stingray");
        stingray.setDuration("Oct 2017 - Sep 2020");
        stingray.setLocation("Montreal, Canada Area");
        stingray.setDescription("• Develop an application infrastructure dedicated to the diffusion of Concerts OTT on 9 different SVOD apps.\n" +
                "• Manage a large-scale app development project to allow strategic growth in the B2C space.\n" +
                "• Prioritize scope, design, features and collaborate with third parties towards the deployment of 9 SVOD applications (iOS, tvOS, Android, Fire-TV, Roku, HTML)\n" +
                "• Push to production a new Backend using Continuous Deployment (CD) built around a Micro-service architecture.\n" +
                "• Help our team integrate solutions to allow the business to pivot towards Data driven decision-making.\n" +
                "• Integrate E-commerce payment systems (Recurly payment processor, Paysafe payment solution) and new app stores (Roku & amazon).\n" +
                "• Manage and analyze business needs for multiple Social logins (Apple, Google, Amazon) and B2B2C (OAUTH-2 & SSO) with different third parties.\n" +
                "• Work with internal teams before kicking off important projects to develop tools to update the content available in Stingray’s apps.\n" +
                "• Integrate different A/B testing tools to optimize our user acquisition flows.\n" +
                "• Support the implementation of Salesforce marketing cloud to manage user acquisition flows.");

        List<ProfessionalExperience> professionalExperiences = Arrays.asList(laps, projetsCK, hydroQuebec, stingray);
        cv.setProfessionalExperience(professionalExperiences);

        cv.setEmail("your.email@example.com");
        cv.setPhoneNumber("123-456-7890");
        return cv;
    }

    public ContactInfo getContactInfo() {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setEmail("your.email@example.com");
        contactInfo.setPhoneNumber("123-456-7890");
        return contactInfo;
    }
}
