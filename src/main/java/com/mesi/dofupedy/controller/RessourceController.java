package com.mesi.dofupedy.controller;

import com.mesi.dofupedy.model.Ressource;
import com.mesi.dofupedy.repository.RessourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/ressources")
public class RessourceController {

    @Autowired
    RessourceRepository ressourceRepository;

    @GetMapping("{id}")
    public Ressource GetRessourceById(@PathVariable(value = "id") int ressourceId){
        return ressourceRepository.findRessourceByRessourceId(ressourceId);
    }

    @GetMapping
    public List<Ressource> getAllRessources() {
        return ressourceRepository.findAll();
    }
}
