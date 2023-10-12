package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Patiekalas;
import com.marsav4.Valgykla.repository.PatiekalasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatiekalasServiceImpl implements PatiekalasService{

    @Autowired
    private PatiekalasRepository patiekalasRepository;
    @Override
    public Patiekalas savePatiekalas(Patiekalas patiekalas) {
        return patiekalasRepository.save(patiekalas);
    }

    @Override
    public List<Patiekalas> getAllPatiekalas() {
        return patiekalasRepository.findAll();
    }

    @Override
    public Optional<Patiekalas> findById(int id) {
        return patiekalasRepository.findById(id);
    }

    @Override
    public void Delete(int id) {
        patiekalasRepository.deleteById(id);
    }
}
