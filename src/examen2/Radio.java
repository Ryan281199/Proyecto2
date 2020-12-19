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
public class Radio {
    
String emisora = "Sabor 2.0";

    public Radio(String emisora) {
        this.emisora = emisora;
    }

    public void Encender(){
    boolean encendido=true;
    if(encendido){
    System.out.println("La radio esta encendida");
    } 
    else{
    System.out.println("La radio esta apagada");
    }
    }
    
    public String getEmisora() {
        return emisora;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }


}
