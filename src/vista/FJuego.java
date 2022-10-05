/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import negocio.FachadaNegocio;
import negocio.INegocio;

/**
 *
 * @author Judi
 */
public class FJuego extends javax.swing.JFrame {

    INegocio negocio;

    /**
     * Creates new form VistaJugador
     */
    public FJuego() {
        initComponents();
        this.negocio = new FachadaNegocio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablero = new javax.swing.JPanel();
        datoJugador = new javax.swing.JPanel();
        jugador = new javax.swing.JLabel();
        MontoTitulo = new javax.swing.JLabel();
        fichas = new javax.swing.JPanel();
        dinero = new javax.swing.JLabel();
        lanzar = new javax.swing.JButton();
        MontoTitulo1 = new javax.swing.JLabel();
        dinero1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego");
        setMinimumSize(new java.awt.Dimension(1268, 640));
        setPreferredSize(new java.awt.Dimension(1250, 611));
        getContentPane().setLayout(null);

        tablero.setBackground(new java.awt.Color(255, 255, 255));
        tablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablero.setMinimumSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        getContentPane().add(tablero);
        tablero.setBounds(0, 0, 600, 600);

        datoJugador.setBackground(new java.awt.Color(204, 204, 204));
        datoJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        datoJugador.setLayout(null);

        jugador.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jugador.setText("Jugador");
        datoJugador.add(jugador);
        jugador.setBounds(140, 10, 150, 60);

        MontoTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MontoTitulo.setText("Fichas En Juego;");
        datoJugador.add(MontoTitulo);
        MontoTitulo.setBounds(20, 120, 160, 60);

        fichas.setBackground(new java.awt.Color(255, 255, 255));
        fichas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fichas.setPreferredSize(new java.awt.Dimension(380, 380));

        javax.swing.GroupLayout fichasLayout = new javax.swing.GroupLayout(fichas);
        fichas.setLayout(fichasLayout);
        fichasLayout.setHorizontalGroup(
            fichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        fichasLayout.setVerticalGroup(
            fichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        datoJugador.add(fichas);
        fichas.setBounds(20, 240, 350, 350);

        dinero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dinero.setText("0");
        datoJugador.add(dinero);
        dinero.setBounds(210, 120, 90, 60);

        lanzar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lanzar.setText("Lanzar");
        lanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarActionPerformed(evt);
            }
        });
        datoJugador.add(lanzar);
        lanzar.setBounds(140, 190, 110, 40);

        MontoTitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MontoTitulo1.setText("Monto Actual;");
        datoJugador.add(MontoTitulo1);
        MontoTitulo1.setBounds(20, 70, 170, 60);

        dinero1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dinero1.setText("20000");
        datoJugador.add(dinero1);
        dinero1.setBounds(210, 70, 170, 60);

        getContentPane().add(datoJugador);
        datoJugador.setBounds(600, 0, 400, 600);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Turno  Actual");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 160, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Jugador");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 90, 21);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Fichas en Juego");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 170, 130, 19);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Jose");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 70, 80, 20);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("0");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 170, 8, 19);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("Monto Actual");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 120, 120, 21);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("jLabel4");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 120, 46, 19);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel8.setText("Turno ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 35, 16);

        jLabel9.setText("Jugador");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 50, 60, 16);

        jLabel10.setText("Fichas en Juego");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 110, 100, 16);

        jLabel11.setText("jLabel4");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(120, 50, 41, 16);

        jLabel12.setText("jLabel4");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(120, 110, 41, 16);

        jLabel13.setText("Monto Actual");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 80, 70, 16);

        jLabel14.setText("jLabel4");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(120, 80, 41, 16);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 600, 240, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1000, 0, 250, 240);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setText("Jugadores");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 20, 100, 16);

        jScrollPane2.setViewportView(jList1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 200, 100);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1000, 240, 250, 190);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jButton1.setText("Salir Partida");
        jPanel4.add(jButton1);
        jButton1.setBounds(1120, 490, 110, 40);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("Salir Partida");
        jPanel4.add(jButton2);
        jButton2.setBounds(50, 80, 140, 40);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("Desea abondonar juego");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(30, 20, 200, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(1000, 430, 250, 170);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarActionPerformed
        this.negocio.dibujarTablero(tablero.getGraphics(), 10);
        this.negocio.dibujarDados(fichas.getGraphics());
//        TODO add your handling code here:
//        Juego.tablero(tablero.getGraphics());
//        Juego.dados(fichas.getGraphics());
    }//GEN-LAST:event_lanzarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MontoTitulo;
    private javax.swing.JLabel MontoTitulo1;
    private javax.swing.JPanel datoJugador;
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel dinero1;
    private javax.swing.JPanel fichas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jugador;
    private javax.swing.JButton lanzar;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
