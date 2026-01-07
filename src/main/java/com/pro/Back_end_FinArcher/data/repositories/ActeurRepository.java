package com.pro.Back_end_FinArcher.data.repositories;

import com.pro.Back_end_FinArcher.data.models.Acteur;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ActeurRepository {
    private final List<Acteur> acteurs=new ArrayList<Acteur>();

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeur(Acteur acteur) {
        acteur.setNom(acteur.getNom());
        acteur.setContact(acteur.getContact());
    }

    public Acteur getActeurById(int id) {
        for (Acteur acteur : acteurs) {
            if (acteur.getId() == id) {
                return acteur;
            }
        }
        return null;
    }

    public void addActeur(Acteur acteur){
        acteurs.add(acteur);
    }

    public void removeActeur(Acteur acteur){
        acteurs.remove(acteur);
    }
}
