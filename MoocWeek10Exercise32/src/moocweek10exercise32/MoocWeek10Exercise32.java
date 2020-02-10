/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise32;

import boxes.BlackHoleBox;
import boxes.MaxWeightBox;
import boxes.OneThingBox;
import boxes.Thing;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class MoocWeek10Exercise32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
    }
    
}
