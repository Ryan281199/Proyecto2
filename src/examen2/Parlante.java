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
public class Parlante {
    
int volumen;
String musica;

    public Parlante(int volumen, String musica) {
        this.volumen = volumen;
        this.musica = musica;
    }

    public void Sonar(String nomCancion){
    System.out.println("Sonando la cancion:"+nomCancion);
    }
    
    public void ajustarVolumen(int volumen){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite el volumen deseado");
    int vol = entrada.nextInt(volumen);
    if(vol<1 && vol>10){
    System.out.println("El volumen solo puede estar entre 1 y 10");
    }
    }
    
    public void habilitarParlante(int res){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Desea usar el parlante?"+"\n"
    +"1 para si\n"
    +"2 para no");
    res = entrada.nextInt();
    if(res==1){
    System.out.println("El parlante esta en uso");
    }
    else{
    System.out.println("El parlante no esta en uso");
    }
    }
    
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }


    
}
