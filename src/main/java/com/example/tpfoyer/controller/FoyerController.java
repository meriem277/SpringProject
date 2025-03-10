package com.example.tpfoyer.controller;

import com.example.tpfoyer.entites.Foyer;
import com.example.tpfoyer.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    IFoyerService foyerService;
    @PostMapping("addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f){return foyerService.addFoyer(f);}
    @GetMapping("/getAll")
    public List<Foyer> getAll(){
        return foyerService.retrieveAllFoyers();
    }
    @PutMapping("/{id}")
    public Foyer updateBloc(@PathVariable Long id, @RequestBody Foyer f) {
        return foyerService.updateFoyer(f);
    }

    @GetMapping("/{id}")
    public Foyer retrieveBloc(@PathVariable Long id) {
        return foyerService.retrieveFoyer(id);
    }

    @DeleteMapping("/{id}")
    public void removeBloc(@PathVariable Long id) {
        foyerService.removeFoyer(id);
    }
}