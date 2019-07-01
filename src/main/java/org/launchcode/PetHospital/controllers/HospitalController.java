package org.launchcode.PetHospital.controllers;

import org.launchcode.PetHospital.models.Doctor;
import org.launchcode.PetHospital.models.Hospital;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HospitalController {

    @RequestMapping(value= "")
    public String index(Model model){
        String test = "Hello, how can I help you";
        String title = "Saint John Pet Hospital";
        Hospital.checkInDoctor("Bob");
        Hospital.checkInDoctor("Dale");
        model.addAttribute("title", title);
        model.addAttribute("test", test);
        model.addAttribute(new Doctor());
        model.addAttribute("doctors", Hospital.getDoctors());
        return "index";
    }

    @RequestMapping(value= "checkInDoctor")
    @ResponseBody
    public String checkInDoctor(){
        return "Check in a Doctor";
    }

    @RequestMapping(value= "checkInPatient")
    @ResponseBody
    public String checkInPatient(){
        return "Check in a Patient";
    }

    @RequestMapping(value= "checkOutPatient")
    @ResponseBody
    public String checkOutPatient(){
        return "Check out a Patient";
    }

    @RequestMapping(value= "viewAllPatients")
    @ResponseBody
    public String viewAllPatient(){
        return "View all Patient";
    }

}
