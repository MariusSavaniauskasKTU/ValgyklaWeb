package com.marsav4.Valgykla.repository;

import com.marsav4.Valgykla.model.Produktas;
import com.marsav4.Valgykla.model.Valgiarastis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValgiarastisRepository extends JpaRepository<Valgiarastis, Integer> {
}
