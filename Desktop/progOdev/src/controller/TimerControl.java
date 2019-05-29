package controller;

import controller.newJTButton;
import java.awt.Color;
import java.awt.Component;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.girisEkran;
import view.ProgOdev;
import controller.kutuUretici;


public class TimerControl {
private JLabel jl3,jl4,jl5,jl8;
private int durdur;
 public TimerControl(JLabel jl3,JLabel jl4,JLabel jl5,JLabel jl8, int durdur){
this.jl3=jl3;
this.jl4=jl4;
this.jl5=jl5;
this.jl8=jl8;
this.durdur=durdur;
 }
 
       int sayac=1;

       public void calistir(int dur, JPanel jPanel1) {
          for(int i = 0;i<jPanel1.getComponentCount();i++){
            newJTButton tb = (newJTButton)jPanel1.getComponent(i);
            tb.setSelected(false);
            tb.setEnabled(true);
            tb.setText("");
        }
           
             Timer myTimer=new Timer();
             TimerTask gorev =new TimerTask() {
                    @Override
                    public void run() {
                        
                           if(sayac<=59){
                               if(sayac<10){
                               jl3.setText("0"+Integer.toString(sayac));
                               }else{
                               jl3.setText(Integer.toString(sayac));
                               }
                          }else{
                           sayac=0;
                           jl3.setText("00");
                           if(Integer.parseInt(jl4.getText())<10){
                           jl4.setText("0"+Integer.toString(Integer.parseInt(jl4.getText())+1));
                           }else{
                           jl4.setText(Integer.toString(Integer.parseInt(jl4.getText())+1));
                           }
                           if(Integer.parseInt(jl4.getText())>59){
                           jl4.setText("00");
                           if(Integer.parseInt(jl5.getText())<10){
                           jl5.setText("0"+Integer.toString(Integer.parseInt(jl5.getText())+1));
                           }else{
                           jl5.setText(Integer.toString(Integer.parseInt(jl5.getText())+1));
                           }
                           }
                           }
                           sayac++;
                           jl8.setText(Integer.toString(girisEkran.puan));
                           if(girisEkran.puan==3){
                           myTimer.cancel();
                           
                           }
                           else if(ProgOdev.durum==kutuUretici.kuAdet/2){
                               myTimer.cancel();
                           }
                           

                    }
             };
 
             myTimer.schedule(gorev,0,1000);
       }
}