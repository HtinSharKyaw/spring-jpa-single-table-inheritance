package com.example.inheritancedemo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ex_vet")
public class ExHouseVet extends Vet{
    private String country;
    private double visitingFees;

    public ExHouseVet(){

    }

    public ExHouseVet(String name, String qualification, String country, double visitingFees) {
        super(name, qualification);
        this.country = country;
        this.visitingFees = visitingFees;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getVisitingFees() {
        return visitingFees;
    }

    public void setVisitingFees(double visitingFees) {
        this.visitingFees = visitingFees;
    }
}
