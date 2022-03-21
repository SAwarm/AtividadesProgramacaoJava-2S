/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compromisso;

import relogio.Relogio;

/**
 *
 * @author Jonas Elias
 */
public class Compromisso {

    private String descricao;

    private Relogio relogio;

    public Compromisso(String descricao, Relogio relogio) {
        this.descricao = descricao;

        this.relogio = relogio;
    }

    public boolean equals(Object compromisso) {
        if (this == compromisso) {
            return true;
        }

        return false;
    }
}
