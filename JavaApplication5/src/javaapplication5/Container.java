/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with Suitcase.java and Thing.java classes.


//Main program:

/*
In main:
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
*/

/*
Method in main:
    public static void addSuitcasesFullOfBricks(Container container){
        for(int i = 1; i < 100; i++){
            Thing thing = new Thing("Brick", i);
            Suitcase scaseBrick = new Suitcase(100);
            scaseBrick.addThing(thing);
            container.addSuitcase(scaseBrick);
        }
    }
*/

/**
 *
 * @author Trigg
 */
public class Container {
    private static int MAX_MASS;
    private ArrayList<Suitcase> scase;
    
    public Container(int limit){
        this.MAX_MASS = limit;
        this.scase = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        this.scase.add(suitcase);
        int store = 0;
        
        for(int i = 0; i < scase.size(); i++){
            store += this.scase.get(i).totalMass();
        }
        
        if(store > this.MAX_MASS){
            this.scase.remove(suitcase);
        }
    }
    
    public String toString(){
        int totalMass = 0;
        int i = 0;
        while(i < this.scase.size()){
            totalMass += this.scase.get(i).totalMass();
            i++;
        }
        return this.scase.size() + " suitcases " + "(" + totalMass + "kg)";
    }
    
    public void printThings(){
        for(int i = 0; i < this.scase.size(); i++){
            this.scase.get(i).printThings();
        }
    }
}
