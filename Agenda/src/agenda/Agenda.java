/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import compromisso.Compromisso;
import java.util.ArrayList;

/**
 *
 * @author Jonas Elias
 */
public class Agenda {

    private ArrayList<Compromisso> listaDeCompromissos = new ArrayList<Compromisso>();

    Agenda() {
    }

    void adicionaCompromisso(Compromisso comp) {
        if (this.buscaCompromisso(comp) == -1) {
            this.listaDeCompromissos.add(comp);
        }
    }

    void imprimeCompromissos() {
        for (int i = 0; i < this.listaDeCompromissos.size(); i++) {
            System.out.println(this.listaDeCompromissos.get(i));
        }
    }

    int buscaCompromisso(Compromisso comp) {
        for (int i = 0; i < this.listaDeCompromissos.size(); i++) {
            if (this.listaDeCompromissos.get(i) == comp) {
                return i;
            }
        }

        return -1;
    }
}
