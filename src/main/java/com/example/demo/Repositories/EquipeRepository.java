package com.example.demo.Repositories;

import com.example.demo.Entities.Contrat;
import com.example.demo.Entities.Departement;
import com.example.demo.Entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


public interface EquipeRepository extends JpaRepository<Equipe, Integer> {



}