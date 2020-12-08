/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Tester {
    
    public static void main(String[]args){
    
    Scanner entrada = new Scanner(System.in);
    int [] a = new int [5];
    
    for(int i=0; i<5; i++){ 
    System.out.print("Digite el numero del espacio "+(i+1)+": ");
    a[i] = entrada.nextInt();
    }
         
    int nDeseado;
    int posIni = 0;
    int posFin = a.length-1;
    int posCen;
    
    System.out.println("Cual es el numero que desea buscar: ");
    nDeseado = entrada.nextInt();
    
    while(posIni<=posFin){
    posCen = (posIni+posFin)/2;
    if(a[posCen]==nDeseado){
    System.out.println("Numero encontrado en la posicion: "+posCen);
    break;
    }
    else if(nDeseado<a[posCen]){
    posFin = posCen-1;
    }
    else{
    posIni = posCen+1;
    }
    }
    }

}
