/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import wormgame.game.WormGame;

/**
 *
 * @author Trigg
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    private WormGame game;
    private int pieceLength;
    private DrawingBoard db;
    
    public UserInterface(WormGame game, int pieceLength){
        this.frame = new JFrame("Snake Game");
        this.game = game;
    }
    
    @Override
    public void run() {
        this.frame.setPreferredSize(new Dimension(400, 400));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        
        this.frame.setVisible(true);
    }
    
    public void createComponents(Container container){
        this.db = new DrawingBoard(this.game, this.game.getWorm().getLength());
        container.add(db);
        KeyboardListener kl = new KeyboardListener(this.game.getWorm());
        this.frame.addKeyListener(kl);
    }
    
    public Updatable getUpdatable(){
        return this.db;
    }
    
}
