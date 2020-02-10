/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise24;

import dictionary.MultipleEntryDictionary;
import dictionary.PersonalMultipleEntryDictionary;

/**
 *
 * @author Trigg
 */
public class MoocWeek9Exercise24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");

        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
    }
    
}
