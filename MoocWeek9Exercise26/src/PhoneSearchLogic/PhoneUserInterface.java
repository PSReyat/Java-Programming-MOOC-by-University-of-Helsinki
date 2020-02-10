/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearchLogic;

import PhoneSearchApp.Phone;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class PhoneUserInterface {

    private Phone phone;
    private Scanner reader;

    public PhoneUserInterface() {
        this.phone = new Phone();
        this.reader = new Scanner(System.in);

        this.phone.addContact("John", "123");
        this.phone.addStreet("John", "asd ayt");
        this.phone.addCity("John", "Poe");

        this.phone.addContact("Lowe", "456");
        this.phone.addStreet("Lowe", "aww poi");
        this.phone.addCity("Lowe", "Koe");

        this.phone.addContact("Pat", "789");
        this.phone.addStreet("Pat", "aqq hgq");
        this.phone.addCity("Pat", "Zoe");

        this.phone.addContact("Sukhi", "101");
        this.phone.addStreet("Sukhi", "as ewq");
        this.phone.addCity("Sukhi", "Loe");

        this.phone.addContact("Karwa", "112");
        this.phone.addStreet("Karwa", "a ewyy");
        this.phone.addCity("Karwa", "Qoe");
    }

    public void start() {
        operations();
        String read = "";
        String name = "";

        while (true) {
            System.out.print("Command: ");
            read = this.reader.nextLine();

            if(read.equals("1")){
                System.out.print("Enter the name of the person: ");
                read = this.reader.nextLine();
                name = read;
                System.out.print("What is their phone number: ");
                read = this.reader.nextLine();
                addContacts(name, read);
            } else if (read.equals("2")) {
                System.out.print("Enter the name of the person: ");
                read = this.reader.nextLine();
                name = read;
                System.out.print("Enter the phone number you want to add: ");
                read = this.reader.nextLine();
                addNumbers(name, read);
            } else if (read.equals("3")) {
                System.out.print("Enter the name of the person: ");
                read = this.reader.nextLine();
                searchForNumber(read);
            } else if (read.equals("4")) {
                System.out.print("What is their phone number: ");
                read = this.reader.nextLine();
                searchForPersonByNumber(read);
            } else if (read.equals("5")) {
                System.out.print("Enter the name of the person: ");
                read = this.reader.nextLine();
                name = read;
                System.out.print("What is the name of the street they live on: ");
                read = this.reader.nextLine();
                addStreet(name, read);
                System.out.print("What is the city they live in: ");
                read = this.reader.nextLine();
                addCity(name, read);
            } else if (read.equals("6")) {
                System.out.print("Enter the name of the person: ");
                read = this.reader.nextLine();
                printPersonalDetails(read);
            } else if (read.equals("7")) {
                System.out.print("Enter the name of the person: ");
                read = this.reader.nextLine();
                removePersonalInfo(read);
            } else if (read.equals("8")) {
                System.out.print("Enter the search term: ");
                read = this.reader.nextLine();
                for (String print : this.phone.searchByKeyWord(read)) {
                    System.out.println(print);
                    printPersonalDetails(print);
                }
            } else if (read.equals("x")) {
                break;
            } else {
                System.out.println("Invalid input.");
            }

            System.out.println();
        }

    }

    public void operations() {
        System.out.println("Phone Search");
        System.out.println("Available options:");
        System.out.println(" [1] add a contact\n"
                + " [2] add a number\n"
                + " [3] search for a number\n"
                + " [4] search for a person by phone number\n"
                + " [5] add an address\n"
                + " [6] search for personal information\n"
                + " [7] delete personal information\n"
                + " [8] filtered listing\n"
                + " [x] quit\n");
    }

    public void addContacts(String name, String number) {
        this.phone.addContact(name, number);
    }
    
    public void addNumbers(String name, String number){
        this.phone.addNumber(name, number);
    }

    public void printPersonalDetails(String name) {
        System.out.println(this.phone.personalDetails(name));
    }

    public void searchForNumber(String name) {
        if (this.phone.getContact(name) != null) {
            System.out.println("Number: " + this.phone.getContact(name));
        }else if(this.phone.getContact(name) == null){
            System.out.println("Person not found");
        }
    }

    public void searchForPersonByNumber(String name) {
        System.out.println(this.phone.getNameByPhoneNumber(name));
    }

    public void addStreet(String name, String street) {
        this.phone.addStreet(name, street);
    }

    public void addCity(String name, String city) {
        this.phone.addCity(name, city);
    }

    public void removePersonalInfo(String name) {
        this.phone.removeDetails(name);
    }

    public void filteredListing(String keyword) {
        System.out.println(this.phone.searchByKeyWord(keyword));
    }
}