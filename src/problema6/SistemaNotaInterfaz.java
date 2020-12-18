/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class SistemaNotaInterfaz {

    Nota nota;
    boolean modoGrafico;

    public SistemaNotaInterfaz(boolean modoGrafico) {
        this.modoGrafico = modoGrafico;
    }

    public void agregarNotas() {
        if (modoGrafico) {
            int pT = Integer.parseInt(JOptionPane.showInputDialog("Cuantos son los puntos totales?"));
            int pO = Integer.parseInt(JOptionPane.showInputDialog("Cuantos son los puntos obtenidos?"));
            double caliF = Double.parseDouble(JOptionPane.showInputDialog("Cual es la calificacion?"));
            double pC = Double.parseDouble(JOptionPane.showInputDialog("Cual es el porcentaje?"));
        } else {
            Scanner entrada = new Scanner(System.in);
            int pT = entrada.nextInt();
            int pO = entrada.nextInt();
            double caliF = entrada.nextDouble();
            double pC = entrada.nextDouble();
        }
    }
public void mostrarNotas(){}
}
