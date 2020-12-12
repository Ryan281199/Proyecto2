/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizzSemana13;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Pizza {
    
   Ingrediente ingrediente;
   Ingrediente ingrediente1;
   Ingrediente ingrediente2;
   double precio;
   
   public Pizza(){
   }
   
   public void llenarPizza(){
   Scanner entrada = new Scanner (System.in);
   System.out.println("Cuando ingredientes desea: ");
   int nIngre = entrada.nextInt();
   if(nIngre>2 && nIngre<4){
   for(int i=0;i<nIngre;i++){
   System.out.print("Escriba su ingrediente: ");
   }
   }
   else {
   System.out.println("Solo pueden haber entre 2 y 4 ingredientes");
   }
   }

   public float costoPizza(Ingrediente ingrediente,Ingrediente ingrediente2,Ingrediente ingrediente3){
   float resultado = 0;
   resultado = (ingrediente.getPrecio()+ingrediente2.getPrecio()+ingrediente3.getPrecio())*3;
   return resultado;
   }
   
   
    public Pizza(Ingrediente ingrediente, double precio) {
        this.ingrediente = ingrediente;
        this.precio = precio;
    }
   
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   
   
}
