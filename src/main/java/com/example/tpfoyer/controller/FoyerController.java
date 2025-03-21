package com.example.tpfoyer.controller;

import com.example.tpfoyer.entites.Foyer;
import com.example.tpfoyer.entites.Universite;
import com.example.tpfoyer.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping("/ajouter")
    public ResponseEntity<Foyer> ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer, @RequestParam long idUniversite) {
        try {
            Foyer savedFoyer = foyerService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
            return new ResponseEntity<>(savedFoyer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}