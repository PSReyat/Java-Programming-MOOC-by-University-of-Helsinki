/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Judges {
    private ArrayList<Integer> scores;
    private Skiers skier;
    
    public Judges(){
        this.scores = new ArrayList<>();
        this.skier = new Skiers();
    }
    
    public ArrayList<Integer> getScores(){
        this.scores.clear();
        Random random = new Random();
        int scoreRange = 0;
        for(int i = 0; i < 5; i++){
            scoreRange = random.nextInt(11) + 10;
            this.scores.add(scoreRange);
        }
        
        return this.scores;
    }
    
    public ArrayList<Integer> getBetween(){
        Collections.sort(this.scores);
        
        this.scores.remove(0);
        this.scores.remove(4);
        
        return this.scores;
    }
    
    public int getTotalScores(String name){
        int total = 0;
        
        for(int i : getBetween()){
            total += i;
        }
        
        return total;
    }
}
