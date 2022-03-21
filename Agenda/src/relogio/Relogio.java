/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relogio;

/**
 *
 * @author Jonas Elias
 */
public class Relogio {

    private int hora;

    private int minutos;

    private int segundos;

    public Relogio(int hora, int minutos, int segundos) {
        this.setHora(hora);
        this.setMinutos(minutos);
        this.setSegundos(segundos);
    }

    void setHora(int hora) {
        if (hora >= 0 || hora <= 23) {
            this.hora = hora;
        }
    }

    void setMinutos(int minutos) {
        if (minutos >= 0 || minutos <= 59) {
            this.minutos = minutos;
        }
    }

    void setSegundos(int segundos) {
        if (segundos >= 0 || segundos <= 59) {
            this.segundos = segundos;
        }
    }

    public boolean equals(Object relogio) {
        if (this == relogio) {
            return true;
        }

        return false;
    }

}
