package com.example.demo.Repositories;

import com.example.demo.Entities.Contrat;
import com.example.demo.Entities.Departement;
import com.example.demo.Entities.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer> {



}