/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import reference.domain.Film;
import java.util.*;
import reference.domain.Rating;
import reference.domain.RatingRegister;

/**
 *
 * @author Trigg
 */
public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    public int averageFilmRating(Film film){
        int average = 0;
        
        for(Rating rating : this.ratings.get(film)){
            average += rating.getValue();
        }
        
        average /= this.ratings.get(film).size();
        
        return average;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        return averageFilmRating(o2) - averageFilmRating(o1);
    }
    
}
