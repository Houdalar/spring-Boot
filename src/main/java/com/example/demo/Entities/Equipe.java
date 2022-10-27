package com.example.demo.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Equipe")
    private int idEquipe;
    String nomEquipe;
    Niveau niveau;

    @OneToOne(cascade = CascadeType.ALL )
    private DetailEquipe d_equipe;
}
