package com.example.demo2film.model;

import java.text.SimpleDateFormat;

public class Film {
    private int id;
    private String titre;
    private String realisateur;
    private String anneSortie;

    public Film(int id, String titre, String realisateur, String anneSortie) {
        this.id = id;
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneSortie = anneSortie;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setAnneSortie(String anneSortie) {
        this.anneSortie = anneSortie;
    }

    public String getAnneSortie() {
        return anneSortie;
    }
}
