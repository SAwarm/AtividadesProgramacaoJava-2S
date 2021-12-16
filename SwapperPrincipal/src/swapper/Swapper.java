/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapper;

/**
 *
 * @author Jonas Elias
 */
public class Swapper {
    
    private int x, y;

    void swap(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    void leitura(String status){
        System.out.println(status +": Valor de x: " + getX() +
                           " Valor de y: " + getY());
    }
    
}
