/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Random;

/**
 *
 * @author Trigg
 */
public class Dice {
    private Random random;
    private int numberOfSides;
    
    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();
    }
    
    public int roll(){
        int sides = this.random.nextInt(numberOfSides);
        return sides + 1;
    }
}
