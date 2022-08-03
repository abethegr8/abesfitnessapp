package com.springbootcrud.abesfitnessapp.controller;

// Controller will talk with the service class

import com.springbootcrud.abesfitnessapp.entity.FitnessPerson;
import com.springbootcrud.abesfitnessapp.service.FitnessPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FitnessPersonController {

    @Autowired
    private FitnessPersonService service;

    // Post Methods APIs
    @PostMapping("/addFitnessPerson")
    public FitnessPerson addFitnessPerson(@RequestBody FitnessPerson fitnessPerson){
        return service.saveFitnessPerson(fitnessPerson);
    }

    @PostMapping("/addFitnessPersons")
    public List<FitnessPerson> addFitnessPersons(@RequestBody List<FitnessPerson> fitnessPersons){
        return service.saveFitnessPersons(fitnessPersons);
    }

    // Get Method APIs

    @GetMapping("/fitnessPersons")
    public List<FitnessPerson> findAllFitnessPersons(){
        return service.getFitnessPersons();
    }

    @GetMapping("/fitnessPersonsById/{id}")
    public FitnessPerson findFitnessPersonById(@PathVariable int id){
        return service.getFitnessPersonById(id);
    }

    @GetMapping("/fitnessPersonsByName/{name}")
    public FitnessPerson findFitnessPersonByName(@PathVariable String name){
        return service.getFitnessPersonByName(name);
    }

    // Put Method APIs

    @PutMapping("/update")
    public FitnessPerson updateFitnessPerson(@RequestBody FitnessPerson fitnessPerson){
        return service.updateFitnessPerson(fitnessPerson);
    }

    // Delete Method APIs

    @DeleteMapping("/delete/{id}")
    public String deleteFitnessPerson(@PathVariable int id){
        return service.deleteFitnessPerson(id);
    }
}
