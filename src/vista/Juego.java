package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Juego {

    public static void tablero(Graphics g) {
        //Cuadros Amarillos
        
        g.setColor(Color.yellow);
        Polygon cuadroDerB = new Polygon();
        cuadroDerB.addPoint(300, 380);
        cuadroDerB.addPoint(340, 340);
        cuadroDerB.addPoint(368, 368);
        cuadroDerB.addPoint(328, 408);
        g.fillPolygon(cuadroDerB);
        Polygon cuadroIzqB = new Polygon();
        cuadroIzqB.addPoint(220, 300);
        cuadroIzqB.addPoint(260, 340);
        cuadroIzqB.addPoint(232, 368);
        cuadroIzqB.addPoint(192, 328);
        g.fillPolygon(cuadroIzqB);
        Polygon cuadroIzqA = new Polygon();
        cuadroIzqA.addPoint(260, 260);
        cuadroIzqA.addPoint(300, 220);
        cuadroIzqA.addPoint(272, 192);
        cuadroIzqA.addPoint(232, 232);
        g.fillPolygon(cuadroIzqA);
        Polygon cuadroDerA = new Polygon();
        cuadroDerA.addPoint(340, 260);
        cuadroDerA.addPoint(380, 300);
        cuadroDerA.addPoint(408, 272);
        cuadroDerA.addPoint(368, 232);
        g.fillPolygon(cuadroDerA);

        //Triangulos
        g.setColor(Color.red);
//DereB
        Polygon a = new Polygon();
        a.addPoint(480, 480);
        a.addPoint(433, 513);
        a.addPoint(447, 527);
        g.fillPolygon(a);
        Polygon b = new Polygon();
        b.addPoint(480, 480);
        b.addPoint(513, 433);
        b.addPoint(527, 447);
        g.fillPolygon(b);

        //IzqA
        Polygon e = new Polygon();
        e.addPoint(120, 120);
        e.addPoint(73, 153);
        e.addPoint(87, 167);
        g.fillPolygon(e);
        Polygon f = new Polygon();
        f.addPoint(120, 120);
        f.addPoint(153, 73);
        f.addPoint(167, 87);
        g.fillPolygon(f);
//
        //IzqB
//          
        Polygon k = new Polygon();
        k.addPoint(120, 480);
        k.addPoint(87, 433);
        k.addPoint(73, 447);
        g.fillPolygon(k);
        Polygon l = new Polygon();
        l.addPoint(120, 480);
        l.addPoint(167,513);
        l.addPoint(153,527);
        g.fillPolygon(l);


        //DerA
        Polygon n = new Polygon();
        n.addPoint(480, 120);
        n.addPoint(433, 87);
        n.addPoint(447,73 );
        g.fillPolygon(n);
        Polygon m = new Polygon();
        m.addPoint(480, 120);
        m.addPoint(513, 167);
        m.addPoint(527, 153);
        g.fillPolygon(m);
//g.drawArc(x, y, width, height, starAngle, arcA);
        //Circunferencia
        g.setColor(Color.black);
        int xValues[] = {20, 220, 20, 100, 300, 500, 580, 380, 580, 500, 300, 100};
        int yValues[] = {100, 300, 500, 580, 380, 580, 500, 300, 100, 20, 220, 20};
        Polygon polygon1 = new Polygon(xValues, yValues, xValues.length);
        g.drawPolygon(polygon1);

        //Ala Derecha B
        g.drawLine(340, 340, 536, 536);
        g.drawLine(300, 380, 380, 300);
        g.drawLine(328, 408, 408, 328);
        g.drawLine(356, 436, 436, 356);
        g.drawLine(384, 464, 464, 384);
        g.drawLine(412, 492, 492, 412);
        g.drawLine(440, 520, 520, 440);
        g.drawLine(468, 548, 548, 468);

        //Ala Izquirda B
        g.drawLine(260, 340, 64, 536);
        g.drawLine(220, 300, 300, 380);
        g.drawLine(192, 328, 272, 408);
        g.drawLine(164, 356, 244, 436);
        g.drawLine(136, 384, 216, 464);
        g.drawLine(108, 412, 188, 492);
        g.drawLine(80, 440, 160, 520);
        g.drawLine(52, 468, 132, 548);

        //Ala Derecha A
        g.drawLine(340, 260, 536, 64);
        g.drawLine(300, 220, 380, 300);
        g.drawLine(328, 192, 408, 272);
        g.drawLine(356, 164, 436, 244);
        g.drawLine(384, 136, 464, 216);
        g.drawLine(412, 108, 492, 188);
        g.drawLine(440, 80, 520, 160);
        g.drawLine(468, 52, 548, 132);

        //Ala Izquirda A
        g.drawLine(260, 260, 64, 64);
        g.drawLine(220, 300, 300, 220);
        g.drawLine(192, 272, 272, 192);
        g.drawLine(164, 244, 244, 164);
        g.drawLine(136, 216, 216, 136);
        g.drawLine(108, 188, 188, 108);
        g.drawLine(80, 160, 160, 80);
        g.drawLine(52, 132, 132, 52);

        //Centro
        g.drawLine(340, 340, 260, 260);
        g.drawLine(260, 340, 340, 260);

        //Auxiliar Blanco
        g.setColor(Color.white);
        g.drawLine(500, 20, 580, 100);
        g.drawLine(20, 100, 100, 20);
        g.drawLine(20, 500, 100, 580);
        g.drawLine(500, 580, 580, 500);

        //Redondeo de Aspas
        g.setColor(Color.black);

//                int xValues3[] = {300,468,548,380};
//        int yValues3[] = {380,548,468,300};
//        Polygon polygon3 = new Polygon(xValues3, yValues3, 6);
//        g.drawPolygon(polygon3);
//        
//        int xValues[] = {20, 40, 50, 30, 20, 15};
//        int yValues[] = {50, 50, 60, 80, 80, 60};
//        Polygon polygon1 = new Polygon(xValues, yValues, 6);
//        g.drawPolygon(polygon1);
//        int xValues2[] = {70, 90, 100, 80, 70, 65, 60};
//        int yValues2[] = {100, 100, 110, 110, 130, 110, 90};
//
//        g.drawPolyline(xValues2, yValues2, 7);
//        int xValues3[] = {120, 140, 150, 190};
//        int yValues3[] = {40, 70, 80, 60};
//        g.fillPolygon(xValues3, yValues3, 4);
//        Polygon polygon2 = new Polygon();
//        polygon2.addPoint(165, 135);
//        polygon2.addPoint(175, 150);
//        polygon2.addPoint(270, 200);
//        polygon2.addPoint(200, 220);
//        polygon2.addPoint(130, 180);
//        g.fillPolygon(polygon2);
// g.setColor(Color.red);
//        g.drawRect(35, 35, 70, 105);
//        g.drawOval(52, 87, 35, 35);
//        g.setColor(Color.green);
//        g.drawRect(140, 35, 70, 105);
//        g.drawOval(157, 87, 35, 35);
//        g.setColor(Color.yellow);
//        g.drawRect(245, 35, 70,105 );
//        g.drawOval(262, 87, 35, 35);
//        g.setColor(Color.blue);
//        g.drawRect(70, 175, 70, 105);
//        g.drawOval(87, 217, 35, 35);
//        g.setColor(Color.pink);
//        g.drawRect(210, 175, 70, 105);
//        g.drawOval(227, 227, 35, 35);
    }

    public static void dados(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(35, 35, 70, 105);
        g.drawOval(52, 87, 35, 35);
        g.setColor(Color.green);
        g.drawRect(140, 35, 70, 105);
        g.drawOval(157, 87, 35, 35);
        g.setColor(Color.yellow);
        g.drawRect(245, 35, 70, 105);
        g.drawOval(262, 87, 35, 35);
        g.setColor(Color.blue);
        g.drawRect(70, 175, 70, 105);
        g.drawOval(87, 217, 35, 35);
        g.setColor(Color.pink);
        g.drawRect(210, 175, 70, 105);
        g.drawOval(227, 227, 35, 35);
    }
}
