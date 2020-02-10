/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Trigg
 */
public class MilkingRobot {
    private BulkTank bt;
    
    public MilkingRobot(){}
    
    public BulkTank getBulkTank(){
        if(this.bt == null){
            return null;
        }
        return this.bt;
    }
    
    public void setBulkTank(BulkTank tank){
        this.bt = new BulkTank();
        this.bt = tank;
    }
    
    public void milk(Milkable milkable) throws Exception{
        if(getBulkTank() == null){
            throw new IllegalArgumentException("The milking robot hasn't been installed.");
        }
        
        getBulkTank().addToTank(milkable.milk());
    }
}
