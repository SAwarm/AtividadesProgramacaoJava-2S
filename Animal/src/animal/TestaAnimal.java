/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Jonas Elias
 */
public class TestaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animalOne = new Animal("mamífero", "azul", 10, 10, 10);
        Animal animalTwo = new Animal("mamífero", "azul", 10, 10, 10);
        
        TestaAnimal testAnimal = new TestaAnimal();
        testAnimal.msgVerifyAnimals(animalOne, animalTwo);
        
        Animal animalThree = new Animal("mamífero", "azul", 10, 10, 10);
        Animal animalFour = new Animal("mamdífero", "azul", 10, 10, 10);
        
        testAnimal.msgVerifyAnimals(animalThree, animalFour);
        
        System.out.println("\n");
        
        System.out.println(animalOne.toString());
        System.out.println(animalTwo.toString());
        System.out.println(animalThree.toString());
        System.out.println(animalFour.toString());
    }
    
    void msgVerifyAnimals(Animal animalOne, Animal animalTwo) {
        if (animalOne.equals(animalTwo)) {
            System.out.println("Objetos iguais");
        } else {
            System.out.println("Objetos diferentes");
        }
    }
}
