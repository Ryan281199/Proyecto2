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
public class Divisas {

    String nombreDivisa;
    float valorDivisa;

    public Divisas() {
    }

    public Divisas(String nombreDivisa, float valorDivisa) {
        this.nombreDivisa = nombreDivisa;
        this.valorDivisa = valorDivisa;
    }

    public String getNombreDivisa() {
        return nombreDivisa;
    }

    public void setNombreDivisa(String nombreDivisa) {
        this.nombreDivisa = nombreDivisa;
    }

    public float getValorDivisa() {
        return valorDivisa;
    }

    public void setValorDivisa(float valorDivisa) {
        this.valorDivisa = valorDivisa;
    }

}
