package com.pro.Back_end_FinArcher.data.models;

import com.pro.Back_end_FinArcher.data.enums.TypeActeur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Acteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String contact;

    // Enumérations
    @Enumerated(EnumType.STRING)
    private TypeActeur typeActeur;

    // Liens avec classes externes
    @OneToMany(cascade = CascadeType.ALL)
    List<Encaissement> encaissements = new ArrayList<>();

}
