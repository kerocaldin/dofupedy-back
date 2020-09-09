package com.mesi.dofupedy.repository;

import com.mesi.dofupedy.model.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceRepository extends JpaRepository<Ressource, Integer> {

    Ressource findRessourceByRessourceId(int ressourceId);



}
