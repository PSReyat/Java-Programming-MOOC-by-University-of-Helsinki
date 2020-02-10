/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class ProductContainer extends Container{
    private String productName;
    private double capacity;
    
    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.productName = productName;
        this.capacity = capacity;
    }
    
    public void setName(String newName){
        this.productName = newName;
    }
    
    public String getName(){
        return this.productName;
    }
    
    @Override
    public String toString(){
        return getName() + ":\n" + super.toString();
    }
}
