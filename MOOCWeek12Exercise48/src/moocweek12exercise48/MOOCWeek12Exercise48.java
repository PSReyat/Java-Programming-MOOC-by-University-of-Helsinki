/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek12exercise48;

/**
 *
 * @author Trigg
 */
public class MOOCWeek12Exercise48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }
    
    public static String build(int[] t) {
        String str = "{\n";
        
        for (int i = 0; i < t.length; i++) {
            str += t[i];
            
            if (i != t.length - 1) {
                str += ", ";
                
                if(t[i] % 4 == 0){
                    str += "\n";
                }

            }
        }

        return str + "\n}";
    }
    
}
