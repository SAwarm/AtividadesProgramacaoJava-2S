/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import compromisso.Compromisso;
import relogio.Relogio;

/**
 *
 * @author Jonas Elias
 */
public class TestaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * TESTE INSERÇÃO, IMPRESSÃO E BUSCA DE COMPROMISSOS
         */
        Agenda agenda = new Agenda();
        Relogio relogio = new Relogio(22, 30, 20);
        Compromisso comp = new Compromisso("Festa de aniversário", relogio);
        agenda.adicionaCompromisso(comp);
        agenda.imprimeCompromissos();
        System.out.println("Índice: " + agenda.buscaCompromisso(comp));

        /**
         * TESTE DA VALIDAÇÃO DE COMPROMISSO (COMPROMISSO IGUAL AO ANTERIOR)
         */
        System.out.println("\n");
        agenda.adicionaCompromisso(comp);
        agenda.imprimeCompromissos();
        System.out.println("Índice: " + agenda.buscaCompromisso(comp));

        /**
         * TESTE DE UMA NOVA INSERÇÃO NA LISTA
         */
        System.out.println("\n");
        Relogio relogio3 = new Relogio(23, 30, 20);
        Compromisso comp3 = new Compromisso("Festa de aniversário jonas", relogio3);
        agenda.adicionaCompromisso(comp3);
        agenda.imprimeCompromissos();
        System.out.println("Índice: " + agenda.buscaCompromisso(comp3));
    }
}
