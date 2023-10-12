package com.marsav4.Valgykla.repository;

import com.marsav4.Valgykla.model.Patiekalas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatiekalasRepository extends JpaRepository<Patiekalas, Integer> {
}
