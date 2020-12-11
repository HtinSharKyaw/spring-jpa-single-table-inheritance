package com.example.inheritancedemo.service;

import com.example.inheritancedemo.dao.ExhouseRepo;
import com.example.inheritancedemo.dao.InHouseRepo;
import com.example.inheritancedemo.entities.ExHouseVet;
import com.example.inheritancedemo.entities.InHouseVet;
import com.example.inheritancedemo.entities.Vet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VetService {
    private final InHouseRepo inHouseRepo;
    private final ExhouseRepo exhouseRepo;

    public VetService(InHouseRepo inHouseRepo, ExhouseRepo exhouseRepo) {
        this.inHouseRepo = inHouseRepo;
        this.exhouseRepo = exhouseRepo;
    }
    @Transactional
    public void createDb(){
        //That is written with polymorphism logic
        Vet inHouseVet1 = new InHouseVet("John","MSC",200000);
        Vet inHouseVet2 = new InHouseVet("Thomas","PHD",30000);
        Vet exHouseVet1 = new ExHouseVet("Paul","Bsc","USA",25000);
        Vet exHouseVet2 = new ExHouseVet("Wiliam","PHD","Japan",25000);
        //That is type casting
        inHouseRepo.save((InHouseVet) inHouseVet1);
        inHouseRepo.save((InHouseVet) inHouseVet2);
        exhouseRepo.save((ExHouseVet) exHouseVet1);
        exhouseRepo.save((ExHouseVet) exHouseVet2);
    }
}
