package com.mesi.dofupedy.controller;

import com.mesi.dofupedy.model.Equipment;
import com.mesi.dofupedy.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/equipments")
public class EquipmentController {

    @Autowired
    EquipmentRepository equipmentRepository;

//    @PostMapping
//    public ResponseEntity<?> postItem(@RequestBody Equipment equipment){
//        return new ResponseEntity<>(equipmentRepository.save(equipment), HttpStatus.CREATED);
//    }

    @GetMapping("{id}")
    public Equipment getItemById(@PathVariable(value = "id") int equipmentId){
        System.out.println(equipmentRepository.findEquipmentByEquipmentId(equipmentId));
        return equipmentRepository.findEquipmentByEquipmentId(equipmentId);
    }

    @GetMapping
    public List<Equipment> getAllEquipments(){
        System.out.println("test");
        return equipmentRepository.findAll();
    }

}
