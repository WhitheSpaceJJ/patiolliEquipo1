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
public interface Iverificaciones {
    
    //Verifica que los datos no sean numeros negativos o datos no permetidos 
    void VerificarCamposNumericos(String datos);
    //Verifica que los datos del fondo sean solo numeros enteros y positivos
    void VerificarCamposTexto(String datos);
    //Verifica que el nombre del jugador este disponible
    void VerificarNombre(String nombre);
    //Verifica que el color este disponible
    void VerificarColor(String color);
    
}
