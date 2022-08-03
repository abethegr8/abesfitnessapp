package com.springbootcrud.abesfitnessapp.repository;

import com.springbootcrud.abesfitnessapp.entity.FitnessPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessPersonRepository extends JpaRepository<FitnessPerson, Integer> {

    FitnessPerson findByName(String name);
}
