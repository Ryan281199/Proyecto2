/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Win10
 */
public class Panel extends JPanel {

    Ovalo ovalo;
    Rectangulo rectangulo;
    
    public Panel(Ovalo ovalo, Rectangulo rectangulo) {
        this.ovalo = ovalo;
        this.rectangulo = rectangulo;
    }
    
    public Panel() {
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        super.paint(g);
          
        g.drawOval(ovalo.getX(), ovalo.getY(), ovalo.getAltura(), ovalo.getAnchura());
        g.drawRect(rectangulo.getX(), rectangulo.getY(), rectangulo.getAltura(), rectangulo.getAnchura());
        
        
    }

}
