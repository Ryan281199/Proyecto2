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
public class Reloj {
    
 int alarma;
 int hora;
 int minutos;

    public Reloj(int alarma, int hora, int minutos) {
        this.alarma = alarma;
        this.hora = hora;
        this.minutos = minutos;
    }

    public void definirHora(int hora,int minutos){
        
    }
    
    public int getAlarma() {
        return alarma;
    }

    public void setAlarma(int alarma) {
        this.alarma = alarma;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
 
 
    
    
}
