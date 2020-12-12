/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizzSemana13;

/**
 *
 * @author Win10
 */
public class Tester {
    
    public static void main(String [] args){
        
      Ingrediente ing = new Ingrediente("Hongos", 1, 500);
      Ingrediente ing2 = new Ingrediente("Piña", 2, 300);
      Ingrediente ing3 = new Ingrediente("Pepperoni",3, 100);
      Pizza pi = new Pizza();
      
      pi.costoPizza(ing3, ing2, ing3);
}     
}
