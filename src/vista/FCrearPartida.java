/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import Dominio.Jugador;
import conexiones.Partida;
import java.awt.Color;
/**
 *
 * @author Judi
 */
public class FCrearPartida extends javax.swing.JFrame {
 FLobby lobby= new FLobby();
 Partida p = new Partida();
    /**
     * Creates new form FCrearPartida
     */
    public FCrearPartida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        BoxColor = new javax.swing.JComboBox<>();
        txtnomjugador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtApuesta = new javax.swing.JTextField();
        txtFondo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jButtonComenzar = new javax.swing.JButton();
        JugadoresBox = new javax.swing.JComboBox<>();
        TamañoBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Creacion Partida");
        setMinimumSize(new java.awt.Dimension(629, 452));
        setPreferredSize(new java.awt.Dimension(629, 452));
        setResizable(false);
        setSize(new java.awt.Dimension(629, 452));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Configuración partida");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 330, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Escoga su color;");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 150, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Datos del creador");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 210, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 40, 700, 10);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 170, 110, 40);
        jButton2.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 220, 700, 10);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Escriba su apodo;");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 90, 170, 20);

        BoxColor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Amarillo", "Rojo", "Verde" }));
        jPanel1.add(BoxColor);
        BoxColor.setBounds(170, 130, 120, 30);

        txtnomjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomjugadorActionPerformed(evt);
            }
        });
        jPanel1.add(txtnomjugador);
        txtnomjugador.setBounds(170, 90, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 230);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        txtApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApuestaActionPerformed(evt);
            }
        });
        jPanel2.add(txtApuesta);
        txtApuesta.setBounds(480, 100, 130, 30);

        txtFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFondoActionPerformed(evt);
            }
        });
        jPanel2.add(txtFondo);
        txtFondo.setBounds(480, 50, 130, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("Monto apuesta");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(320, 90, 140, 30);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setText("Fondo por jugador:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(320, 50, 170, 30);

        jButtonMenu.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(255, 0, 0));
        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMenu);
        jButtonMenu.setBounds(180, 150, 110, 40);

        jButtonComenzar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonComenzar.setForeground(new java.awt.Color(0, 153, 0));
        jButtonComenzar.setText("Comenzar");
        jButtonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComenzarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonComenzar);
        jButtonComenzar.setBounds(320, 150, 120, 40);

        JugadoresBox.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        JugadoresBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        jPanel2.add(JugadoresBox);
        JugadoresBox.setBounds(190, 90, 120, 30);

        TamañoBox.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        TamañoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "12", "10" }));
        jPanel2.add(TamañoBox);
        TamañoBox.setBounds(190, 50, 120, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setText("Esperando jugadores;");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 90, 180, 30);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("Tamaño:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 50, 110, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Configuración Partida");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 10, 250, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 220, 630, 230);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFondoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFondoActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void txtnomjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomjugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomjugadorActionPerformed

    private void txtApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApuestaActionPerformed

    private void jButtonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComenzarActionPerformed
        // TODO add your handling code here:
        if(validarCampos()==false){
                
                 lobby.setVisible(true);
                 Jugador u = new Jugador();
                 u.setNombre(txtnomjugador.getText());
                 String color = (String) BoxColor.getSelectedItem();
                 u.setColor(color);
                 
                    if (validarUsuarios(u)==false) {
                    /*
                     Codigo para asignar numeracion de jugadores temportal
                     */    
                
                     if ( FLobby.Lcolor1.getText().equals("\"DISPONIBLE\"")) {
                         FLobby.Ljugador1.setText(u.getNombre());
                         FLobby.Lcolor1.setText(u.getColor());
                         FLobby.jPanelJugador1.setBackground(ValidarColor(color));
                    
                     }else if(FLobby.Ljugador2.getText().equalsIgnoreCase("\"DISPONIBLE\"")){
                         FLobby.Ljugador2.setText(u.getNombre());
                         FLobby.jPanelJugador2.setBackground(ValidarColor(color));
                 
                     }else if(FLobby.Ljugador3.getText().equalsIgnoreCase("\"DISPONIBLE\"")){
                         FLobby.Ljugador3.setText(u.getNombre());
                         FLobby.jPanelJugador3.setBackground(ValidarColor(color));
                         
                     }else if(FLobby.Ljugador4.getText().equalsIgnoreCase("\"DISPONIBLE\"")){
                         FLobby.Ljugador4.setText(u.getNombre());
                         FLobby.jPanelJugador4.setBackground(ValidarColor(color));
                     }
                 /*
                     Codigo para asignar numeracion de jugadores temportal
                     */    
                 }
                    
                   /*
                    temporal mente desactive el dispose, para que se puedan ir agregando diferentes jugadores, 
                    lo que pasa es que en la linea 16 se crea un frame configuracion_juego diferente
                    por lo tando mientras no tengamos los metodos de conexion se mantrenda el dispose como comentado.
                    */
                   
                   
                 FLobby.LApuesta.setText(txtApuesta.getText());
                 FLobby.LFondo.setText(txtFondo.getText());
                 dispose();
             }
        
        
        
        
      
        
    }//GEN-LAST:event_jButtonComenzarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FCrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//    
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxColor;
    private javax.swing.JComboBox<String> JugadoresBox;
    private javax.swing.JComboBox<String> TamañoBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonComenzar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApuesta;
    private javax.swing.JTextField txtFondo;
    private javax.swing.JTextField txtnomjugador;
    // End of variables declaration//GEN-END:variables

public boolean validarCampos() {
        if (txtnomjugador.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Establece color y nombre de jugador para empezar");
        return true;
        }
        return false;
    }
public boolean validarUsuarios(Jugador u) {
        if (u.getNombre().equals(FLobby.Lcolor1.getText()) ) {
            JOptionPane.showMessageDialog(null, "Nombre ya creado, favor de usar otro");
        return true;
        }
        if (u.getNombre().equals(FLobby.Ljugador2.getText()) ) {
            JOptionPane.showMessageDialog(null, "Nombre ya creado, favor de usar otro");
        return true;
        }
        if (u.getNombre().equals(FLobby.Ljugador3.getText()) ) {
            JOptionPane.showMessageDialog(null, "Nombre ya creado, favor de usar otro");
        return true;
        }
        if (u.getNombre().equals(FLobby.Ljugador4.getText()) ) {
            JOptionPane.showMessageDialog(null, "Nombre ya creado, favor de usar otro");
        return true;
        }
        
        if (ValidarColor(u.getColor()).equals(FLobby.jPanelJugador1.getColorModel()) ) {
          
            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
        return true;
        }
//        if (u.getColor().equals(FLobby.txt_color2.getText()) ) {
//            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
//        return true;
//        }
//        if (u.getColor().equals(FLobby.txt_color3.getText()) ) {
//            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
//        return true;
//        }
//        if (u.getColor().equals(FLobby.txt_color4.getText()) ) {
//            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
//        return true;
//        }
        
        return false;
    }
public Color ValidarColor(String color){
                    switch (color) {
                            case "Azul":
                                return Color.BLUE;
                            case "Amarillo":
                                return Color.YELLOW;
                            case "Rojo":
                                return Color.RED;
                            case "Verde":
                                return Color.GREEN;
                            }
    return Color.WHITE;
    
}



}

