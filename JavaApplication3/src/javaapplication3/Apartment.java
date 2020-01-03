/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Trigg
 */
public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price = 0;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = this.squareMeters * this.pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.rooms > otherApartment.rooms){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        int difference = this.price - otherApartment.price;
        if(difference < 0){
            difference = difference/-1;
            return difference;
        }else{
            return difference;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if(this.price > otherApartment.price){  
            return true;
        }
        
        return false;
    }
}
