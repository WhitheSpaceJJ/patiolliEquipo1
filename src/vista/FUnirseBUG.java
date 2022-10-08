/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Dominio.usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Judi
 */
public class FUnirseBUG extends javax.swing.JFrame {
 FLobby lobby= new FLobby();

    /**
     * Creates new form FUnirse
     */
    public FUnirseBUG() {
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
        jButtonMenu = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        BoxColor = new javax.swing.JComboBox<>();
        jButtonUnirse = new javax.swing.JButton();
        txtnomjugador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Unirse a Partida");
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(545, 313));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Unirse a partida");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 10, 240, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Escoga su color;");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 160, 150, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Datos del jugador");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 190, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 50, 540, 10);

        jButtonMenu.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(255, 0, 0));
        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenu);
        jButtonMenu.setBounds(280, 228, 100, 40);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 220, 550, 10);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setText("Escriba su apodo;");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 110, 160, 20);

        BoxColor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Amarillo", "Rojo", "Verde" }));
        jPanel1.add(BoxColor);
        BoxColor.setBounds(180, 160, 120, 30);

        jButtonUnirse.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonUnirse.setForeground(new java.awt.Color(102, 255, 102));
        jButtonUnirse.setText("Unirse");
        jButtonUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnirseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUnirse);
        jButtonUnirse.setBounds(130, 230, 90, 40);
        jPanel1.add(txtnomjugador);
        txtnomjugador.setBounds(170, 110, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 310);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnirseActionPerformed
        // TODO add your handling code here:
         /* Create and display the form */
        if(validarCampos()==false){
                
                 lobby.setVisible(true);
                 usuario u = new usuario();
                 u.setNombre(txtnomjugador.getText());
                 String color = (String) BoxColor.getSelectedItem();
                 u.setColor(color);
             
                    if (validarUsuarios(u)==false) {
                    /*
                     Codigo para asignar numeracion de jugadores temportal
                     */    
                
                     if ( FLobby.Ljugador1.getText().equals("\"DISPONIBLE\"")) {
                         FLobby.Ljugador1.setText(u.getNombre());
                          FLobby.Lcolor1.setText(u.getColor());
                         FLobby.jPanelJugador1.setBackground(ValidarColor(color));
                    
                     }else if(FLobby.Ljugador2.getText().equalsIgnoreCase("\"DISPONIBLE\"")){
                         FLobby.Ljugador2.setText(u.getNombre());
                          FLobby.Lcolor2.setText(u.getColor());
                         FLobby.jPanelJugador2.setBackground(ValidarColor(color));
                 
                     }else if(FLobby.Ljugador3.getText().equalsIgnoreCase("\"DISPONIBLE\"")){
                         FLobby.Ljugador3.setText(u.getNombre());
                          FLobby.Lcolor3.setText(u.getColor());
                         FLobby.jPanelJugador3.setBackground(ValidarColor(color));
                         
                     }else if(FLobby.Ljugador4.getText().equalsIgnoreCase("\"DISPONIBLE\"")){
                         FLobby.Ljugador4.setText(u.getNombre());
                          FLobby.Lcolor4.setText(u.getColor());
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
                 dispose();
             }
    }//GEN-LAST:event_jButtonUnirseActionPerformed

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
//            java.util.logging.Logger.getLogger(FUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FUnirse().setVisible(true);
//            }
//        });
//    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxColor;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonUnirse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtnomjugador;
    // End of variables declaration//GEN-END:variables

    public boolean validarCampos() {
        if (txtnomjugador.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Establece color y nombre de jugador para empezar");
        return true;
        }
        return false;
    }
    
    
    public boolean validarUsuarios(usuario u) {
        if (u.getNombre().equals(FLobby.Ljugador1.getText()) ) {
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
        if (u.getNombre().equals(FLobby.Ljugador4.getText())) {
            JOptionPane.showMessageDialog(null, "Nombre ya creado, favor de usar otro");
        return true;
        }
        
        if (ValidarColor(u.getColor()).equals(FLobby.Lcolor1.getText())) {
          
            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
        return true;
        }
        if (ValidarColor(u.getColor()).equals(FLobby.Lcolor2.getText())) {
            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
        return true;
        }
        if (ValidarColor(u.getColor()).equals(FLobby.Lcolor3.getText())) {
            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
        return true;
        }
        if (ValidarColor(u.getColor()).equals(FLobby.Lcolor4.getText())) {
            JOptionPane.showMessageDialog(null, "Color ocupado, favor de seleccionar otro");
        return true;
        }
        
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
