/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Tester {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Divisas dColon = new Divisas("Colon", 1);
        Divisas dDolar = new Divisas("Dolar", 500);
        Divisas dEuro = new Divisas("Euro", 765);

        Convertidor conve = new Convertidor(dColon, dDolar, dEuro);

        System.out.println("Digite la moneda que quiere convertir: " + "\n"
                + "1: Colon\n"
                + "2: Dolar\n"
                + "3: Euro");
        int dOrigen = entrada.nextInt();

        System.out.println("Digite la moneda a la cual quiere convertir: " + "\n"
                + "1: Colon\n"
                + "2: Dolar\n"
                + "3: Euro");
        int dSalida = entrada.nextInt();

        System.out.println("Digite la cantidad que tiene: ");
        float cant = entrada.nextFloat();

        //Corregir conversion de dolares a euro
        //para convertir de euro a colon, primero hacer conversion de euro a dolar y despues de dolar a colon
        //para convertir de dolar a euro seria dividir la cantidad de dolares que tengo entre 1.53
        switch (dOrigen) {
            case 1:
                switch (dSalida) {
                    case 1:
                        System.out.println("El valor es: " + conve.convertir(dColon, dColon, cant));
                        break;
                    case 2:
                        System.out.println("El valor es: " + conve.convertir(dColon, dDolar, cant));
                        break;
                    default:
                        System.out.println("El valor es: " + conve.convertir(dColon, dEuro, cant));
                        break;
                }
                break;
            case 2:
                switch (dSalida) {
                    case 1:
                        System.out.println("El valor es: " + conve.convertir(dDolar, dColon, cant));
                        break;
                    case 2:
                        System.out.println("El valor es: " + conve.convertir(dDolar, dDolar, cant));
                        break;
                    default:
                        System.out.println("El valor es: " + conve.convertir(dDolar, dEuro, cant));
                        break;
                }
                break;
            default:
                switch (dSalida) {
                    case 1:
                        System.out.println("El valor es: " + conve.convertir(dEuro, dColon, cant));
                        break;
                    case 2:
                        System.out.println("El valor es: " + conve.convertir(dEuro, dDolar, cant));
                        break;
                    default:
                        System.out.println("El valor es: " + conve.convertir(dEuro, dDolar, cant));
                        break;
                }
                break;
        }

    }
    
}
