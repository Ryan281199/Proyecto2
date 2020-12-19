/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class EquipoSonido {

    Parlante parlante;
    Reloj reloj;
    int maxCanciones = 1000;
    String[] listaAudios = new String[maxCanciones];
    int contAud = 0;

    public void Menu(int opcion) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero que quiere para la accion: " + "\n"
                + "1 para reproducir en orden\n"
                + "2 para reproducir en forma aleatoria\n"
                + "3 para mostrar la lista de reproduccion\n"
                + "4 para agregar un nuevo audio\n"
                + "5 para eliminar una cancion de la lista");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Reproduciendo: " + listaAudios[i]);
                }
                break;
            case 2:
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Reproduciendo: " + listaAudios[i]);
                }
                break;
            case 3:
                for (int i = 0; i < 1000; i++) {
                    if (listaAudios[i].equals(contAud) == false) {
                        System.out.println(listaAudios[i]);
                    }
                }
                break;
            case 4:
                if (contAud < maxCanciones) {
                    //listaAudios[contAud];
                    contAud++;
                }
            case 5:
                if (contAud != 0) {
                    listaAudios[contAud - 1] = null;
                    contAud--;
                }
        }
    }

    public EquipoSonido(Parlante parlante, Reloj reloj) {
        this.parlante = parlante;
        this.reloj = reloj;
    }

    public Parlante getParlante() {
        return parlante;
    }

    public void setParlante(Parlante parlante) {
        this.parlante = parlante;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

}
