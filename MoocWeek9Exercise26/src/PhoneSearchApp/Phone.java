/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearchApp;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Phone {
    private Map<String, List<String>> contactList;
    private Map<String, List<String>> addressStreet;
    private Map<String, List<String>> addressCity;
    
    public Phone(){
        this.contactList = new HashMap<>();
        this.addressStreet = new HashMap<>();
        this.addressCity = new HashMap<>();
    }
    
    public void addContact(String name, String number){
        name = name.toUpperCase();
        if(!this.contactList.containsKey(name)){
            this.contactList.put(name, new ArrayList<>());
        }
        
        this.contactList.get(name).add(number);
    }
    
    public void addNumber(String name, String number){
        this.contactList.get(name).add(number);
    }
    
    public List<String> getContact(String name){
        name = name.toUpperCase();
        return this.contactList.get(name);
    }
    
    public String getNameByPhoneNumber(String number){
        List<String> retrieval = new ArrayList<String>();
        String name = "";
        for(String num : this.contactList.keySet()){
            retrieval = this.contactList.get(num);
            
            if(retrieval.contains(number)){
                name = num;
                break;
            }
        }
        
        return name;
    }
    
    
    //I have to add multiple lines of address.
    //How am I to add street name, city, etc. in a HashMap?
    //The address must be seperate things, like street name and city.
    //The address will be stored:
    /*
    Street
    City
    Country - though, this won't be included for now.
    */
    public void addStreet(String name, String street){
        name = name.toUpperCase();
        street = street.toUpperCase();
        
        if(!this.addressStreet.containsKey(name)){
            this.addressStreet.put(name, new ArrayList<>());
        }
        
        this.addressStreet.get(name).add(street);
    }
    
    public void addCity(String name, String city){
        name = name.toUpperCase();
        city = city.toUpperCase();
        
        if(!this.addressCity.containsKey(name)){
            this.addressCity.put(name, new ArrayList<>());
        }
        
        this.addressCity.get(name).add(city);
    }
    
    public String getAddress(String name){
        name = name.toUpperCase();
        return "  Street: " + this.addressStreet.get(name).get(0) + "\n  City: " + this.addressCity.get(name).get(0);
    }
    
    public String personalDetails(String name){
        name = name.toUpperCase();
        try {
            if (this.addressStreet.get(name).isEmpty() || this.addressCity.get(name).isEmpty()) {
                return "  Address unknown\n" + "  Phone number(s):\n" + this.contactList.get(name);
            } else if (this.contactList.get(name).isEmpty()) {
                return "  Address:\n" + getAddress(name) + "\n  Phone number not known";
            } else if (this.addressStreet.get(name).isEmpty() && this.addressCity.get(name).isEmpty() && this.contactList.get(name).isEmpty()) {
                return "  Address unkown" + "\n  Phone number not known";
            }
            return getAddress(name) + "\n  Phone numbers: " + this.contactList.get(name);
            
        } catch (Exception e) {
            System.out.print("Name not found.");
        }
        
        return "";
    }

    public void removeDetails(String name){
        name = name.toUpperCase();
        this.contactList.remove(name);
        this.addressStreet.remove(name);
        this.addressCity.remove(name);
    }
  
    public List<String> searchByKeyWord(String keyword) {
        List<String> kword = new ArrayList<>();

        int i = 0;
        int j = 0;
        
        keyword = keyword.toUpperCase();
        
        for (String search : this.contactList.keySet()) {
            
            if (this.contactList.get(search).get(i).contains(keyword) || search.contains(keyword)) {
                kword.add(search);
            } else if (search.contains(keyword) || this.addressStreet.get(search).get(j).contains(keyword) || 
                    this.addressCity.get(search).get(j).contains(keyword)) {
                kword.add(search);
            }

        }

        return kword;
    }
}