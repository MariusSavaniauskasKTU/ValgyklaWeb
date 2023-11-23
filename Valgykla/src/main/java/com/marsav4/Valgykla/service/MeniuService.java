package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Ingredient;
import com.marsav4.Valgykla.model.Meniu;

import java.util.List;
import java.util.Optional;

public interface MeniuService {
    public Meniu save(Meniu meniu);
    public List<Meniu> getAll();
    Optional< Meniu > findById(int id);
    public void Delete(int id);
    public boolean isDuplicate(Meniu meniu);
}
