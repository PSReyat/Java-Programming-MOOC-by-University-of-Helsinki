/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise35;

import dictionary.MindfulDictionary;

/**
 *
 * @author Trigg
 */
public class MOOCWeek11Exercise35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        MindfulDictionary dict = new MindfulDictionary("src/dict.txt");
        dict.load();

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("ohjelmointi"));
        System.out.println(dict.translate("alla oleva"));
    }

}
