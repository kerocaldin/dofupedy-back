package com.mesi.dofupedy.repository;

import com.mesi.dofupedy.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

    Equipment findEquipmentByEquipmentId(int equipmentId);

    List<Equipment> findAll();

}
