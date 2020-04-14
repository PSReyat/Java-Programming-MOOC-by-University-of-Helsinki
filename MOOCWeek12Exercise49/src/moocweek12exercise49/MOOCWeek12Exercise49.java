/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek12exercise49;

import wormgame.domain.Direction;
import wormgame.domain.Worm;
import java.util.*;
import javax.swing.SwingUtilities;
import wormgame.game.WormGame;
import wormgame.gui.UserInterface;

/**
 *
 * @author Trigg
 */
public class MOOCWeek12Exercise49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WormGame game = new WormGame(20, 20);

        UserInterface ui = new UserInterface(game, 20);
        SwingUtilities.invokeLater(ui);

        while (ui.getUpdatable() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("The drawing board hasn't been created yet.");
            }
        }

        game.setUpdatable(ui.getUpdatable());
        game.start();
        
    }
    
}
