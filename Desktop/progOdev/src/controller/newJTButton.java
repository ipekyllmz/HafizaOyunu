/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

/**
 *
 * @author lamir
 */
public class newJTButton extends JToggleButton {

    ActionListener aL;
    String yazi;

    public newJTButton(ActionListener aL, String yazi) {
        this.aL = aL;
        this.yazi = yazi;
        
        this.addActionListener(aL);
        this.setName(yazi);
        
        this.setPreferredSize(new Dimension(75,75));
    }

    public newJTButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setText(int sayii) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
