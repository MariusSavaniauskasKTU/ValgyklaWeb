package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {
    public Dish save(Dish dish);
    public List<Dish> getAll();
    Optional< Dish > findById(int id);
    public void Delete(int id);
    public boolean isDuplicate(Dish dish);
}
