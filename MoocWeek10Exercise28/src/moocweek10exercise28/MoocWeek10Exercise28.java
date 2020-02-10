/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise28;

import Movable.Group;
import Movable.Organism;

/**
 *
 * @author Trigg
 */
public class MoocWeek10Exercise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Group group = new Group();
        group.addToGroup(new Organism(73, 56));
        group.addToGroup(new Organism(57, 66));
        group.addToGroup(new Organism(46, 52));
        group.addToGroup(new Organism(19, 107));
        System.out.println(group);
    }

}
