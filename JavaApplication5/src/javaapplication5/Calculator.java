/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

//Used in conjunction with Reader.java class.

/**
 *
 * @author Trigg
 */
public class Calculator {
    private Reader reader;
    private int count;
    private int v1;
    private int v2;
    
    public Calculator(){
        this.reader = new Reader();
        this.count = 0;
        this.v1 = 0;
        this.v2 = 0;
    }
    
    public void start() {
        String command = "";
        while (true) {
            System.out.print("command: ");
            command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                count++;
            } else if (command.equals("difference")) {
                difference();
                count++;
            } else if (command.equals("product")) {
                product();
                count++;
            }
        }

        statistics();
    }
    
    private void sum(){
        enterValues();
        System.out.println("The sum of these two numbers is: " + (this.v1 + this.v2));
    }
    
    private void difference(){
        enterValues();
        System.out.println("The difference of these two numbers is: " + (this.v1 - this.v2));
    }
    
    private void product(){
        enterValues();
        System.out.println("The product of these two numbers is: " + (this.v1 * this.v2));
    }
    
    private void statistics(){
        System.out.println("Number of calculations: " + this.count);
    }
    
    private void enterValues(){
        System.out.print("First number: ");
        this.v1 = this.reader.readInteger();
        System.out.print("Second number: ");
        this.v2 = this.reader.readInteger();
    }
}
