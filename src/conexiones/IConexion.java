/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conexiones;

/**
 *
 * @author Judi
 */
public interface IConexion {
    public Partida crearPartida(String numeroPartida);
    

    public boolean verificarNombre(String nombre);

    public boolean verificarColor(String color);
}
