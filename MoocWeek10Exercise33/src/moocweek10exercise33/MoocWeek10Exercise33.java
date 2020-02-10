/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise33;

import dungeon.Dungeon;

/**
 *
 * @author Trigg
 */
public class MoocWeek10Exercise33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dungeon dungeon = new Dungeon(10, 15, 5, 14, true);
        
        dungeon.run();
    }
    
}
