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
public class Dinero {
    private double cantidad;
    private Jugador jugador;

    public Dinero() {
    }

    public Dinero(double cantidad, Jugador jugador) {
        this.cantidad = cantidad;
        this.jugador = jugador;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
