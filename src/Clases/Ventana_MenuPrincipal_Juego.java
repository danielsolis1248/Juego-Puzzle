/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Ventana_MenuPrincipal_Juego extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_de_Consulta_de_Saldo
     */
    public Ventana_MenuPrincipal_Juego() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("The Puzzle Game - Menu principal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Boton_Jugar = new javax.swing.JButton();
        Boton_Records = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(369, 70));
        setMinimumSize(new java.awt.Dimension(640, 640));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡The Puzzle Game!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 40, 500, 60);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Bienvenido jugador, eliga una de las opciones:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 200, 510, 40);

        Boton_Jugar.setBackground(new java.awt.Color(51, 204, 0));
        Boton_Jugar.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        Boton_Jugar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Jugar.setText("Jugar");
        Boton_Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Jugar);
        Boton_Jugar.setBounds(250, 290, 170, 60);

        Boton_Records.setBackground(new java.awt.Color(0, 153, 153));
        Boton_Records.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        Boton_Records.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Records.setText("Records");
        Boton_Records.setOpaque(false);
        Boton_Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RecordsActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Records);
        Boton_Records.setBounds(250, 380, 170, 60);

        Boton_Salir.setBackground(new java.awt.Color(255, 0, 0));
        Boton_Salir.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        Boton_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Salir.setText("Salir");
        Boton_Salir.setOpaque(false);
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Salir);
        Boton_Salir.setBounds(250, 470, 170, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menu Principal");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 120, 290, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_puzzle/pngtree-modern-dark-color-abstract.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setMaximumSize(new java.awt.Dimension(640, 640));
        jLabel3.setMinimumSize(new java.awt.Dimension(640, 640));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(640, 640));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 640, 600);
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(500, -40, 100, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        Icon icono = new ImageIcon(getClass().getResource("/Imagenes_del_puzzle/like pixeleado nuevo.png"));
        JOptionPane.showMessageDialog(rootPane, "Muchas gracias por jugar, ¡Te esperamos pronto!", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
        dispose();
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void Boton_JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_JugarActionPerformed
        Ventana_Nivel_De_Dificultad Ventana = new Ventana_Nivel_De_Dificultad();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_JugarActionPerformed

    private void Boton_RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RecordsActionPerformed
        Ventana_Records Ventana = new Ventana_Records();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_RecordsActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_MenuPrincipal_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_MenuPrincipal_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_MenuPrincipal_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_MenuPrincipal_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            @Override
            public void run() {
                new Ventana_MenuPrincipal_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Jugar;
    private javax.swing.JButton Boton_Records;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
