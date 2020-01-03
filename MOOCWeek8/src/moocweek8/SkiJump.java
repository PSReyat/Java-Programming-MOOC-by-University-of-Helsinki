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
public class SkiJump {
    private static int roundCount;
    private Skiers skier;
    private Random random;
    
    public SkiJump(){
        this.roundCount = 0;
        this.skier = new Skiers();
        this.random = new Random();
    }
    
    public int getRound(){
        this.roundCount++;
        return SkiJump.roundCount;
    }
    
    public int skiScores(){
        int getScore = this.random.nextInt(61) + 60;
        
    }
}
