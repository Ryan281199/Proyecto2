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
public class Ovalo {
    
    int anchura;
    int altura;
    int x;
    int y;
    
    public Ovalo(){
    }

    public Ovalo(int anchura, int altura, int x, int y) {
        this.anchura = anchura;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
    
    
}
