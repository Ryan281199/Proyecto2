/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Win10
 */
public class Convertidor {
    
    Divisas divColon;
    Divisas divisa1;
    Divisas divisa2;
    
    public Convertidor(){
    }

    public Convertidor(Divisas divColon, Divisas divisa1, Divisas divisa2) {
        this.divColon = divColon;
        this.divisa1 = divisa1;
        this.divisa2 = divisa2;
    }

    public Convertidor(Divisas divisa1, Divisas divisa2) {
        this.divisa1 = divisa1;
        this.divisa2 = divisa2;
    }

    public float convertir (Divisas divOri, Divisas divSal, float cant){
    float resultado = 0;
    if (divOri != null && divSal != null) {
    
    
    
    
    
    
    
    }
    return resultado;
    }
    
    public Divisas getDivColon() {
        return divColon;
    }

    public void setDivColon(Divisas divColon) {
        this.divColon = divColon;
    }

    public Divisas getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(Divisas divisa1) {
        this.divisa1 = divisa1;
    }

    public Divisas getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(Divisas divisa2) {
        this.divisa2 = divisa2;
    }
            
   
    
    
    
    
    
    
    
    
}
