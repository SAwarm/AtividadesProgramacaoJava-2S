/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

/**
 *
 * @author Jonas Elias
 */
public class MethodToString {
    
    public String toString(Movie mov) {
        return "Filme: " + mov.getNameMovie() + "\n" + 
                "Gênero: " + mov.getGender() + "\n" +
                "Ano Lançamento: " + mov.getYearLaunch()+ "\n" +
                "Duração: " + mov.getDuration();
    }
}
