package com.mesi.dofupedy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ressources")
public class Ressource {

    @Id
    @Column(name = "ressource_id")
    private int ressourceId;

    @Column(name = "ressource_ankama_id")
    private int ressourceAnkamaId;

    @Column(name = "ressource_name")
    private String ressourceName;

    @Column(name = "ressource_level")
    private int ressourceLevel;

    @Column(name = "ressource_image_url")
    private String ressourceImageUrl;

    @Column(name = "ressource_url")
    private String ressourceUrl;

    @Column(name = "ressource_recipe")
    private String ressourceRecipe;

    @Column(name = "ressource_type")
    private String ressourceType;

    @Column(name = "ressource_description")
    private String ressourceDescription;

    public Ressource(int ressourceId, int ressourceAnkamaId, String ressourceName, int ressourceLevel, String ressourceImageUrl, String ressourceUrl, String ressourceRecipe, String ressourceType, String ressourceDescription) {
        this.ressourceId = ressourceId;
        this.ressourceAnkamaId = ressourceAnkamaId;
        this.ressourceName = ressourceName;
        this.ressourceLevel = ressourceLevel;
        this.ressourceImageUrl = ressourceImageUrl;
        this.ressourceUrl = ressourceUrl;
        this.ressourceRecipe = ressourceRecipe;
        this.ressourceType = ressourceType;
        this.ressourceDescription = ressourceDescription;
    }

    public Ressource(){

    }

    public int getRessourceId() {
        return ressourceId;
    }

    public void setRessourceId(int ressourceId) {
        this.ressourceId = ressourceId;
    }

    public int getRessourceAnkamaId() {
        return ressourceAnkamaId;
    }

    public void setRessourceAnkamaId(int ressourceAnkamaId) {
        this.ressourceAnkamaId = ressourceAnkamaId;
    }

    public String getRessourceName() {
        return ressourceName;
    }

    public void setRessourceName(String ressourceName) {
        this.ressourceName = ressourceName;
    }

    public String getRessourceRecipe() {
        return ressourceRecipe;
    }

    public void setRessourceRecipe(String ressourceRecipe) {
        this.ressourceRecipe = ressourceRecipe;
    }

    public String getRessourceType() {
        return ressourceType;
    }

    public void setRessourceType(String ressourceType) {
        this.ressourceType = ressourceType;
    }

    public String getRessourceDescription() {
        return ressourceDescription;
    }

    public void setRessourceDescription(String ressourceDescription) {
        this.ressourceDescription = ressourceDescription;
    }

    public int getRessourceLevel() {
        return ressourceLevel;
    }

    public void setRessourceLevel(int ressourceLevel) {
        this.ressourceLevel = ressourceLevel;
    }

    public String getRessourceImageUrl() {
        return ressourceImageUrl;
    }

    public void setRessourceImageUrl(String ressourceImageUrl) {
        this.ressourceImageUrl = ressourceImageUrl;
    }

    public String getRessourceUrl() {
        return ressourceUrl;
    }

    public void setRessourceUrl(String ressourceUrl) {
        this.ressourceUrl = ressourceUrl;
    }
}
