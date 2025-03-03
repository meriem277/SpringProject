package com.example.tpfoyer.controller;
import com.example.tpfoyer.entites.Chambre;
import com.example.tpfoyer.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;
    @PostMapping("addchambre")
    public Chambre addChambre(@RequestBody Chambre c){return chambreService.addChambre(c);}
    @GetMapping("/getAll")
    public List<Chambre> getAll(){
        return chambreService.retrieveAllChambres();
    }
    @PutMapping("/{id}")
    public Chambre updateChambre(@PathVariable Long id, @RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    @GetMapping("/{id}")
    public Chambre retrieveChambre(@PathVariable Long id) {
        return chambreService.retrieveChambre(id);
    }

}