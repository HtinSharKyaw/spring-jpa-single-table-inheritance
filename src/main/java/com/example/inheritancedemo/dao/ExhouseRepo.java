package com.example.inheritancedemo.dao;

import com.example.inheritancedemo.entities.ExHouseVet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhouseRepo extends CrudRepository<ExHouseVet,Integer>{
}
