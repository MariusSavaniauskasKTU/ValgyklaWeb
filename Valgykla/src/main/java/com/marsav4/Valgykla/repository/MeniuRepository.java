package com.marsav4.Valgykla.repository;

import com.marsav4.Valgykla.model.Meniu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeniuRepository extends JpaRepository<Meniu, Integer> {
}
