package com.marsav4.Valgykla.repository;

import com.marsav4.Valgykla.model.Produktas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduktasRepository extends JpaRepository<Produktas, Integer> {
}
