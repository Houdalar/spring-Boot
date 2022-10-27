package com.example.demo.Repositories;


import com.example.demo.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {




}