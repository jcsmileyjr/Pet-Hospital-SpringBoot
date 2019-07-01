package org.launchcode.PetHospital.controllers;

import org.launchcode.PetHospital.models.Doctor;
import org.launchcode.PetHospital.models.Hospital;
import org.launchcode.PetHospital.models.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HospitalController {

    static List<Doctor> doctors = Hospital.getDoctors();


    @RequestMapping(value= "", method = RequestMethod.GET)
    public String index(Model model){
        /*TODO: This, Head & Nav, needs to be a fragment for all views*/
        String title = "Saint John Pet Hospital";

        model.addAttribute("title", title);
        model.addAttribute("doctors", doctors);
        return "index";
    }

    @RequestMapping(value= "", method = RequestMethod.POST)
    public String checkInDoctor(@RequestParam String doctorName){
        Hospital.checkInDoctor(doctorName);
        return "redirect:";/*redirect to index*/
    }

    @RequestMapping(value= "checkInPatient", method = RequestMethod.GET)
    public String checkInPatient(Model model){
        model.addAttribute("title", "Saint John Pet Hospital");
        model.addAttribute("doctors", doctors);

        model.addAttribute(new Doctor("Sample"));
        return "addPatient";
    }

    /*TODO: Create viewPatients view*/
    @RequestMapping(value= "checkInPatient", method = RequestMethod.POST)
    public String processPatient(@RequestParam String patientName, @RequestParam String treatment, @RequestParam Double donation, @RequestParam String doctorName){
        Hospital.checkInPatient(patientName, treatment, donation, doctorName);
        return "redirect:viewAllPatients";
    }

    @RequestMapping(value= "checkOutPatient")
    @ResponseBody
    public String checkOutPatient(){
        return "Check out a Patient";
    }

    @RequestMapping(value= "viewAllPatients")
    public String viewAllPatient(Model model){
        model.addAttribute("title", "Saint John Pet Hospital");
        model.addAttribute("doctors", doctors);

        List<Patient> patients = Hospital.viewAllPatients();
        model.addAttribute("patients", patients);

        return "viewPatients";
    }

}
