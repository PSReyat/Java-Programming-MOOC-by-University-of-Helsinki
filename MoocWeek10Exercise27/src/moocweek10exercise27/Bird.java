/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise27;

import java.util.Objects;

/**
 *
 * @author Trigg
 */
public class Bird {
    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + "(" + this.ringingYear + ")";
    }
    
    public String getLatinName(){
        return this.latinName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.latinName);
        hash = 47 * hash + this.ringingYear;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Bird other = (Bird) obj;
        
        if (this.ringingYear != other.ringingYear) {
            return false;
        }
        if (!Objects.equals(this.latinName, other.latinName)) {
            return false;
        }
        return true;
    }
    
    
}