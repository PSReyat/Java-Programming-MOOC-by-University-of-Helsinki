/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Trigg
 */
public class Product {
    private String productName;
    private double productPrice;
    private int productAmount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        Scanner next = new Scanner(System.in);
        
        this.productName = nameAtStart;
        this.productPrice = priceAtStart;
        this.productAmount = amountAtStart;
        
    }
    
    public void printProduct(){
        System.out.println(this.productName + ", price " + this.productPrice + ", amount " + this.productAmount);
    }
}
