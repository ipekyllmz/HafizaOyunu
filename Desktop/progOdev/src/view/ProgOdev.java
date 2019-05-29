/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.newJTButton;
import view.girisEkran;

/**
 *
 * @author lamir
 */
public class ProgOdev {

    /**
     * @param args the command line arguments
     */
    public static newJTButton acilan = null;
    public static int durum = 0;
    
    public static void main(String[] args) {
        girisEkran syfEkrani = new girisEkran();
        syfEkrani.setVisible(true);
    }
    
}
