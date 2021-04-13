package com.lauramititelu.springboot.drugstore.DrugStore.repositories;

import com.lauramititelu.springboot.drugstore.DrugStore.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
