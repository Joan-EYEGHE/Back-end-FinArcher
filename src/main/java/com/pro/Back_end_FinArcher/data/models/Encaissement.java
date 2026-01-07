package com.pro.Back_end_FinArcher.data.models;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("ENCAISSEMENT")
public class Encaissement extends Transaction{

    // Liens avec classes externes
    @ManyToOne
    @JoinColumn(name = "portefeuille_id")
    private Portefeuille portefeuille;

    @ManyToOne
    @JoinColumn(name = "acteur_id")
    private Acteur acteur;


}
