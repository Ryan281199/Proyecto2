/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        this.setBackground(Color.GREEN);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Ovalo ov = new Ovalo((int) (Math.random() * 500), (int) (Math.random() * 500), (int) (Math.random() * 500), (int) (Math.random() * 500));
        Rectangulo rec = new Rectangulo((int) (Math.random() * 500), (int) (Math.random() * 500), (int) (Math.random() * 500), (int) (Math.random() * 500));

        g.drawLine(25, 90, 60, 50);

        for (int i = 0; i < 5; i++) {
            g.drawOval(ov.getX(), ov.getY(), ov.getAnchura(), ov.getAltura());
            g.drawRect(rec.getX(), rec.getY(), rec.getAnchura(), rec.getAltura());
        }

        Font fuente = new Font("Arial", Font.BOLD, 15);
        g.setColor(Color.blue);
        g.setFont(fuente);
        g.drawString("Hola mundo!", 5, 360);

        g.setColor(Color.yellow);
        g.fillArc(240, 340, 100, 100, 25, 300);
        g.setColor(Color.white);
        g.fillArc(240, 340, 100, 100, 15, 10);
        g.fillArc(240, 340, 100, 100, 325, 10);

        Polygon estrella = new Polygon();

        int cX[] = {420, 440, 460, 480, 500, 420, 420};
        int cY[] = {470, 430, 450, 430, 490, 490, 470};

        estrella.addPoint(510, 355);
        estrella.addPoint(590, 355);
        estrella.addPoint(525, 415);
        estrella.addPoint(550, 330);
        estrella.addPoint(580, 415);

        g.setColor(Color.red);
        g.drawPolygon(estrella);
        g.setColor(Color.blue);
        g.fillPolygon(cX, cY, cX.length);

    }

}
