package com.example.inheritancedemo.dao;

import com.example.inheritancedemo.entities.InHouseVet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InHouseRepo extends CrudRepository<InHouseVet,Integer> {
}
