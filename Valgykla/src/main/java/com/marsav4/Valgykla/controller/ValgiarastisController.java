package com.marsav4.Valgykla.controller;

import com.marsav4.Valgykla.model.Patiekalas;
import com.marsav4.Valgykla.model.Produktas;
import com.marsav4.Valgykla.model.Valgiarastis;
import com.marsav4.Valgykla.repository.PatiekalasRepository;
import com.marsav4.Valgykla.service.PatiekalasService;
import com.marsav4.Valgykla.service.ValgiarastisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/valgiarastis")
public class ValgiarastisController {

    @Autowired
    private ValgiarastisService valgiarastisService;
    @Autowired
    private PatiekalasService patiekalasService;

    @PostMapping("/add")
    public String add(@RequestBody Valgiarastis valgiarastis){
        valgiarastisService.saveValgiarastis(valgiarastis);
        return "Naujas valgiarastis idetas";
    }

    @GetMapping("/getAll")
    public List<Valgiarastis> getAllValgiarastis()
    {
        return valgiarastisService.getAllValgiarastis();
    }

    @PostMapping("/update")
    public void Update(int id, String pav, String tipas, String pat, int k)
    {
        Optional< Valgiarastis > opt = valgiarastisService.findById(id);
        if (opt.isPresent())
        {
            Valgiarastis valgiarastis = opt.get();
            if (!pav.isEmpty())
            {
                valgiarastis.setPavadinimas(pav);
            }
            if (!tipas.isEmpty())
            {
                valgiarastis.setTipas(tipas);
            }
            if (!pat.isEmpty())
            {
                valgiarastis.setPatiekalai(pat);
            }
            if (k != 0)
            {
                valgiarastis.setPuslapiuKiekis(k);
            }
            valgiarastisService.saveValgiarastis(valgiarastis);
        }

    }


    @GetMapping("/get")
    public Optional < Valgiarastis > getValgiarastis(int id)
    {
        return valgiarastisService.findById(id);
    }

    @DeleteMapping("/delete")
    public String delete(int id)
    {
        valgiarastisService.Delete(id);
        return "Valgiarastis istrintas";
    }

    @GetMapping("/valgiarascioPatiekalai")
    public List<Patiekalas> getAllvalgiarascioPatiekalai(int id)
    {
        List<Patiekalas> patiekalai = new ArrayList<Patiekalas>();
        Optional<Valgiarastis> opt = valgiarastisService.findById(id);

        if (opt.isPresent())
        {
            Valgiarastis valgiarastis = opt.get();
            String[] parts = valgiarastis.getPatiekalai().split(", ");
            int j = 0;
            for (String part : parts)
            {
                if (j % 2 == 0)
                {
                    Optional <Patiekalas> patiekalas = patiekalasService.findById(Integer.parseInt(part));
                    if (patiekalas.isPresent())
                    {
                        patiekalai.add(patiekalas.get());
                    }
                }
                j++;
            }
        }

        return patiekalai;
    }
}
