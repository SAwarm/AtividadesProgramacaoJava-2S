/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churrasco;

/**
 *
 * @author Jonas Elias
 */
public class Churrasco {
    
    int numPeople;
    String eventDay;
    
    Churrasco(){
        this.numPeople = 0;
        this.eventDay = "";
    }
    
    int calcularTotalCarne(){
        int totalAliment = this.numPeople * 400;
        return totalAliment;
    }
    
}
