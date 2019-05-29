
package model;

import controller.kutuUretici;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import view.girisEkran;

public class kutuUretEvent implements MouseListener {
    int kuAdet;
    String layout;
    JPanel jPanel1;

    @Override
    public void mouseClicked(MouseEvent e) {
        kuAdet = Integer.valueOf(girisEkran.jText.getText());
        layout =girisEkran.jCombo.getSelectedItem().toString();
        jPanel1 = girisEkran.jpanel;
         kutuUretici ku = new kutuUretici(kuAdet,layout,jPanel1);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }
}
