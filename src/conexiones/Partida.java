/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import Dominio.Tablero;
import conexiones.Iverificaciones;

/**
 *
 * @author Carlos
 */
public final class Partida {

    private static Partida instancePartida;
    private String numeroPartida;
    private static Tablero tablero;

    private Partida(String numeroPartida) {
        this.numeroPartida = numeroPartida;
    }

    public static Partida getPartida(String partida) {
        if (partida == null) {
            instancePartida = new Partida(partida);
        }
        return instancePartida;
    }

    public String getNumeroPartida() {
        return numeroPartida;
    }

    public void setNumeroPartida(String numeroPartida) {
        this.numeroPartida = numeroPartida;
    }

    public static Tablero getTablero() {
        return tablero;
    }

    public static void setTablero(Tablero tablero) {
        Partida.tablero = tablero;
    }

}
