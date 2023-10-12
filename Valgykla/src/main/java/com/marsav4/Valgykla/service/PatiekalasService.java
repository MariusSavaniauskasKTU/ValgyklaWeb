package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Patiekalas;
import com.marsav4.Valgykla.model.Produktas;

import java.util.List;
import java.util.Optional;

public interface PatiekalasService {
    public Patiekalas savePatiekalas(Patiekalas patiekalas);
    public List<Patiekalas> getAllPatiekalas();
    Optional<Patiekalas> findById(int id);
    public void Delete(int id);
}
