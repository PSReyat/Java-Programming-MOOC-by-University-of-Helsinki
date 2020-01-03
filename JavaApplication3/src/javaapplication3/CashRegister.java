/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/*
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );
        
        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );

        /*
        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );
        */
        
        /*
        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println( unicafeExactum );
        */

        /*theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println( unicafeExactum );
        */
        
        /*LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );
        */
*/

/**
 *
 * @author Trigg
 */
public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }
    
    public boolean payEconomical(LyyraCard card) {
        if(card.balance() >= 2.5){
            card.pay(2.5);
            this.cashInRegister += 2.5;
            this.economicalSold++;
            return true;
        }
        
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if(card.balance() >= 4.0){
            card.pay(4.0);
            this.cashInRegister += 4.0;
            this.gourmetSold++;
            return true;
        }
        
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        //Forgot to make the money added positive. Can't load negative money.
        if(sum > 0){
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
        
    }

    /*public double payEconomical(double cashGiven) {
        if(cashGiven >= 2.5){
            this.cashInRegister = this.cashInRegister + 2.5;
            cashGiven = cashGiven - 2.5;
            this.economicalSold++;
        }else if(cashGiven < 2.5){
            System.out.println("Insufficient funds.");
        }
        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven >= 4.0){
            this.cashInRegister = this.cashInRegister + 4.0;
            cashGiven = cashGiven - 4.0;
            this.gourmetSold++;
        }else if(cashGiven < 4.0){
            System.out.println("Insufficient funds.");
        }
        
        return cashGiven;
    }*/

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold+" gourmet lunches sold: " + gourmetSold;
    }
}
