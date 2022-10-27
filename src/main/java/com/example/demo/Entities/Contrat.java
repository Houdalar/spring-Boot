package com.example.demo.Entities;


import com.fasterxml.jackson.databind.DatabindException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="Contrat")

public class Contrat implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Contrat")
    private int idContrant;
    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal (TemporalType.DATE)

    private Date dateFinContrat;
    Specialite specialite;

    boolean archive;
    int montantContrat;

    @ManyToOne
    private Etudiant contract_id;


    public boolean isArchive() {
        return archive;
    }


}
