package com.lauramititelu.springboot.drugstore.DrugStore.repositories;


import com.lauramititelu.springboot.drugstore.DrugStore.models.Pharmacist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacistRepository extends JpaRepository<Pharmacist, Long> {
}
