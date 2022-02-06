/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

import java.util.Scanner;

/**
 *
 * @author Jonas Elias
 */
public class TestMovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie mov = new Movie();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do filme");
        mov.setNameMovie(scanner.nextLine());
        
        System.out.println("Digite o gênero do filme");
        mov.setGender(scanner.nextLine());
        
        System.out.println("Digite o nome do diretor");
        mov.setDirector(scanner.nextLine());
        
        System.out.println("Digite o ano de lançamento do filme");
        mov.setYearLaunch(scanner.nextInt());
        
        System.out.println("Digite a duração (minutos)");
        mov.setDuration(scanner.nextDouble());
        
        System.out.println(mov.toString(mov)); //* RESULTADO DAS INSERÇÕES
    }
    
}
