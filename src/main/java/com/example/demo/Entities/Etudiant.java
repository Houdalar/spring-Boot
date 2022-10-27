package com.example.demo.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Etudiant")
    private Long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option optionE;

    @OneToMany(mappedBy = "contract_id")
    private List<Contrat> contrats;

    public Departement getEtudiant_id() {
        return etudiant_id;
    }
    @ManyToMany
    @JoinTable(name = "etudiants_universites", joinColumns = @JoinColumn(name = "idEtudiant"), inverseJoinColumns = @JoinColumn(name="idUniv"))
private List<Universite> universites ;



    @ManyToOne
    private Departement etudiant_id;

}