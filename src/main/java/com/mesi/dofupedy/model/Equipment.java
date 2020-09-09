package com.mesi.dofupedy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @Column(name = "equipment_id")
    private int equipmentId;

    @Column(name = "equipment_ankama_id")
    private int equipmentAnkamaId;

    @Column(name = "equipment_name")
    private String equipmentName;

    @Column (name = "equipment_level")
    private int equipmentLevel;

    @Column(name = "equipment_type")
    private String equipmentType;

    @Column(name = "equipment_image_url")
    private String equipmentImgUrl;

    @Column(name = "equipment_url")
    private String equipmentUrl;

    @Column(name = "equipment_description")
    private String equipmentDescription;

    @Column(name = "equipment_statistics")
    private String equipmentStatistics;

    @Column(name = "equipment_recipe")
    private String equipmentRecipe;

    @Column(name = "equipment_set_id")
    private int equipmentSetId;

    public Equipment(int equipmentId, int equipmentAnkamaId, String equipmentName, int equipmentLevel, String equipmentType, String equipmentImgUrl, String equipmentUrl, String equipmentDescription, String equipmentStatistics, String equipmentRecipe, int equipmentSetId) {
        this.equipmentId = equipmentId;
        this.equipmentAnkamaId = equipmentAnkamaId;
        this.equipmentName = equipmentName;
        this.equipmentLevel = equipmentLevel;
        this.equipmentType = equipmentType;
        this.equipmentImgUrl = equipmentImgUrl;
        this.equipmentUrl = equipmentUrl;
        this.equipmentDescription = equipmentDescription;
        this.equipmentStatistics = equipmentStatistics;
        this.equipmentRecipe = equipmentRecipe;
        this.equipmentSetId = equipmentSetId;
    }

    public Equipment(){

    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getEquipmentAnkamaId() {
        return equipmentAnkamaId;
    }

    public void setEquipmentAnkamaId(int equipmentAnkamaId) {
        this.equipmentAnkamaId = equipmentAnkamaId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(int equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentImgUrl() {
        return equipmentImgUrl;
    }

    public void setEquipmentImgUrl(String equipmentImgUrl) {
        this.equipmentImgUrl = equipmentImgUrl;
    }

    public String getEquipmentUrl() {
        return equipmentUrl;
    }

    public void setEquipmentUrl(String equipmentUrl) {
        this.equipmentUrl = equipmentUrl;
    }

    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    public void setEquipmentDescription(String equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }

    public String getEquipmentStatistics() {
        return equipmentStatistics;
    }

    public void setEquipmentStatistics(String equipmentStatistics) {
        this.equipmentStatistics = equipmentStatistics;
    }

    public String getEquipmentRecipe() {
        return equipmentRecipe;
    }

    public void setEquipmentRecipe(String equipmentRecipe) {
        this.equipmentRecipe = equipmentRecipe;
    }

    public int getEquipmentSetId() {
        return equipmentSetId;
    }

    public void setEquipmentSetId(int equipmentSetId) {
        this.equipmentSetId = equipmentSetId;
    }
}
