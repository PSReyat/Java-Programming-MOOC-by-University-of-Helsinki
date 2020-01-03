/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with Storehouse.java, Purchase.java and Shop.java classes

/**
 *
 * @author Trigg
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<>();
    }
    
    public void add(String product, int price){
        Purchase item = new Purchase(product, 1, price);
        if(this.basket.get(product) != null){
            this.basket.get(product).increaseAmount();
        }else{
            this.basket.put(product, item);
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for(Purchase stuff : this.basket.values()){
            totalPrice += stuff.price();
        }
        
        return totalPrice;
    }
    
    public void print(){
        for(String print : this.basket.keySet()){
            System.out.println(this.basket.get(print));
        }
    }
}
