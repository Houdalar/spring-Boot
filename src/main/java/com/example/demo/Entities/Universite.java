package com.example.demo.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Universite")
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Universite")
    private int idUniv;
    private String nomUniv;

    @ManyToMany(mappedBy = "universites")
    private List<Etudiant> etudiants ;


}
