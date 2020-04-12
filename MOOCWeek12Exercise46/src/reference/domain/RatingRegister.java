/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class RatingRegister {
    private Map<Film, List<Rating>> filmRating;
    private Map<Person, Map<Film, Rating>> reviews;
    
    public RatingRegister(){
        this.filmRating = new HashMap<>();
        this.reviews = new HashMap<>();
    }
    
    public List<Rating> getRatings(Film film){
        return this.filmRating.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return this.filmRating;
    }
    
    public Map<Person, Map<Film, Rating>> getReviewers(){
        return this.reviews;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!this.filmRating.containsKey(film)){
            this.filmRating.put(film, new ArrayList<>());
        }
        
        this.filmRating.get(film).add(rating);
        
        if(!this.reviews.containsKey(person)){
            this.reviews.put(person, new HashMap<>());
        }
        
        if(!this.reviews.get(person).containsKey(film)){
            this.reviews.get(person).put(film, rating);
        }
    }
    
    public List<Rating> getRating(Film film){
        List<Rating> ratings = new ArrayList<>();
        for(Person person : this.reviews.keySet()){
            ratings.add(this.reviews.get(person).get(film));
        }
        
        return ratings;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        return this.reviews.get(person);
    }
    
    public List<Person> reviewers(){
        List<Person> reviewerList = new ArrayList<>();
        for(Person print : this.reviews.keySet()){
            reviewerList.add(print);
        }
        
        return reviewerList;
    }
    
}
