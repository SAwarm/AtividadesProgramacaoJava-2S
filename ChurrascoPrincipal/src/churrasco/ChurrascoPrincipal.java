/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churrasco;
import java.util.Scanner;

/**
 *
 * @author Jonas Elias
 */
public class ChurrascoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Churrasco churras = new Churrasco();
        
        System.out.println("Digite o número de pessoas no evento");
        churras.numPeople = leitor.nextInt(); /* poderia tanto fazer assim quanto atribuindo valores no método calcularTotalCarne */
        
        System.out.println("Digite nome do evento");
        churras.eventDay = leitor.next();
        
        System.out.println("O total em gramas de carne necessária para o evento "+
                churras.eventDay + " é igual a: "+churras.calcularTotalCarne());
    }
    
}
