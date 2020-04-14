/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek12exercise47;

import java.io.IOException;
import java.net.MalformedURLException;
import reader.criteria.AtLeastOne;
import reader.criteria.Both;
import reader.criteria.ContainsWord;
import reader.criteria.Criterion;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.GutenbergReader;
import reader.criteria.LengthAtLeast;
import reader.criteria.Not;

/**
 *
 * @author Trigg
 */
public class MOOCWeek12Exercise47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException, MalformedURLException, IOException {
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new AtLeastOne(
                    new ContainsWord("beer"),
                    new ContainsWord("milk"),
                    new ContainsWord("oil")
                );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
    
}
