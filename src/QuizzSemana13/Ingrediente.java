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
public class Ingrediente {
    
    String nombreIngrediente;
    int codigo;
    int precio;
    
    public Ingrediente(){
    }

    public Ingrediente(String nombreIngrediente, int codigo, int precio) {
        this.nombreIngrediente = nombreIngrediente;
        this.codigo = codigo;
        this.precio = precio;
    }
    
    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
