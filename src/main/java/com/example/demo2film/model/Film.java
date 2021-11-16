package com.example.demo2film.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Film {
    private int id;
    private String titre;
    private String realisateur;
    private String dateSortie;

    public Film(int id, String titre, String realisateur, String dateSortie) {
        this.id = id;
        this.titre = titre;
        this.realisateur = realisateur;
        this.dateSortie= dateSortie;
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

    public void setDateSortie(String dateSortie) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format( dateSortie);
        this.dateSortie = dateSortie;
    }

    public String  getDateSortie() {
        return dateSortie;
    }
}
