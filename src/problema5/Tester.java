/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Tester {

    
    public static void main(String[] args) {

        int nElementos, aux;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la cantidad de numeros que quiere en el primer arreglo: ");
        nElementos = entrada.nextInt();
        int[] a = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite el numero en la posicion " + (i + 1) + ": ");
            a[i] = entrada.nextInt();
        }

        boolean ordenado = true;
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length) {
                if (a[i] > a[i + 1]) {
                    ordenado = false;
                    break;
                }
            }
        }

        if (ordenado) {
            System.out.println("La lista está ordenada");
        } else {
            System.out.println("La lista está desordenada");
            //metodo burbuja para acomodar un arreglo en forma creciente
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        aux = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = aux;
                    }
                }
            }
            System.out.println("El arreglo ordenado es: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.print("Digite la cantidad de numeros que quiere en el segundo arreglo: ");
        nElementos = entrada.nextInt();
        int[] b = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print("Digite el numero en la posicion " + (i + 1) + ": ");
            b[i] = entrada.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            if (i + 1 < b.length) {
                if (b[i] > b[i + 1]) {
                    ordenado = false;
                    break;
                }
            }
        }

        if (ordenado) {
            System.out.println("La lista está ordenada");
        } else {
            System.out.println("La lista está desordenada");
            //metodo burbuja para acomodar un arreglo en forma creciente
            for (int i = 0; i < b.length - 1; i++) {
                for (int j = 0; j < b.length - 1; j++) {
                    if (b[j] > b[j + 1]) {
                        aux = b[j];
                        b[j] = b[j + 1];
                        b[j + 1] = aux;
                    }
                }
            }
            System.out.println("El arreglo ordenado es: ");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }

        int[] c = new int[(b.length + a.length)];

        int pos = 0;
        int z = 0;
        while (pos < a.length + b.length) {
            if (z < a.length) {
                c[pos] = a[z];
                pos++;
            }
            if (z < b.length) {
                c[pos] = b[z];
                pos++;
            }
            z++;
        }
        /*
    int j=0;
    for(int i=0;i<(c.length)/2;i++){  //esto hay que cambiarlo
    c[j] = a[i];
    j++;
    c[j] = b[i];
    j++;
    }
         */
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
