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
public class Ficha {
   private int numero;
   private Jugador jugador;

    public Ficha() {
    }

    public Ficha(int numero, Jugador jugador) {
        this.numero = numero;
        this.jugador = jugador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Ficha{" + "numero=" + numero + ", jugador=" + jugador + '}';
    }
   
    
    
}
