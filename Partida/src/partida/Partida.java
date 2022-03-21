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
public class Partida {

    private int golsEquipeA;

    private int golsEquipeB;

    private String nomeEquipeA;

    private String nomeEquipeB;

    Partida(String nomeEquipeA, String nomeEquipeB) {
        this.nomeEquipeA = nomeEquipeA;
        this.nomeEquipeB = nomeEquipeB;
    }

    void incrementaGolsA() {
        this.golsEquipeA += 1;
    }

    void incrementaGolsB() {
        this.golsEquipeB += 1;
    }

    public String vencedor() {
        if (this.golsEquipeA > this.golsEquipeB) {
            return this.nomeEquipeA;
        } else if (this.golsEquipeA < this.golsEquipeB) {
            return this.nomeEquipeB;
        } else {
            return "empate";
        }
    }
    
    public String toString() {
        return this.nomeEquipeA + 
                " - " + 
                this.golsEquipeA +
                " x " + 
                this.nomeEquipeB +
                " - " +
                this.golsEquipeB +
                " --- vencedor: " +
                this.vencedor();
    }
}
