package com.example.demo2film.web.controller;

import com.example.demo2film.dao.IFillmDAO;
import com.example.demo2film.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {
    @Autowired
    private IFillmDAO dao;

    /*
    * Methode read
    * */

    @GetMapping(value="/Films")
    public List<Film> getLesFilms(){
        return dao.findAll();
            }

    @GetMapping(value="/FilmsById/{id}")
    public Film getFilmById(@PathVariable int id){
        return dao.findById(id);
    }

    @GetMapping(value="/FilmsByTitre/{titre}")
    public List<Film> getFilmByTitre(@PathVariable String titre){
        return dao.findByTitre(titre);
    }

    @GetMapping(value="/FilmsByRealisateur/{realisateur}")
    public List<Film> getFilmByRealisateur(@PathVariable String realisateur){
        return dao.findByRealisateur(realisateur);
    }

    @GetMapping(value="/FilmsByDateSortie/{datesortie}")
    public List<Film> getFilmByDateSortie(@PathVariable String datesortie){
        return dao.findByDateSortie(datesortie);
    }

    /*
     * Methode delete
     * */

    @DeleteMapping(value="/FilmsDelete/{id}")
    public void deteleteById(@PathVariable int id ){
        dao.deleteById(id);
    }

    @DeleteMapping(value="/FilmsDeleteByTitre/{titre}")
    public void deteleteByTitre(@PathVariable String titre ){
        dao.deleteByTitre(titre);
    }

    @DeleteMapping(value="/FilmsDeleteByRealisateur/{realisateur}")
    public void deteleteByRealisateur(@PathVariable String realisateur ){
        dao.deleteByRealisateur(realisateur);
    }

    @DeleteMapping(value="/FilmsDeleteByDate/{date}")
    public void deteleteByDate(@PathVariable String date ){
        dao.deleteByDate(date);
    }

    /*
     * Methode put
     * */

    @PutMapping(value = "/FilmsUpdate")
    public void updateUser(@RequestBody Film film) {
        dao.updateFilm(film);
    }

    /*
     * Methode Post
     * */


    @PostMapping(value="FilmsAdd")
    public void addFilm(@RequestBody Film f){
        dao.save(f);
    }

}
