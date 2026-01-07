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
@DiscriminatorValue("DEPENSE")
public class Depense extends Transaction{
    private int quantite;
    private double solde;

    // Liens avec classes externes
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}
