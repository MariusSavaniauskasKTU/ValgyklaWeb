package com.marsav4.Valgykla.controller;

import com.marsav4.Valgykla.model.Produktas;
import com.marsav4.Valgykla.service.ProduktasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produktas")
public class ProduktasController {

    @Autowired
    private ProduktasService produktasService;

    @PostMapping("/add")
    public String add(@RequestBody Produktas produktas){
        produktasService.saveProduktas(produktas);
        return "Naujas produktas idetas";
    }

    @PostMapping("/update")
    public void Update(int id, String pav, String tiek, Double kal, String rus)
    {
        Optional < Produktas > opt = produktasService.findById(id);
        if (opt.isPresent())
        {
            Produktas produktas = opt.get();
            if (!pav.isEmpty())
            {
                produktas.setPavadinimas(pav);
            }
            if (!tiek.isEmpty())
            {
                produktas.setTiekejas(tiek);
            }
            if (kal != null)
            {
                produktas.setKalorijos(kal);
            }
            if (!rus.isEmpty())
            {
                produktas.setRusis(rus);
            }
            produktasService.saveProduktas(produktas);
        }

    }


    @GetMapping("/get")
    public Optional < Produktas > getProduktas(int id)
    {
        return produktasService.findById(id);
    }

    @DeleteMapping("/delete")
    public String delete(int id)
    {
        produktasService.Delete(id);
        return "Produktas istrintas";
    }



    @GetMapping("/getAll")
    public List<Produktas> getAllProduktas()
    {
        return produktasService.getAllProduktas();
    }

    @GetMapping("/getAllTiekejai")
    public List<String> getAllProduktoTiekejus(String pavadinimas)
    {
        List<String> tiekejai = new ArrayList<String>();
        List<Produktas> produktasList = produktasService.getAllProduktas();

        for (Produktas produktas : produktasList)
        {
            if (pavadinimas.equals(produktas.getPavadinimas()))
            {
                tiekejai.add(produktas.getTiekejas());
            }
        }

        return tiekejai;
    }

    @GetMapping("/getAllRusiesProduktai")
    public List<Produktas> getAllRusiesProduktus(String pavadinimas)
    {
        List<Produktas> rez = new ArrayList<Produktas>();
        List<Produktas> produktasList = produktasService.getAllProduktas();

        for (Produktas produktas : produktasList)
        {
            if (pavadinimas.equals(produktas.getRusis()))
            {
                rez.add(produktas);
            }
        }

        return rez;
    }

    @GetMapping("/getAllVegetariskiProduktai")
    public List<Produktas> getAllVegetariskusProduktus()
    {
        List<Produktas> rez = new ArrayList<Produktas>();
        List<Produktas> produktasList = produktasService.getAllProduktas();

        for (Produktas produktas : produktasList)
        {
            if (produktas.getRusis().equals("Darzove") ||
                    produktas.getRusis().equals("Pieno produktas") ||
                    produktas.getRusis().equals("Vaisius"))
            {
                rez.add(produktas);
            }
        }

        return rez;
    }

    @GetMapping("/getAllVeganiskiProduktai")
    public List<Produktas> getAllVeganiskusProduktus()
    {
        List<Produktas> rez = new ArrayList<Produktas>();
        List<Produktas> produktasList = produktasService.getAllProduktas();

        for (Produktas produktas : produktasList)
        {
            if (produktas.getRusis().equals("Darzove") ||
                    produktas.getRusis().equals("Vaisius"))
            {
                rez.add(produktas);
            }
        }

        return rez;
    }

    @GetMapping("/getAllNaturalusProduktai")
    public List<Produktas> getAllNaturaliusProduktus()
    {
        List<Produktas> rez = new ArrayList<Produktas>();
        List<Produktas> produktasList = produktasService.getAllProduktas();

        for (Produktas produktas : produktasList)
        {
            if (produktas.isNaturalus())
            {
                rez.add(produktas);
            }
        }

        return rez;
    }

}
