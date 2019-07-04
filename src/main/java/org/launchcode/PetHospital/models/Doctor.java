package org.launchcode.PetHospital.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//This class describe the doctor use to treat the pets in the hospital.
public class Doctor implements Serializable {
    private String fullName;
    private List<Patient> patients = new ArrayList<>();// array of pets

    //constructor used to create a doctor object
    public Doctor(String aFullName){
        fullName = aFullName;
    }

    //create a new patient and add to the patient array
    public void newPatient(Patient pet){
        patients.add(pet);
    }

    //get the name of the current doctor instance
    public String getDoctorName(){
        return this.fullName;
    }

    //Remove a pet from a doctor list of patients
    public void checkoutPatient(Patient pet){
        patients.remove(pet);
    }

    //view a chosen pet
    public void viewPatient(Patient pet){
        int isHere = patients.indexOf(pet);//find the index of the pet in the array
        Patient foundPet = patients.get(isHere);//get the pet from the array
        System.out.println(foundPet.getFullname() + " is being treated for " + foundPet.getTreament() + " and is a patient of " + this.fullName);//print the name of the pet
    }

    //view all pets under the care of this doctor
    public  void viewAllDoctorPatients(){
        for(Patient pet : patients){//loop through a array of pets
            System.out.println(pet.getFullname()+ " is being treated for " + pet.getTreament() +  " and is a patient of " + this.fullName);
        }
    }

    //used in Hospital check out patient method
    public List<Patient> getDoctorListOfPatient(){
        return patients;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Patient> getPatient() {
        return patients;
    }

    public void setPatient(List<Patient> patient) {
        this.patients = patient;
    }
}
