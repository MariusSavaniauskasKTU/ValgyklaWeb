package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Produktas;

import java.util.List;
import java.util.Optional;

public interface ProduktasService {
    public Produktas saveProduktas(Produktas produktas);
    public List<Produktas> getAllProduktas();
    Optional < Produktas > findById(int id);
    public void Delete(int id);
}
