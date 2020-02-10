/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Barn {
    private BulkTank bt;
    private MilkingRobot mr;
    
    public Barn(BulkTank tank){
        this.bt = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.bt;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.mr = milkingRobot;
        this.mr.setBulkTank(this.bt);
    }
    
    public void takeCareOf(Cow cow) throws Exception{
        if(this.mr == null){
            throw new IllegalStateException("The milking robot hasn't been installed.");
        }
        
        this.mr.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws Exception{
        if(this.mr == null){
            throw new IllegalStateException("The milking robot hasn't been installed.");
        }
        
        for(Milkable cow : cows){
            this.mr.milk(cow);
            cow.milk();
        }
        
    }
    
    @Override
    public String toString(){
        return "Barn: " + this.bt.toString();
    }
}
