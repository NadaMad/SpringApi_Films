package com.example.demo2film.dao;

import com.example.demo2film.model.Film;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Repository
public class FilmDAO implements IFillmDAO {
    private List<Film> films;

    /*
    * Constructeur
    * */
    public FilmDAO(){
        this.films =new ArrayList<>(){
            {
                add(new Film(1,"Titanicc","James Cameron","1998-01-8"));
                add(new Film(2,"Alien","Ridley Scott","2003-9-23"));
                add(new Film(3,"Star Wars, épisode IV : Un nouvel espoir","George Lucas","1978-3-9"));
                add(new Film(4,"Spider-Man","Sam Raimi","2002-6-12"));
                add(new Film(5,"Papillon","Franklin Schaffner","1974-3-3"));
                add(new Film(6,"Leon","Luc Besson","1994-9-14"));
                add(new Film(7,"Spider-Man 2","Sam Raimi","2004-11-30"));
            }
        };
    }

    /*Methodes GET*/
    @Override
    public List<Film> findAll() {
        return this.films;
    }

    @Override
    public Film findById(int id) {
        Film film=null;
        for (Film f: films){
            if(f.getId()==id){
                film=f;
            }
        }
        return film;
    }

    @Override
    public List<Film> findByRealisateur(String realisateur) {
        List<Film> realisateurFilm=new ArrayList<>();
        for (Film film: films){
            if(film.getRealisateur().toLowerCase().contains(realisateur.toLowerCase())==true || film.getRealisateur().replace(" ","").toLowerCase().equals(realisateur.replace(" ","").toLowerCase())){
                realisateurFilm.add(film);
            }
        }
        return realisateurFilm;
    }


    @Override
    public List<Film> findByTitre(String titre) {
        List<Film> f = new ArrayList<>();
        for(Film film : films) {
            if(film.getTitre().toLowerCase().contains(titre.toLowerCase())==true || film.getTitre().replace(" ","").toLowerCase().equals(titre.replace(" ","").toLowerCase())){
                f.add(film);
            }
        }
        return f;
    }

    @Override
    public  List<Film> findByDateSortie(String datesortie) {
        List<Film> anneeFilm=new ArrayList<>();
        for (Film film: films){
            if(film.getDateSortie().contains(datesortie)==true ||film.getDateSortie().equals(datesortie)){
                anneeFilm.add(film);
            }
        }
        return anneeFilm;
    }

    /*
    Methodes Delete
     */

    @Override
    public void deleteById(int id) {
        this.films.removeIf(film -> film.getId()== id);
    }

    @Override
    public void deleteByTitre(String titre) {
        String title=titre.toLowerCase();
        this.films.removeIf(film -> title.equals(film.getTitre().toLowerCase()));
    }

    @Override
    public void deleteByRealisateur(String realisateur) {
        String reali=realisateur.toLowerCase();
        this.films.removeIf(film -> reali.equals(film.getRealisateur().toLowerCase()));
    }

    @Override
    public void deleteByDate(String date) {
        System.out.println(date);
        System.out.println();
        this.films.removeIf(film -> film.getDateSortie().equals(date));
    }

    /*
    *Methode put */

    @Override
    public void save(Film film) {
        boolean idAlreadyexist=false;
        for (Film f:films) {
            if (f.getId() == film.getId()) {
                film.setId(f.getId() + 1);
            }
        }
        this.films.add(film);
    }

    /*
    *Methode post
     */

    @Override
    public void updateFilm(Film film) {
        for(Film f : films) {
            if(f.getId() == film.getId()) {
                this.films.set(this.films.indexOf(f), film);
            }
        }

    }

}
