/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise25;

import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;

/**
 *
 * @author Trigg
 */
public class MoocWeek9Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: "
                + remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: "
                + remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: "
                + remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: "
                + remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: "
                + remover.getUniqueCharacterStrings());
    }
    
}
