package com.example.demo.Repositories;

import com.example.demo.Entities.Contrat;
import com.example.demo.Entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;


public interface DepartementRepository extends JpaRepository<Departement, Integer> {



}