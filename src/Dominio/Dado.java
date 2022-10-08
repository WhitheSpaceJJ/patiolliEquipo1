/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Carlos
 */
public class Dado {
    private int numero;
    private boolean lado;
    private Jugador jugador;

    public Dado() {
    }

    public Dado(int numero, Jugador jugador) {
        this.numero = numero;
        this.jugador = jugador;
    }

    public Dado(int numero, boolean lado, Jugador jugador) {
        this.numero = numero;
        this.lado = lado;
        this.jugador = jugador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLado() {
        return lado;
    }

    public void setLado(boolean lado) {
        this.lado = lado;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Dado{" + "numero=" + numero + ", lado=" + lado + ", jugador=" + jugador + '}';
    }


    
    
    
}
