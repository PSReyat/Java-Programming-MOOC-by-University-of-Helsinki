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
public class Farm implements Alive{
    private String name;
    private Barn barn;
    private List<Cow> cow;
    
    public Farm(String name, Barn barn){
        this.name = name;
        this.barn = barn;
        this.cow = new ArrayList<>();
    }
    
    public String getOwner(){
        return this.name;
    }
    
    public void addCow(Cow cow){
        this.cow.add(cow);
    }
    
    public List<Cow> getCows(){
        return this.cow;
    }
    
    public String printCows(){
        String printCow = "";
        for(Cow cow : this.cow){
            printCow += cow.toString();
            
            if(this.cow.indexOf(cow) == this.cow.size() - 1){
                break;
            }
            
            printCow += "\n        ";
        }
        return printCow;
    }
    
    public void manageCows() throws Exception{
        for(Cow cow : this.cow){
            this.barn.takeCareOf(cow);
        }
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }

    @Override
    public void liveHour() {
        for(Cow cow : this.cow){
            cow.liveHour();;
        }
    }
    
    @Override
    public String toString(){
        if(getCows().size() == 0){
            return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.getBulkTank().toString()
                + "\nNo cows in the barn.";
        }else{
            return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.getBulkTank().toString()
                + "\nAnimals:" + "\n        " + printCows();
        }
    }
    
}
