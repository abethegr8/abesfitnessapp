package com.springbootcrud.abesfitnessapp.service;

//Here we write the Post/Update/Get/Delete CRUD Operations
// Utilizing all of the jdba methods, we only made our own verson of findbyname

import com.springbootcrud.abesfitnessapp.entity.FitnessPerson;
import com.springbootcrud.abesfitnessapp.repository.FitnessPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitnessPersonService {

    @Autowired
    private FitnessPersonRepository repository;

    // Post Methods, Single and group

    public FitnessPerson saveFitnessPerson(FitnessPerson fitnessPerson){
        return repository.save(fitnessPerson);
    }

    public List<FitnessPerson> saveFitnessPersons(List<FitnessPerson> fitnessPersons){
        return repository.saveAll(fitnessPersons);
    }

    // Get Methods

    public List<FitnessPerson> getFitnessPersons(){
        return repository.findAll();
    }

    public FitnessPerson getFitnessPersonById(int id){
        return repository.findById(id).orElse(null);
    }

    // Customize Java coding by method
    public FitnessPerson getFitnessPersonByName(String name){
        return repository.findByName(name);
    }

    // Delete Methods

    public String deleteFitnessPerson(int id){
        repository.deleteById(id);
        return "Fitness Person Deleted by id: " + id;
    }


    // Put Methods

    public FitnessPerson updateFitnessPerson(FitnessPerson fitnessPerson){
        FitnessPerson existingFitnessPerson = repository.findById(fitnessPerson.getId()).orElse(null);
        existingFitnessPerson.setName(fitnessPerson.getName());
        existingFitnessPerson.setDate(fitnessPerson.getDate());
        existingFitnessPerson.setWorkout(fitnessPerson.getWorkout());

        return repository.save(existingFitnessPerson);
    }

}
