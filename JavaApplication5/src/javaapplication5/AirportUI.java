/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with Airport.java class and AirportCodes.java class.

/**
 *
 * @author Trigg
 */
public class AirportUI {
    private final Scanner reader;
    private final Airport airport;
    private final AirportCodes airportCodes;
    private final HashMap<String, String> info;
    
    public AirportUI(Scanner reader){
        this.reader = reader;
        this.airport = new Airport();
        this.airportCodes = new AirportCodes();
        this.info = new HashMap<>();
    }
    
    public void startOperations(){
        String enter = "";
        System.out.println("Airport Panel\n---------------\n");
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane\n[2] Add flight\n[x] Exit");

        System.out.print("> ");
        enter = this.reader.nextLine();
        
        /*
        The part below needs work. When you enter 'x' it doesn't go to the
        next menu. 
        This is because there is no break command in the operationSelection1 method.
        So it carries out the method but doesn't recognise the 'x' input so it spits out an 
        invalid entry message. Then, if you enter 'x' again, then it will go through the method
        once more and then print out 'Choose operation: ', then going to the if statement below, thus
        breaking out of the loop.
        Problem: I need to figure out how to switch between menu's effortlessly.
        */
        
        while(true){
            operationSelection1(enter);
            
            if(enter.equals("x")){
                break;
            }
            
            enter = this.reader.nextLine();
        } 
        
        System.out.println("Flight Service\n---------------\n");
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes\n[2] Print flights\n"
                + "[3] Print plane info\n[x] Exit\n[<] To go back to previous menu");
        
        System.out.print("> ");
        enter = this.reader.nextLine();
        
        while(true){
            if(enter.equals("<")){
                System.out.println("[1] Add airplane\n[2] Add flight\n[x] Exit\n[>] To next menu");
                while (true) {
                    operationSelection1(enter);
                    
                    if(enter.equals(">")){
                        System.out.println("\n[1] Print planes\n[2] Print flights\n"
                                + "[3] Print plane info\n[x] Exit\n[<] To go back to previous menu");
                        break;
                    }
                    
                    enter = this.reader.nextLine();
                }
            }
            
            operationSelection2(enter);
            
            if(enter.equals("x")){
                break;
            }
            
            System.out.print("Choose another operation:\n> ");
            enter = this.reader.nextLine();
        }
    }
    
    public void operationSelection1(String enter){
        if (enter.equals("1")) {
                addAirplane();
            } else if (enter.equals("2")) {
                addFlight();
            }else{
                System.out.print("Invalid entry. Enter an operation: ");
                enter = this.reader.nextLine();
            }
            
            System.out.print("Choose another operation:\n> ");
    }
    
    public void operationSelection2(String enter){
        if (enter.equals("1")) {
                printPlanes();
            } else if (enter.equals("2")) {
                printFlights();
            } else if (enter.equals("3")) {
                printInfo();
            }else if (enter.equals("<")){
                while(true){
                    operationSelection1(enter);
                    
                    if(enter.contains("x")){
                        break;
                    }
                }
            }else{
                System.out.print("Invalid entry. Enter an operation: ");
                enter = this.reader.nextLine();
            }
    }
    
    public void addAirplane(){
        String plane = "";
        int capacity = 0;
        System.out.print("Give plane ID: ");
        plane = this.reader.nextLine();
        plane = cleanUp(plane);
        System.out.print("Give plane capacity: ");
        capacity = Integer.parseInt(this.reader.nextLine());
        this.airport.addPlanes(plane, capacity);
    }
    
    public void addFlight(){
        String plane = "";
        String departureCode = "";
        String arrivalCode = "";
        
        System.out.print("Give plane ID: ");
        plane = this.reader.nextLine();
        plane = cleanUp(plane);
        
        while(!this.airport.planeList().contains(plane)){
            System.out.print("Invalid plane ID. Please enter a plane ID: ");
            plane = this.reader.nextLine();
            plane = cleanUp(plane);
        }
        
        System.out.print("Give departure airport code: ");
        departureCode = this.reader.nextLine();
        departureCode = cleanUp(departureCode);
        
        System.out.print("Give destination airport code: ");
        arrivalCode = this.reader.nextLine();
        arrivalCode = cleanUp(arrivalCode);
        
        this.airportCodes.addCodes(departureCode, arrivalCode);
        this.info.put(plane, departureCode);
    }
    
    public void printPlanes(){
        for(String print : this.airport.planeList()){
            System.out.println(print + " (" + this.airport.getPlanes(print) + " passengers)");
        }
    }
    
    public void printFlights(){
        for(String print : this.info.keySet()){
            System.out.println(print + " (" + this.airport.getPlanes(print) 
                    + " passengers) " + this.info.get(print) + " - " 
                    + this.airportCodes.getCodes(this.info.get(print)));
        }
    }
    
    public void printInfo(){
        String plane = "";
        System.out.print("Give plane ID: ");
        plane = this.reader.nextLine();
        plane = cleanUp(plane);
        
        while(!this.airport.planeList().contains(plane)){
            System.out.print("Invalid plane ID. Please enter a plane ID: ");
            plane = this.reader.nextLine();
            plane = cleanUp(plane);
        }
        
        System.out.println(plane + " (" + this.airport.getPlanes(plane) 
                + " passengers) " + this.info.get(plane) 
                + " - " + this.airportCodes.getCodes(this.info.get(plane)));
    }
    
    public String cleanUp(String clean){
        return clean.toUpperCase().trim();
    }
}