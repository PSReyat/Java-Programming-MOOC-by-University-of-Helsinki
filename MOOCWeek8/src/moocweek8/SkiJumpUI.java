/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class SkiJumpUI {
    private Scanner reader;
    private Skiers skier;
    private SkiJump sj;
    private Judges judge;
    
    public SkiJumpUI(){
        this.reader = new Scanner(System.in);
        this.skier = new Skiers();
        this.sj = new SkiJump();
        this.judge = new Judges();
    }
    
    public void start(){
  
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        String enter = "";

        skierNames(enter);

        System.out.println("\nThe tournament begins!\n");

        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: \n");
            enter = this.reader.nextLine();
            jumpingPhase(enter);
            
            if(enter.equals("quit") || enter.equals("q")){
                break;
        }
    }
        
    }
    
    public void skierNames(String enter){
        while(true){
            System.out.print("  Participant name: ");
            enter = this.reader.nextLine();
            
            if(enter.isEmpty()){
                break;
            }
            
            this.skier.addNames(enter);
        }
    }
  
    public void jumpingPhase(String enter) {
        if (enter.equals("jump") || enter.equals("j")) {
            int round = this.sj.getRound();
            System.out.println("Round " + round + "\n");
            System.out.println("Jumping order:");
            int i = 1;
            for (String names : this.skier.getNames()) {
                System.out.println("  " + i + ". " + names + " (" + this.skier.getTotalLength(names));
                i++;
            }

            System.out.println("Results of round " + round);
        }
    }
}
