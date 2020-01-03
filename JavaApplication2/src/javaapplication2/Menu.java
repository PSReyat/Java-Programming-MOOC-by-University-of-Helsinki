/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author Trigg
 */
public class Menu {
    private ArrayList<String> meals;
    
    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal){
        if(meals.contains(meal)){
            meals.remove(meal);
        }
        
        meals.add(meal);
    }
    
    public void printMeals(){
        System.out.print("Menu: \n");
        for(String food : meals){
            System.out.println(food);
        }
    }
    
    public void clearMenu(){
        meals.clear();
    }
}
