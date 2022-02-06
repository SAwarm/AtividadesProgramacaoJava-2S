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
public class Animal {
    
    private String speccy, color;
    
    private double weight, height, width;
    
    Animal(String speccy, String color, double weight, double heigth, double width) {
        this.speccy = speccy;
        this.color = color;
        this.weight = weight;
        this.height = heigth;
        this.width = width;
    }
    
    public String toString() {
        return "Espécie: " + this.speccy + "\n" +
               "Cor: " + this.color + "\n" +
               "Peso: " + this.weight + "\n" +
               "Altura: " + this.height + "\n" +
               "Largura: " + this.width + "\n";
    }
    
    public boolean equals(Animal animal) {
        if (this.speccy.equals(animal.speccy) &&
                this.color.equals(animal.color) &&
                this.weight == animal.weight &&
                this.height == animal.weight &&
                this.width == animal.width) {
            return true;
        }

        return false;
    }
}
