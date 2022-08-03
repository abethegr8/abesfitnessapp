package com.springbootcrud.abesfitnessapp.entity;
// Model Class

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fit_TBL")
public class FitnessPerson {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String date;

    private String workout;

    public FitnessPerson(int id, String name, String date, String workout) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.workout = workout;
    }

    public FitnessPerson() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWorkout() {
        return workout;
    }

    public void setWorkout(String workout) {
        this.workout = workout;
    }
}
