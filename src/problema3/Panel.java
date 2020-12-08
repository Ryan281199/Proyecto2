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

    public Panel() {
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawLine(25,90,60,50);
        
        // STRINGS
        Font fuente = new Font("Arial", Font.BOLD, 15);
        g.setColor(Color.blue);
        g.setFont(fuente);
        g.drawString("Hola mundo!", 5, 360);
        
        // ARCOS
        g.setColor(Color.yellow);
        g.fillArc(240, 340, 100, 100, 25, 300);
        g.setColor(Color.white);
        g.fillArc(240, 340, 100, 100, 15, 10);
        g.fillArc(240, 340, 100, 100, 325, 10);

        // POLIGONOS
        Polygon estrella = new Polygon();
        // Este no es estrella
        int cX[] = {420,440,460,480,500,420,420}; // Coordenada x de los puntos del polígono
        int cY[] = {470,430,450,430,490,490,470}; // Coordenada y de los puntos del polígono
        

        estrella.addPoint(510,355);
        estrella.addPoint(590,355);
        estrella.addPoint(525,415);
        estrella.addPoint(550,330);
        estrella.addPoint(580,415);

        g.setColor(Color.red);
        g.drawPolygon(estrella);
        g.setColor(Color.blue);
        g.fillPolygon(cX,cY,cX.length);
    }

}
