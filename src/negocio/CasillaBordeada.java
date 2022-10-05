/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Judi
 */
public class CasillaBordeada extends Figura {

    private int[] x;
    private int[] y;
    private int[] xBorde;
    private int[] yBorde;
    private Graphics g;

    public CasillaBordeada(int[] x, int[] y, Graphics g, String posicion, int xBorde[], int yBorde[]) {
        super(posicion);
        this.x = x;
        this.y = y;
        this.g = g;
        this.xBorde = xBorde;
        this.yBorde = yBorde;
    }

    @Override
    public void dibujar() {
        g.setColor(Color.black);
        Polygon polygon1 = new Polygon(x, y, x.length);
        g.drawPolygon(polygon1);
        Polygon polygon2 = new Polygon(xBorde, yBorde, xBorde.length);
        g.drawPolygon(polygon2);
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }

    public int[] getxBorde() {
        return xBorde;
    }

    public void setxBorde(int[] xBorde) {
        this.xBorde = xBorde;
    }

    public int[] getyBorde() {
        return yBorde;
    }

    public void setyBorde(int[] yBorde) {
        this.yBorde = yBorde;
    }

}
