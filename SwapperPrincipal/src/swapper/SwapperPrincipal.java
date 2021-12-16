/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapper;

import java.util.Scanner;

/**
 *
 * @author Jonas Elias
 */
public class SwapperPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Swapper swpp = new Swapper();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de x: ");
        swpp.setX(leitor.nextInt());
        
        System.out.println("Digite o valor de y: ");
        swpp.setY(leitor.nextInt());
        
        swpp.leitura("Recebendo y e x");
        
        swpp.swap(0 , 0);
        
        swpp.leitura("Trocando valores void swapp");
        
    }
    
}
