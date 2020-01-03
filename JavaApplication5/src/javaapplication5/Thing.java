/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

//Used in conjunction with Suitcase.java and Container.java classes.

/**
 *
 * @author Trigg
 */
public class Thing {
    private String name;
    private int mass;
    
    public Thing(String name, int mass){
        this.name = name;
        this.mass = mass;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getMass(){
        return this.mass;
    }
    
    public String toString(){
        return this.name + " (" + this.mass + "kg)";
    }
    
}
