/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author Trigg
 */
public class MessageListener implements ActionListener{
    private JTextArea top;
    private JTextArea bottom;
    
    public MessageListener(JTextArea top, JTextArea bottom){
        this.top = top;
        this.bottom = bottom;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.bottom.setText(this.top.getText());
        this.top.setText("");
    }
    
}
