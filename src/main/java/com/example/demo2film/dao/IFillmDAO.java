package com.example.demo2film.dao;

import com.example.demo2film.model.Film;

import java.util.Date;
import java.util.List;

public interface IFillmDAO {

    List<Film> findAll();
    Film findById(int id);
    List<Film> findByRealisateur(String titre);
    void save(Film f);
    void deleteById(int id);
    void updateFilm(Film film);
    List<Film> findByTitre(String titre);
    List<Film> findByDateSortie(String datesortie);

    void deleteByTitre(String titre);

    void deleteByRealisateur(String realisateur);

    void deleteByDate(String date);
}
