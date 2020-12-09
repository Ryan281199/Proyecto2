/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Tester {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Divisas mColon = new Divisas("Colon", 1);
        Divisas moneda1 = new Divisas();
        Divisas moneda2 = new Divisas();

        System.out.println("Escriba cual sera la primer moneda: ");
        String nombreMoneda1 = entrada.next();
        moneda1.setNombreDivisa(nombreMoneda1);
        System.out.println("Escriba el valor de la primer moneda con respecto al colon: ");
        float valorMoneda1 = entrada.nextFloat();
        moneda1.setValorDivisa(valorMoneda1);

        System.out.println("Escriba cual sera la segunda moneda: ");
        String nombreMoneda2 = entrada.next();
        moneda2.setNombreDivisa(nombreMoneda2);
        System.out.println("Escriba el valor de la segunda moneda con respecto al colon: ");
        float valorMoneda2 = entrada.nextFloat();
        moneda2.setValorDivisa(valorMoneda2);

        System.out.println("Digite la moneda que quiere convertir: " + "\n"
                + "1: Colon\n"
                + "2: " + moneda1.getNombreDivisa() + "\n"
                + "3: " + moneda2.getNombreDivisa());
        int monedaOrigen = entrada.nextInt();

        System.out.println("Digite la moneda a la cual quiere convertir: " + "\n"
                + "1: Colon\n"
                + "2: " + moneda1.getNombreDivisa() + "\n"
                + "3: " + moneda2.getNombreDivisa());
        int monedaSalida = entrada.nextInt();

        System.out.println("Escriba la cantidad que desea convertir: ");
        float cantidad = entrada.nextFloat();

        Convertidor conver = new Convertidor(mColon, moneda1, moneda2);

        switch (monedaOrigen) {
            case 1:
                switch (monedaSalida) {
                    case 1:
                        System.out.println("El valor es: " + conver.convertir(mColon, mColon, cantidad));
                        break;
                    case 2:
                        System.out.println("El valor es: " + conver.convertir(mColon, moneda1, cantidad));
                        break;
                    default:
                        System.out.println("El valor es: " + conver.convertir(mColon, moneda2, cantidad));
                        break;
                }
                break;
            case 2:
                switch (monedaSalida) {
                    case 1:
                        System.out.println("El valor es: " + conver.convertir(moneda1, mColon, cantidad));
                        break;
                    case 2:
                        System.out.println("El valor es: " + conver.convertir(moneda1, moneda1, cantidad));
                        break;
                    default:
                        System.out.println("El valor es: " + conver.convertir(moneda1, moneda2, cantidad));
                        break;
                }
                break;
            default:
                switch (monedaSalida) {
                    case 1:
                        System.out.println("El valor es: " + conver.convertir(moneda2, mColon, cantidad));
                        break;
                    case 2:
                        System.out.println("El valor es: " + conver.convertir(moneda2, moneda1, cantidad));
                        break;
                    default:
                        System.out.println("El valor es: " + conver.convertir(moneda2, moneda2, cantidad));
                        break;
                }
                break;
        }
    }
}
