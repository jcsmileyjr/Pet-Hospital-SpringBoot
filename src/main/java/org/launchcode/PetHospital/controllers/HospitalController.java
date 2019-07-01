package org.launchcode.PetHospital.controllers;

import org.launchcode.PetHospital.models.Doctor;
import org.launchcode.PetHospital.models.Hospital;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HospitalController {

    @RequestMapping(value= "", method = RequestMethod.GET)
    public String index(Model model){
        /*TODO: This, Head & Nav, needs to be a fragment for all views*/
        String title = "Saint John Pet Hospital";

        model.addAttribute("title", title);
        model.addAttribute("doctors", Hospital.getDoctors());
        return "index";
    }

    @RequestMapping(value= "", method = RequestMethod.POST)
    public String checkInDoctor(@RequestParam String doctorName){
        Hospital.checkInDoctor(doctorName);
        return "redirect:";
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
