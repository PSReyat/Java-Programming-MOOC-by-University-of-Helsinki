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
public class Not implements Criterion{
    private Criterion c1;
    
    public Not(Criterion c1){
        this.c1 = c1;
    }

    @Override
    public boolean complies(String line) {
        if(this.c1.complies(line) == true){
            return false;
        }else{
            return true;
        }
    }
    
}
