/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.*;
import reference.comparator.FilmComparator;

/**
 *
 * @author Trigg
 */
public class Reference {
    private RatingRegister ratingReg;
    
    public Reference(RatingRegister ratingReg){
        this.ratingReg = ratingReg;
    }
   
    public Film recommendFilm(Person person) {
        int num = 0;
        Film recommended = null;
        try {
            for (Film film : this.ratingReg.getReviewers().get(person).keySet()) {
                for (Person compare : this.ratingReg.getReviewers().keySet()) {
                    if (this.ratingReg.getReviewers().get(compare).containsKey(film)) {
                        num = this.ratingReg.getReviewers().get(compare).get(film).getValue()
                                * this.ratingReg.getReviewers().get(person).get(film).getValue();

                        if (num > 0) {
                            for(Film highestRecommended : highestRatedFilmByReviewer(compare)){
                                if(this.ratingReg.getReviewers().get(compare).get(highestRecommended).getValue() == 3 || 
                                        this.ratingReg.getReviewers().get(compare).get(highestRecommended).getValue() == 5){
                                    
                                    if(!this.ratingReg.getReviewers().get(person).containsKey(highestRecommended)){
                                       recommended = highestRecommended; 
                                    }
                                    
                                }
                            }
                            
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e) {
            return highestRatedFilm();
        }

        return recommended;
    }
    
    public List<Film> highestRatedFilmByReviewer(Person person){
        FilmComparator recommend = new FilmComparator(this.ratingReg.filmRatings());
        List<Film> listOfFilms = new ArrayList<>();
        
        for(Film film : this.ratingReg.getReviewers().get(person).keySet()){
            listOfFilms.add(film);
        }
        
        Collections.sort(listOfFilms, recommend);
        
        return listOfFilms; 
    }
    
    public Film highestRatedFilm(){
        FilmComparator recommend = new FilmComparator(this.ratingReg.filmRatings());
        List<Film> listOfFilms = new ArrayList<>();
        
        for(Film film : this.ratingReg.filmRatings().keySet()){
            listOfFilms.add(film);
        }
        
        Collections.sort(listOfFilms, recommend);
        
        return listOfFilms.get(0);  
    }
}