/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with AirportUI.java class and AirportCodes.java class.

/**
 *
 * @author Trigg
 */
public class Airport {
    private HashMap<String, Integer> planes;
    
    public Airport(){
        this.planes = new HashMap<>();
    }
    
    public void addPlanes(String plane, int capacity){
        this.planes.put(plane, capacity);
    }
    
    public ArrayList<String> planeList(){
        ArrayList<String> list = new ArrayList<>();
        for(String copy : this.planes.keySet()){
            list.add(copy);
        }
        
        return list;
        
    }
    
    public int getPlanes(String x){
        return this.planes.get(x);
    }
}
