/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise34;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class MOOCWeek11Exercise34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileManager f = new FileManager();
        ArrayList<String> s = new ArrayList<>();

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }
        
        s.add("Hello ");
        s.add("World, ");
        s.add("This is ");
        s.add("Java.");
        
        f.save("src/testinput2.txt", s);
        
        for (String line : f.read("src/testinput2.txt")) {
            System.out.println(line);
        }
    }
    
}
