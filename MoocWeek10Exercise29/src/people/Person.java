/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Person {
    protected String name;
    protected String address;
    private Map<String, String> personAddress;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
        this.personAddress = new HashMap<>();
        this.personAddress.put(name, address);
    }
    
    public String getName(String name){
        for(String search : this.personAddress.keySet()){
            name = search;
        }
        
        return name;
    }
    
    public String getAddress(String name){
        return this.personAddress.get(name);
    }
    
    @Override
    public String toString(){
        return this.name + "\n  " + this.address;
    }
}
