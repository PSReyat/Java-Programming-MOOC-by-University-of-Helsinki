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
public class Cow implements Milkable, Alive{
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    private double udderCapacity;
    private double udderVolume;
    
    public Cow(){
        this.name = this.NAMES[new Random().nextInt(30) + 0];
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.udderVolume = 0;
    }
    
    public Cow(String name){
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.udderVolume = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return this.udderVolume;
    }
    
    @Override
    public String toString(){
        return getName() + " " + this.udderVolume + "/" + getCapacity();
    }

    @Override
    public double milk() {
        double milked = getAmount();
        this.udderVolume = 0;
        return milked;
    }

    @Override
    public void liveHour() {
        double addMilk = new Random().nextDouble() * 1.3 + 0.7;
        addMilk = Math.ceil(addMilk);
        this.udderVolume += addMilk;
    }
}
