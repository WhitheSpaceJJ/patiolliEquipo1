
package Dominio;


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
