package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Patiekalas;
import com.marsav4.Valgykla.model.Valgiarastis;
import com.marsav4.Valgykla.repository.ValgiarastisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ValgiarastisServiceImpl implements ValgiarastisService{

    @Autowired
    private ValgiarastisRepository valgiarastisRepository;

    @Override
    public Valgiarastis saveValgiarastis(Valgiarastis valgiarastis) {
        return valgiarastisRepository.save(valgiarastis);
    }

    @Override
    public List<Valgiarastis> getAllValgiarastis() {
        return valgiarastisRepository.findAll();
    }

    @Override
    public Optional<Valgiarastis> findById(int id) {
        return valgiarastisRepository.findById(id);
    }

    @Override
    public void Delete(int id) {
        valgiarastisRepository.deleteById(id);
    }
}
