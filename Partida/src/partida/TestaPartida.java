/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partida;

/**
 *
 * @author Jonas Elias
 */
public class TestaPartida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partida partida = new Partida("Ponte Preta", "Palmeiras");
        
        partida.incrementaGolsA();
        partida.incrementaGolsA();
        
        System.out.println(partida.toString());
    }
    
}
