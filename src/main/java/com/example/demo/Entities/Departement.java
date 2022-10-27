package com.example.demo.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Departement")
public class Departement {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Departement")
    private int idDepart;
    String nomDepart;



    @OneToMany(mappedBy = "etudiant_id")
    private List<Etudiant> etudiants;

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

}
