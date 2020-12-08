/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Win10
 */
public class Convertidor {

    Divisas divColon;
    Divisas divDolar;
    Divisas divEuro;

    public Convertidor() {
    }

    public float convertir(Divisas divisaOrigen, Divisas divisaSalida, float cantidadOrigen) {
        float resultado = 0;
        if (divisaOrigen != null && divisaSalida != null) {

            switch (divisaOrigen.getNombre()) {
                case "Colon":
                    switch (divisaSalida.getNombre()) {
                        case "Colon":
                            resultado = cantidadOrigen;
                            break;
                        case "Dolar":
                            resultado = cantidadOrigen / divDolar.getValorColon();
                            break;
                        default:
                            resultado = cantidadOrigen / divEuro.getValorColon();
                            break;
                    }
                    break;
                case "Dolar":
                    switch (divisaSalida.getNombre()) {
                        case "Colon":
                            resultado = cantidadOrigen * divDolar.getValorColon();
                            break;
                        case "Dolar":
                            resultado = cantidadOrigen;
                            break;
                        default:
                            resultado = cantidadOrigen / 1.53f;
                            break;
                    }
                    break;
                default:
                    //origen euro
                    switch (divisaSalida.getNombre()) {
                        case "Colon":
                            resultado = cantidadOrigen * 1.53f * divDolar.getValorColon();
                            break;
                        case "Dolar":
                            resultado = cantidadOrigen * 1.53f;
                            break;
                        default:
                            resultado = cantidadOrigen;
                            break;
                    }
                    break;
            }
        }
        return resultado;
    }

    public Convertidor(Divisas divColon, Divisas divDolar, Divisas divEuro) {
        this.divColon = divColon;
        this.divDolar = divDolar;
        this.divEuro = divEuro;
    }

    public Divisas getDivColon() {
        return divColon;
    }

    public void setDivColon(Divisas divColon) {
        this.divColon = divColon;
    }

    public Divisas getDivDolar() {
        return divDolar;
    }

    public void setDivDolar(Divisas divDolar) {
        this.divDolar = divDolar;
    }

    public Divisas getDivEuro() {
        return divEuro;
    }

    public void setDivEuro(Divisas divEuro) {
        this.divEuro = divEuro;
    }

}
