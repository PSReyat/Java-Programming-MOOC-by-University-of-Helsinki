/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

//Used in conjunction with the NationalService.java interface and MilitaryService.java class.

import java.util.*;

/**
 *
 * @author Trigg
 */
public class CivilService implements NationalService {
    private int daysLeft;
    
    public CivilService(){
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        this.daysLeft -= 1;
        if(this.daysLeft < 0){
            this.daysLeft = 0;
        }
    }
    
}
