/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

/**
 *
 * @author Win10
 */
public class PadreFamiliar {
    
    String nombre;
    String apellido;
    
    public PadreFamiliar(){
    }

    public PadreFamiliar(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PadreFamiliar{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
