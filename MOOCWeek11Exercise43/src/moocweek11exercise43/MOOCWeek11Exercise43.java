/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise43;

import game.GameOfLifeTester;
import game.PersonalBoard;
import gameoflife.Simulator;
import javax.swing.SwingUtilities;

/**
 *
 * @author Trigg
 */
public class MOOCWeek11Exercise43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonalBoard board = new PersonalBoard(10, 10);
        board.initiateRandomCells(0.5);

        Simulator ui = new Simulator(board);
        SwingUtilities.invokeLater(ui);
        
    }
}
