/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Trigg
 */
public class AllLines implements Criterion{
    private String lines;
    
    public AllLines(String line){
        this.lines = line;
    }
    
    @Override
    public boolean complies(String line) {
        return true;
    }
    
}
