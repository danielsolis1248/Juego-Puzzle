/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author aleja
 */
public class Ventana_Dificultad_3x3 extends javax.swing.JFrame {

    static int contador =1;
    int i=0;
    
    public Ventana_Dificultad_3x3() {
        initComponents();
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("The Puzzle Game - Juego de 3x3");
        Nueve.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Boton_Volver_al_Menu = new javax.swing.JButton();
        Movimientos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtContador = new javax.swing.JTextField();
        Area_del_juego3x3 = new javax.swing.JPanel();
        Uno = new javax.swing.JButton();
        Dos = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Cuatro = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        Siete = new javax.swing.JButton();
        Ocho = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(369, 70));
        setMinimumSize(new java.awt.Dimension(650, 640));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coloca los numeros en orden de izquierda a derecha");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 560, 27);

        Boton_Volver_al_Menu.setBackground(new java.awt.Color(102, 0, 204));
        Boton_Volver_al_Menu.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        Boton_Volver_al_Menu.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Volver_al_Menu.setText("<--Volver al menú");
        Boton_Volver_al_Menu.setOpaque(false);
        Boton_Volver_al_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Volver_al_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Volver_al_Menu);
        Boton_Volver_al_Menu.setBounds(30, 530, 240, 50);

        Movimientos.setBackground(new java.awt.Color(5, 5, 70));
        Movimientos.setOpaque(false);
        Movimientos.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 51, 153));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Movimientos");
        jLabel4.setOpaque(true);
        Movimientos.add(jLabel4);
        jLabel4.setBounds(0, 0, 170, 30);

        txtContador.setEditable(false);
        txtContador.setBackground(new java.awt.Color(0, 0, 153));
        txtContador.setFont(new java.awt.Font("Courier New", 1, 32)); // NOI18N
        txtContador.setForeground(new java.awt.Color(51, 255, 0));
        txtContador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 2));
        txtContador.setOpaque(false);
        txtContador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContadorActionPerformed(evt);
            }
        });
        Movimientos.add(txtContador);
        txtContador.setBounds(10, 40, 70, 40);

        getContentPane().add(Movimientos);
        Movimientos.setBounds(400, 170, 180, 90);

        Area_del_juego3x3.setBackground(new java.awt.Color(51, 0, 153));
        Area_del_juego3x3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 3));
        Area_del_juego3x3.setLayout(new java.awt.GridLayout(3, 3));

        Uno.setBackground(new java.awt.Color(153, 255, 0));
        Uno.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Uno.setForeground(new java.awt.Color(0, 102, 0));
        Uno.setText("4");
        Uno.setBorder(null);
        Uno.setOpaque(false);
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Uno);

        Dos.setBackground(new java.awt.Color(153, 255, 0));
        Dos.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Dos.setForeground(new java.awt.Color(0, 102, 0));
        Dos.setText("5");
        Dos.setOpaque(false);
        Dos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DosFocusGained(evt);
            }
        });
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Dos);

        Tres.setBackground(new java.awt.Color(153, 255, 0));
        Tres.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Tres.setForeground(new java.awt.Color(0, 102, 0));
        Tres.setText("1");
        Tres.setOpaque(false);
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Tres);

        Cuatro.setBackground(new java.awt.Color(153, 255, 0));
        Cuatro.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Cuatro.setForeground(new java.awt.Color(0, 102, 0));
        Cuatro.setText("8");
        Cuatro.setOpaque(false);
        Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Cuatro);

        Cinco.setBackground(new java.awt.Color(153, 255, 0));
        Cinco.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Cinco.setForeground(new java.awt.Color(0, 102, 0));
        Cinco.setText("3");
        Cinco.setOpaque(false);
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Cinco);

        Seis.setBackground(new java.awt.Color(153, 255, 0));
        Seis.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Seis.setForeground(new java.awt.Color(0, 102, 0));
        Seis.setText("2");
        Seis.setOpaque(false);
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Seis);

        Siete.setBackground(new java.awt.Color(153, 255, 0));
        Siete.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Siete.setForeground(new java.awt.Color(0, 102, 0));
        Siete.setText("7");
        Siete.setOpaque(false);
        Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SieteActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Siete);

        Ocho.setBackground(new java.awt.Color(153, 255, 0));
        Ocho.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Ocho.setForeground(new java.awt.Color(0, 102, 0));
        Ocho.setText("6");
        Ocho.setOpaque(false);
        Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OchoActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Ocho);

        Nueve.setBackground(new java.awt.Color(153, 255, 0));
        Nueve.setFont(new java.awt.Font("Segoe UI Black", 0, 62)); // NOI18N
        Nueve.setForeground(new java.awt.Color(0, 102, 0));
        Nueve.setOpaque(false);
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });
        Area_del_juego3x3.add(Nueve);

        getContentPane().add(Area_del_juego3x3);
        Area_del_juego3x3.setBounds(30, 160, 350, 320);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modalidad 3x3");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        jLabel1.setInheritsPopupMenu(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 350, 56);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_del_puzzle/pngtree-modern-dark-color-abstract.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(640, 640));
        jLabel3.setMinimumSize(new java.awt.Dimension(640, 640));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(640, 640));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 640, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroActionPerformed
        if (Siete.isVisible() == false) {
            Siete.setText(Cuatro.getText());
            Cuatro.setVisible(false);
            Siete.setVisible(true);
        }
        if (Cinco.isVisible() == false) {
            Cinco.setText(Cuatro.getText());
            Cuatro.setVisible(false);
            Cinco.setVisible(true);
        }
        if (Uno.isVisible() == false) {
            Uno.setText(Cuatro.getText());
            Cuatro.setVisible(false);
            Uno.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_CuatroActionPerformed

    private void DosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_DosFocusGained

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
        if (Dos.isVisible() == false) {
            Dos.setText(Uno.getText());
            Uno.setVisible(false);
            Dos.setVisible(true);
        }
        if (Cuatro.isVisible() == false) {
            Cuatro.setText(Uno.getText());
            Uno.setVisible(false);
            Cuatro.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_UnoActionPerformed

    private void contarMovimiento() {
        txtContador.setText(String.valueOf(contador++));
    }

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        if (Seis.isVisible() == false) {
            Seis.setText(Tres.getText());
            Tres.setVisible(false);
            Seis.setVisible(true);
        }
        if (Dos.isVisible() == false) {
            Dos.setText(Tres.getText());
            Tres.setVisible(false);
            Dos.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_TresActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        if (Nueve.isVisible() == false) {
            Nueve.setText(Seis.getText());
            Seis.setVisible(false);
            Nueve.setVisible(true);
        }
        if (Cinco.isVisible() == false) {
            Cinco.setText(Seis.getText());
            Seis.setVisible(false);
            Cinco.setVisible(true);
        }
        if (Tres.isVisible() == false) {
            Tres.setText(Seis.getText());
            Seis.setVisible(false);
            Tres.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_SeisActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
        if (Tres.isVisible() == false) {
            Tres.setText(Dos.getText());
            Dos.setVisible(false);
            Tres.setVisible(true);
        }
        if (Cinco.isVisible() == false) {
            Cinco.setText(Dos.getText());
            Dos.setVisible(false);
            Cinco.setVisible(true);
        }
        if (Uno.isVisible() == false) {
            Uno.setText(Dos.getText());
            Dos.setVisible(false);
            Uno.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_DosActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        if (Seis.isVisible() == false) {
            Seis.setText(Nueve.getText());
            Nueve.setVisible(false);
            Seis.setVisible(true);
        }
        if (Ocho.isVisible() == false) {
            Ocho.setText(Nueve.getText());
            Nueve.setVisible(false);
            Ocho.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_NueveActionPerformed

    private void OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OchoActionPerformed
        if (Nueve.isVisible() == false) {
            Nueve.setText(Ocho.getText());
            Ocho.setVisible(false);
            Nueve.setVisible(true);
        }
        if (Siete.isVisible() == false) {
            Siete.setText(Ocho.getText());
            Ocho.setVisible(false);
            Siete.setVisible(true);
        }
        if (Cinco.isVisible() == false) {
            Cinco.setText(Ocho.getText());
            Ocho.setVisible(false);
            Cinco.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_OchoActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        if (Cuatro.isVisible() == false) {
            Cuatro.setText(Cinco.getText());
            Cinco.setVisible(false);
            Cuatro.setVisible(true);
        }
        if (Seis.isVisible() == false) {
            Seis.setText(Cinco.getText());
            Cinco.setVisible(false);
            Seis.setVisible(true);
        }
        if (Ocho.isVisible() == false) {
            Ocho.setText(Cinco.getText());
            Cinco.setVisible(false);
            Ocho.setVisible(true);
        }
        if (Dos.isVisible() == false) {
            Dos.setText(Cinco.getText());
            Cinco.setVisible(false);
            Dos.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_CincoActionPerformed

    private void SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SieteActionPerformed
        if (Ocho.isVisible() == false) {
            Ocho.setText(Siete.getText());
            Siete.setVisible(false);
            Ocho.setVisible(true);
        }
        if (Cuatro.isVisible() == false) {
            Cuatro.setText(Siete.getText());
            Siete.setVisible(false);
            Cuatro.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_SieteActionPerformed

    private void txtContadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContadorActionPerformed

    private void Boton_Volver_al_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Volver_al_MenuActionPerformed
        Ventana_MenuPrincipal_Juego Ventana = new Ventana_MenuPrincipal_Juego();
        Ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_Boton_Volver_al_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Dificultad_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Dificultad_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Dificultad_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Dificultad_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Dificultad_3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Area_del_juego3x3;
    private javax.swing.JButton Boton_Volver_al_Menu;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Cuatro;
    private javax.swing.JButton Dos;
    private javax.swing.JPanel Movimientos;
    private javax.swing.JButton Nueve;
    private javax.swing.JButton Ocho;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Siete;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Uno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContador;
    // End of variables declaration//GEN-END:variables
}
