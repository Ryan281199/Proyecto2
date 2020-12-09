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

    public Convertidor() {
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

    public float convertir(Divisas divOri, Divisas divSal, float cant) {
        float resultado = 0;
        if (divOri != null && divSal != null) {
            if (divOri.getNombreDivisa().equals("Colon")) {
                if (divSal.getNombreDivisa().equals("Colon")) {
                    resultado = cant;
                } else if (divSal.getNombreDivisa().equals(divisa1.getNombreDivisa())) {
                    resultado = cant / 500 * divisa1.getValorDivisa();
                } else {
                    resultado = cant / 500 * divisa2.getValorDivisa();
                }
            } else if (divOri.getNombreDivisa().equals(divisa1.getNombreDivisa())) {
                if (divSal.getNombreDivisa().equals("Colon")) {
                    resultado = cant * 500 / divisa1.getValorDivisa();
                } else if (divSal.getNombreDivisa().equals(divisa1.getNombreDivisa())) {
                    resultado = cant;
                } else {
                    resultado = (cant * 500 / divisa1.getValorDivisa()) / 500 * divisa2.getValorDivisa();
                }
            } else {
                if (divSal.getNombreDivisa().equals("Colon")) {
                    resultado = cant * 500 / divisa2.getValorDivisa();
                } else if (divSal.getNombreDivisa().equals(divisa2.getNombreDivisa())) {
                    resultado = cant;
                } else {
                    resultado = (cant * 500 / divisa2.getValorDivisa()) / 500 * divisa1.getValorDivisa();
                }
            }
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
