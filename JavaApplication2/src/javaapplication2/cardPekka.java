/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Trigg
 */
public class cardPekka {
    private double balance;

    public cardPekka(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "\nPekka has " + this.balance + " euros.";
    }
    
    public void payEconomical(){
        this.balance = this.balance - 2.5;
        if(this.balance < 0){
            this.balance = this.balance + 2.5;
            System.out.println("Insufficient funds.");
        }
    }
    
    public void payGourmet(){
        this.balance = this.balance - 4.0;
        if(this.balance < 0){
            this.balance = this.balance + 4.0;
            System.out.println("Insufficient funds.");
        }
    }
    
    public void loadMoney(double amount){
        this.balance = this.balance + amount;
        if(this.balance >= 150){
            this.balance = this.balance - amount;
            System.out.println("The maximum amount the Lyyra Card can hold is 150 euros.");
        }else if(amount < 0){
            this.balance = this.balance + (amount/(-1));
        }
    }
}
