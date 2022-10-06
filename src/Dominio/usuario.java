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
public class usuario {
   String nombre,color;
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public usuario(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public usuario() {
    }
   
    public void color(String color){
    
    }

    @Override
    public String toString() {
        return "usuario{" + " nombre= " + nombre + ", color= " + color + '}';
    }
    
}

