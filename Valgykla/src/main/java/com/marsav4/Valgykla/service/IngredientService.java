package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientService {
    public Ingredient save(Ingredient ingredient);
    public List<Ingredient> getAll();
    Optional< Ingredient > findById(int id);
    public void Delete(int id);
    public boolean isDuplicate(Ingredient ingredient);
}
