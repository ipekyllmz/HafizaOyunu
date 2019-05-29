/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import controller.kutuUretici;
import model.jTButtonEvent;
import view.ProgOdev;


import view.girisEkran;

public final class kutuUretici {
    public static int kuAdet;
    String layout;
    JPanel jPanel1;
    int sayii;

    public kutuUretici(int kuAdet, String layout, JPanel jPanel1) {
        this.kuAdet = kuAdet;
        this.layout = layout;
        this.jPanel1 = jPanel1;
        this.sayii = sayii;
        kutuOlustur();
    }
     int hesapla(int kuAdet){
        int bolen;
        int bolum = 100;
        int a = 2;
        int b = 2;
        
        for(bolen = 2; bolen<bolum;){
            bolum = kuAdet / bolen;
            b = a;
            a= bolen;
            bolen *=bolen;
        }
        
      
        if (kuAdet % a != 0) {
            bolum = kuAdet / b;
        }
        
       
        return bolum;
    }
    
    ArrayList dizi = new ArrayList();
    
    private void DiziOlustur(){
        for(int i = 0;i<kuAdet/2;i++){
            for(int k = 0;k<2;k++){
                dizi.add(i);
            }
            
        }
    }
    
    private void DiziKaristir(){
        for(int i = 0;i<100;i++){
            int sayi = (int)(Math.random() * (kuAdet-1));
            int sayi2 = (int)(Math.random() * (kuAdet-1));
            Object a = dizi.get(sayi);
            dizi.set(sayi, dizi.get(sayi2));
            dizi.set(sayi2, a);
        }
    }
    
    
    
    void kutuOlustur(){
        
        
        jPanel1.removeAll();
        jPanel1.repaint();
        if (kuAdet > 0) {
            if (kuAdet % 2 == 1) 
                kuAdet++;
        }
        
        int bolum = hesapla(kuAdet);
        jPanel1.setLayout(new GridLayout((kuAdet/bolum),bolum));
        
        if(layout.equals("GridLayout"))
        {
            bolum = hesapla(kuAdet);
            jPanel1.setLayout(new GridLayout((kuAdet/bolum),bolum));
        }
        else if(layout.equals("FlowLayout"))
        {
            jPanel1.setLayout(new FlowLayout());
        }
        
        DiziOlustur();
        DiziKaristir();
        
        for (int i = 0; i < kuAdet; i++) {
           newJTButton buton1 = new newJTButton(new jTButtonEvent(kuAdet), String.valueOf(dizi.get(i)));
            
           jPanel1.add(buton1);
           buton1.setText(String.valueOf(dizi.get(i)));

           ;
        }
        
        
        jPanel1.validate();
        ProgOdev.acilan = null;
        ProgOdev.durum = 0;
    }
}

    
