package com.lauramititelu.springboot.drugstore.DrugStore.controllers;

import com.lauramititelu.springboot.drugstore.DrugStore.models.Pharmacist;
import com.lauramititelu.springboot.drugstore.DrugStore.repositories.PharmacistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drugstore/pharmacists")
public class PharmacistsController {

    @Autowired
    PharmacistRepository pharmacistRepository;

    @GetMapping
    public List<Pharmacist> list(){
        return pharmacistRepository.findAll();
    }

    //cannot delete a pharmacist as must know who created the order - you can mark them as unemployed
    //TODO Add column in table boolean employed_status

}
