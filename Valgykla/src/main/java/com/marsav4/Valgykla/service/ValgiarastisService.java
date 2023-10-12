package com.marsav4.Valgykla.service;

import com.marsav4.Valgykla.model.Produktas;
import com.marsav4.Valgykla.model.Valgiarastis;

import java.util.List;
import java.util.Optional;

public interface ValgiarastisService {
    public Valgiarastis saveValgiarastis(Valgiarastis valgiarastis);
    public List<Valgiarastis> getAllValgiarastis();
    Optional< Valgiarastis > findById(int id);
    public void Delete(int id);
}
