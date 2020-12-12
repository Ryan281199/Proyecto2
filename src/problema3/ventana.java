/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ventana extends JFrame {

    private JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));

    private JPanel panelIzquierda = new JPanel();
    private Panel panelCentral = new Panel();

    private JButton abrirBoton = new JButton("Abrir");
    private JButton salirBoton = new JButton("Salir");

    private ventana este = this;

    public ventana(String titulo) {

        super(titulo);

        this.setLayout(new BorderLayout());

        panelIzquierda.setLayout(new GridLayout(2, 1));

        abrirBoton.addActionListener(new EscuchadorDeEventos());
        salirBoton.addActionListener(new EscuchadorDeEventos());

        panelIzquierda.add(abrirBoton);
        panelIzquierda.add(salirBoton);

        this.add(panelIzquierda, BorderLayout.WEST);
        this.add(panelCentral, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800, 600);

        this.setVisible(true);

    }

    private class EscuchadorDeEventos implements ActionListener {

        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == abrirBoton) {
                JOptionPane.showMessageDialog(este,
                        "No hace nada",
                        "PanelDibujo",
                        JOptionPane.ERROR_MESSAGE);

            } else if (evento.getSource() == salirBoton) {
                este.setVisible(false);
            }
        }
    }

}
