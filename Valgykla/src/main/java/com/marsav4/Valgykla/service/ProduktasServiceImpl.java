package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Produktas;
import com.marsav4.Valgykla.repository.ProduktasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduktasServiceImpl implements ProduktasService{

    //@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ProduktasRepository produktasRepository;

    @Override
    public Produktas saveProduktas(Produktas produktas) {
        return produktasRepository.save(produktas);
    }

    @Override
    public List<Produktas> getAllProduktas() {
        return produktasRepository.findAll();
    }

    @Override
    public Optional<Produktas> findById(int id) {
        return produktasRepository.findById(id);
    }

    @Override
    public void Delete(int id) {
        produktasRepository.deleteById(id);
    }
}
