/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with RegistrationPlate.java class

/**
 *
 * @author Trigg
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owner;
    
    public VehicleRegister(){
        this.owner = new HashMap<>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.owner.get(plate) == null){
            this.owner.put(plate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(RegistrationPlate plate){
        if(this.owner.get(plate) == null){
            return null;
        }
        
        return this.owner.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        for(RegistrationPlate delete : this.owner.keySet()){
            if(delete == plate){
                this.owner.remove(plate);
                return true;
            }
        }
        
        return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate print : this.owner.keySet()){
            System.out.println(print);
        }
    }
    
    public void printOwners(){
        ArrayList<RegistrationPlate> owners = new ArrayList<>();
        
        for(RegistrationPlate print : this.owner.keySet()){
            owners.add(print);
        }
        
        for(int i = 0; i < owners.size(); i++){
            System.out.println(this.owner.get(owners.get(i)));
        }
    }
}
