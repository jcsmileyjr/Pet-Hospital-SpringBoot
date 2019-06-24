package org.launchcode.PetHospital.controllers;

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
        model.addAttribute("title", title);
        model.addAttribute("test", test);
        //return "Hello, how can I help you";
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
