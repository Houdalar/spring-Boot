package com.example.demo.Repositories;

import com.example.demo.Entities.Etudiant;
import com.example.demo.Entities.Niveau;
import com.example.demo.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
    List<Etudiant> findByDepartementIdDepart(Long idDpart);
    List<Etudiant>
    findByEquipesNiveauContainsAndEquipesNiveau_SeniorContains
            (Niveau niveau);


}