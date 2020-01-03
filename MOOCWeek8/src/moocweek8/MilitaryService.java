/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with the NationalService.java interface and CivilService.java class.

/**
 *
 * @author Trigg
 */
public class MilitaryService implements NationalService {
    private int daysLeft;
    
    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
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
