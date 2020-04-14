/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import reader.criteria.Criterion;

/**
 *
 * @author Trigg
 */
public class ContainsWord implements Criterion {

    String word;

    public ContainsWord(String word) {
        this.word = word;
    }

    @Override
    public boolean complies(String line) {
        return line.contains(word);
    }
}
