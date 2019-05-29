/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.newJTButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import view.ProgOdev;
import view.girisEkran;
import static view.girisEkran.puan;
import controller.TimerControl;
/**
 *
 * @author lamir
 */
public final class oyunBittimi {
    newJTButton buton1;
    int adet;
    Timer tmr;
    
    public oyunBittimi(int adet,newJTButton buton1 ) {
        this.adet = adet;
        this.buton1 = buton1;
        control();
            
    }
     void control(){
         
         
        if(buton1.isSelected()){
            buton1.setText(String.valueOf(buton1.getName()));
            
            tmr = new Timer(500,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ProgOdev.acilan == null){
                    ProgOdev.acilan = buton1;
                    
                    
                }
                else
                {
                    if(ProgOdev.acilan.getText().equals(buton1.getText()))
                    {

                        ProgOdev.acilan = null;
                         ProgOdev.durum++;
                         girisEkran.puan+=50;
                        if(ProgOdev.durum == (adet/2)){
                        //girisEkran.tc.calistir(1);
                        girisEkran.puan = girisEkran.puan*adet;
                            JOptionPane.showMessageDialog(null, "Oyun Bitti,Tebrikler");
                                
                        
                        }
                    }
                    else
                    {
                        ProgOdev.acilan.setText("");
                        ProgOdev.acilan.setSelected(false);
                        ProgOdev.acilan.setEnabled(true);

                        buton1.setText("");
                        buton1.setSelected(false);
                        buton1.setEnabled(true);
                        ProgOdev.acilan = null;
                        girisEkran.puan-=20;


                    }
                }
                tmr.stop();
            }
            
        });
            tmr.start();
            
        }
    }
}

