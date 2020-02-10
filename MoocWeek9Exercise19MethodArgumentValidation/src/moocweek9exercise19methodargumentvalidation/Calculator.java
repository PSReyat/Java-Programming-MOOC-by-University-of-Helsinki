/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise19methodargumentvalidation;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Calculator {
    private int a;
    private int b;
    
    public Calculator(){
        this.a = 0;
        this.b = 0;
    }
    
    public int multiplication(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Invalid entry: no negative numbers allowed.");
        }
        
        return a * b;
    }
    
    public int binomialCoefficient(int setSize, int subsetSize){
        if(setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException("Invalid entry: no negative numbers allowed.");
        }else if(setSize < subsetSize){
            throw new IllegalArgumentException("Invalid entry: set can not be smaller than subset.");
        }
        
        this.a = subsetSize;
        this.b = setSize;
        
        return this.a / this.b;
    }
}
