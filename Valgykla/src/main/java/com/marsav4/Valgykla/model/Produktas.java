package com.marsav4.Valgykla.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Produktas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pavadinimas;
    private String tiekejas;
    private Double kalorijos;
    private String rusis;
    private boolean naturalus;

    public Produktas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getTiekejas() {
        return tiekejas;
    }

    public void setTiekejas(String tiekejas) {
        this.tiekejas = tiekejas;
    }

    public Double getKalorijos() {
        return kalorijos;
    }

    public void setKalorijos(Double kiekis) {
        this.kalorijos = kiekis;
    }

    public String getRusis() {
        return rusis;
    }

    public void setRusis(String rusis) {
        this.rusis = rusis;
    }

    public boolean isNaturalus() {
        return naturalus;
    }

    public void setNaturalus(boolean naturalus) {
        this.naturalus = naturalus;
    }
}