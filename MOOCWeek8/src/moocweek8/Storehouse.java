/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with Shop.java, Purchase.java and ShoppingBasket.java classes

/**
 *
 * @author Trigg
 */
public class Storehouse {
    private Map<String, Integer> store;
    private Map<String, Integer> stock;
    
    public Storehouse(){
        this.store = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.store.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        if (store.get(product) == null) {
            return -99;
        }

        return store.get(product);
    }
    
    public int stock(String product){
        if(this.stock.get(product) == null){
            return 0;
        }
        
        return this.stock.get(product);
    }
    
    public boolean take(String product){
        int buffer = 0;
        if(this.stock.get(product) != null){
            buffer = this.stock.get(product) - 1;
            if(buffer < 0){
                buffer = 0;
                return false;
            }
            this.stock.put(product, buffer);
            
            return true;
        }
        
        return false;
    }
    
    public Set<String> products(){
        return this.stock.keySet();
    }
}
