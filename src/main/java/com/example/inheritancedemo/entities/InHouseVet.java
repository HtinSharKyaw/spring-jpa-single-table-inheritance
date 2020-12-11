package com.example.inheritancedemo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("in_vet")
public class InHouseVet extends Vet{
    private double salary;
    public InHouseVet(){

    }
    public InHouseVet(String name, String qualification, double salary) {
        super(name, qualification);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
