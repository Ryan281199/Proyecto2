/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Win10
 */
public class ListaReproduccion {

    int maxCanciones = 1000;
    String[] listaAudios = new String[maxCanciones];
    int contAud = 0;

    public ListaReproduccion() {
    }

    public boolean agregarAudio() {
        boolean resultado = false;
        if (contAud < maxCanciones) {
            //listaAudios[contAud];
            contAud++;
            resultado = true;
        }
        return resultado;
    }

    public void mostrarLista() {
        for (int i = 0; i < 1000; i++) {
            if (listaAudios[i].equals(contAud) == false) {
                System.out.println(listaAudios[i]);
            }
        }
    }

    public void reproducirOrden() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Reproduciendo: " + listaAudios[i]);
        }
    }

    public boolean eliminarAudio() {
        boolean resultado = false;
        if (contAud != 0) {
            listaAudios[contAud - 1] = null;
            contAud--;
            resultado = true;
        }
        return resultado;
    }

}
