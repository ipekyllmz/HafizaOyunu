/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.newJTButton;
import controller.oyunBittimi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lamir
 */
public class jTButtonEvent implements ActionListener {
    int kuAdet;

    public jTButtonEvent(int kuAdet) {
        this.kuAdet = kuAdet;
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
         newJTButton buton1 = (newJTButton) e.getSource();
        oyunBittimi oyn = new oyunBittimi(kuAdet,buton1);
       
    }
    
}
