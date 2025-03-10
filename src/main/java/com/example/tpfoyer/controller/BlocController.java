package com.example.tpfoyer.controller;

import com.example.tpfoyer.entites.Bloc;
import com.example.tpfoyer.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
    @Autowired
    IBlocService blocService;

    @GetMapping("/getAll")
    public List<Bloc> getAll(){
        return blocService.retrieveBlocs();
    }
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b)
    {return blocService.addBloc(b);}

    @PutMapping("/{id}")
    public Bloc updateBloc(@PathVariable Long id, @RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("/{id}")
    public Bloc retrieveBloc(@PathVariable Long id) {
        return blocService.retrieveBloc(id);
    }

    @DeleteMapping("/{id}")
    public void removeBloc(@PathVariable Long id) {
        blocService.removeBloc(id);
    }

}
