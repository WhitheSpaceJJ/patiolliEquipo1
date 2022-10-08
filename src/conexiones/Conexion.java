/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

/**
 *
 * @author Carlos
 */
public class Conexion implements IConexion {

    private Partida partida;

    @Override
    public Partida crearPartida(String numeroPartida) {
        partida = Partida.getPartida(numeroPartida);
        return partida;
    }

    @Override
    public boolean verificarNombre(String nombre) {
    }

    @Override
    public boolean verificarColor(String color) {
    }
}
