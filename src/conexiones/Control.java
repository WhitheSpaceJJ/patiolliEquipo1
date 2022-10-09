/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiones;

import Dominio.Casilla;
import Dominio.Jugador;
import Dominio.Tablero;

public class Control implements IControl {
    
    private static Control instanceControl;
    
    @Override
    public void establecerJuego(String numeroPartida, int totalJugadores, int tamañoT) {
        Partida.getPartida().establecerJuego(numeroPartida, totalJugadores, tamañoT);
    }

    private Control() {
    }
    
    public static Control getControl() {
        if (instanceControl == null) {
           instanceControl = new Control();
        }
        return instanceControl;
    }


    @Override
    public void destruirPartida() {
        Partida.getPartida().destruirPartida();
    }

    @Override
    public boolean agregarJugador(String nombre, String color) {
        return Partida.getPartida().agregarJugador(nombre, color);
    }

    @Override
    public boolean verificarNombre(String nombre) {
        return Partida.getPartida().verificarNombre(nombre);
    }

    @Override
    public boolean verificarColor(String color) {
        return Partida.getPartida().verificarColor(color);
    }

    @Override
    public boolean validarCreacion() {
        return Partida.getPartida().validarCreacion();
    }

    @Override
    public boolean validarJugadores() {
        return Partida.getPartida().validarJugadores();
    }

    @Override
    public int getTotalJugadores() {
        return Partida.getPartida().getTotalJugadores();
    }

    @Override
    public int getTamañoTablero() {
        return Partida.getPartida().getTamañoTablero();
    }

    @Override
    public Tablero getTablero() {
        return Partida.getPartida().getTablero();
    }

    @Override
    public String getNumeroPartida() {
        return Partida.getPartida().getNumeroPartida();
    }

    @Override
    public Turno getTurno() {
        return Partida.getPartida().getTurno();
    }

}
