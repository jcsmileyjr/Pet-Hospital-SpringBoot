package org.launchcode.PetHospital.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HospitalController {

    @RequestMapping(value= "")
    @ResponseBody
    public String index(){
        return "Hello, how can I help you";
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
