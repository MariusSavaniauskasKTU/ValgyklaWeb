package com.marsav4.Valgykla.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Valgiarastis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pavadinimas;
    private String tipas;
    private String patiekalai;
    private int puslapiuKiekis;

    public int getPuslapiuKiekis() {
        return puslapiuKiekis;
    }

    public void setPuslapiuKiekis(int puslapiuKiekis) {
        this.puslapiuKiekis = puslapiuKiekis;
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

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public String getPatiekalai() {
        return patiekalai;
    }

    public void setPatiekalai(String patiekalai) {
        this.patiekalai = patiekalai;
    }
}
