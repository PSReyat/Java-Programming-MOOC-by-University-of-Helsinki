/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with Airport.java class and AirportUI.java class.

/**
 *
 * @author Trigg
 */
public class AirportCodes {
    private HashMap<String, String> airportCodes;
    
    public AirportCodes(){
        this.airportCodes = new HashMap<>();
    }
    
    public void addCodes(String departureCode, String arrivalCode){
        this.airportCodes.put(departureCode, arrivalCode);
    }
    
    public ArrayList<String> codeList(){
        ArrayList<String> list = new ArrayList<>();
        for(String copy : this.airportCodes.keySet()){
            list.add(copy);
        }
        
        return list;
    }
    
    public String getCodes(String x){
        return this.airportCodes.get(x);
    }
    
}
