/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Win10
 */
public class ventana extends JFrame {
    
    
  private JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));
  
 
  // Creamos dos paneles para nuestra interfaz
  private JPanel panelIzquierda = new JPanel();
  private Panel panelCentral = new Panel();
  
  // Declaramos e incializamos el boton
  private JButton abrirBoton = new JButton("Abrir");
  private JButton salirBoton = new JButton("Salir");
  
  
  // Declaramos una referencia al objeto que pueda ser accesada desde las clases privadas
  private ventana este = this;
  
  public ventana(String titulo){
    // Llama al constructor del padre
    super(titulo);
    
    // Asignamos un BorderLayout
    this.setLayout(new BorderLayout());
    
    // Asignamos un GridLayout
    panelIzquierda.setLayout(new GridLayout(2,1));
    
    //Asigna los manejadores de eventos
    abrirBoton.addActionListener(new EscuchadorDeEventos());
    salirBoton.addActionListener(new EscuchadorDeEventos());
    
    // Agrega los componentes
    panelIzquierda.add(abrirBoton);
    panelIzquierda.add(salirBoton);
    
    
    // Agrega los componentes a MiVentana
    this.add(panelIzquierda, BorderLayout.WEST);
    this.add(panelCentral, BorderLayout.CENTER);

    
    // Indica la acción que se debe realizar cuando se cierra la ventana por medio del método del padre
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Asigna el tamaño de la ventana por medio del método del padre
    this.setSize(800,600);
    
    // Indica que la ventana debe verse en pantalla por medio del método del padre
    this.setVisible(true);
    
  }
  
  /**
   * Escucha los eventos del componente que lo anada 
   */
  private class EscuchadorDeEventos implements ActionListener{
    public void actionPerformed(ActionEvent evento){
      if (evento.getSource() == abrirBoton){
        JOptionPane.showMessageDialog(este,
                                          "No hace nada", 
                                          "PanelDibujo", 
                                          JOptionPane.ERROR_MESSAGE);
         
      } else if (evento.getSource() == salirBoton){
        este.setVisible(false);
      }
    }
    }
}
