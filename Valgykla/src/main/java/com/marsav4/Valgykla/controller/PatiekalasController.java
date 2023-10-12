package com.marsav4.Valgykla.controller;

import com.marsav4.Valgykla.model.Patiekalas;
import com.marsav4.Valgykla.model.Produktas;
import com.marsav4.Valgykla.repository.ProduktasRepository;
import com.marsav4.Valgykla.service.PatiekalasService;
import com.marsav4.Valgykla.service.ProduktasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patiekalas")
public class PatiekalasController {

    @Autowired
    private PatiekalasService patiekalasService;

    @Autowired
    private ProduktasService produktasService;

    @PostMapping("/add")
    public String add(@RequestBody Patiekalas patiekalas){
        patiekalasService.savePatiekalas(patiekalas);
        return "Naujas produktas idetas";
    }

    @GetMapping("/getAll")
    public List<Patiekalas> getAllPatiekalas()
    {
        return patiekalasService.getAllPatiekalas();
    }

    @PostMapping("/update")
    public void Update(int id, String pav, String tipas, String prod)
    {
        Optional< Patiekalas > opt = patiekalasService.findById(id);
        if (opt.isPresent())
        {
            Patiekalas patiekalas = opt.get();
            if (!pav.isEmpty())
            {
                patiekalas.setPavadinimas(pav);
            }
            if (!tipas.isEmpty())
            {
                patiekalas.setTipas(tipas);
            }
            if (!prod.isEmpty())
            {
                patiekalas.setProduktai(prod);
            }
            patiekalasService.savePatiekalas(patiekalas);
        }

    }


    @GetMapping("/get")
    public Optional < Patiekalas > getPatiekalas(int id)
    {
        return patiekalasService.findById(id);
    }

    @DeleteMapping("/delete")
    public String delete(int id)
    {
        patiekalasService.Delete(id);
        return "Patiekalas istrintas";
    }

    @GetMapping("/PatiekaloProduktai")
    public List<Produktas> getAllPatiekaloProduktai(int id)
    {
        List<Produktas> produktai = new ArrayList<Produktas>();
        Optional<Patiekalas> opt = patiekalasService.findById(id);

        if (opt.isPresent())
        {
            Patiekalas patiekalas = opt.get();
            String[] parts = patiekalas.getProduktai().split(", ");
            int j = 0;
            for (String part : parts)
            {
                 if (j % 2 == 0)
                  {
                     Optional <Produktas> produktas = produktasService.findById(Integer.parseInt(part));
                     if (produktas.isPresent())
                     {
                        produktai.add(produktas.get());
                     }
                 }
              j++;
            }
      }

        return produktai;
    }

}
