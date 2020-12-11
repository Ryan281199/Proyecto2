/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author Win10
 */
public class Rectangulo {
    
    int x;
    int y;
    int altura;
    int anchura;
    
    public Rectangulo(){
    }
    
    public Rectangulo(int x, int y, int altura, int anchura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.anchura = anchura;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }
    
    
}
