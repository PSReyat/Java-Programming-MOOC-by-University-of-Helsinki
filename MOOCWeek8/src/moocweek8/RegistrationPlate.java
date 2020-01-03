/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.Objects;

//Used in conjunction with VehicleRegister.java class

//Code used in main.java

/*
RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
        RegistrationPlate reg4 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg5 = new RegistrationPlate("FU", "SUK-MY-D1CK");
        RegistrationPlate reg6 = new RegistrationPlate("D", "B WQ-431");
        
        if(reg1.equals(reg4)){
            System.out.println("This shit works.");
        }else{
            System.out.println("This shit doesn't work");
        }
        
        if(reg3.equals(reg6)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
        System.out.println(reg1.hashCode());
        System.out.println(reg2.hashCode());
        System.out.println(reg3.hashCode());
        System.out.println(reg4.hashCode());
        System.out.println(reg5.hashCode());
        System.out.println(reg6.hashCode());
*/

/**
 *
 * @author Trigg
 */
public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
       this.regCode = regCode;
       this.country = country;
    }
    
    @Override
    public String toString(){
        return country + " " + regCode;
    }
    
    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }

        return 13 + this.regCode.hashCode();
    }
    
    //The object class is the parent class of ALL classes in Java.
    //It's essentially a stem cell. The objects of this class are undifferentiated
    //and therefore can become any other class.

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
        
        final RegistrationPlate other = (RegistrationPlate) obj;
        if (!Objects.equals(this.regCode, other.regCode)) {
            return false;
        }
        return true;
    }
    
    
}
