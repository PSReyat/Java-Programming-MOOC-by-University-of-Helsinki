/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Trigg
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    private Calculator calc;
    
    public UserInterface(Calculator calc){
        this.frame = new JFrame("Click Effect");
        this.calc = calc;
    }
    
    @Override
    public void run() {
        this.frame.setPreferredSize(new Dimension(200, 150));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    public void createComponents(Container container){
        BorderLayout bl = new BorderLayout();
        container.setLayout(bl);
        
        JLabel count = new JLabel(this.calc.giveValue());
        container.add(count, BorderLayout.CENTER);
        
        ClickListener cl = new ClickListener(this.calc, count);
        
        JButton click = new JButton("Click!");
        click.addActionListener(cl);
        container.add(click, BorderLayout.SOUTH);
    }
}
