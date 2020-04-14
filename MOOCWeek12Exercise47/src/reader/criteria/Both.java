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
public class Both implements Criterion{
    private Criterion c1;
    private Criterion c2;
    
    public Both(Criterion c1, Criterion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean complies(String line) {
        if(this.c1.complies(line) == true && this.c2.complies(line) == true){
            return true;
        }else{
            return false;
        }
    }
    
}
