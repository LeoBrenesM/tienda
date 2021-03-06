/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class IngresoCliente extends javax.swing.JFrame {

    /**
     * Creates new form IngresoCliente
     */
    
    int xA = this.getX();
    int yA = this.getY();
    
    public IngresoCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    static Arbol arbolCliente=new Arbol();//static para que se puedan llamar los métodos

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        generoTXT = new javax.swing.JTextField();
        IdTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        numeroTXT = new javax.swing.JTextField();
        AtrasBTN = new javax.swing.JButton();
        GuardarBTN = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        mover = new javax.swing.JButton();
        ColorBarra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 51, 58), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Ingreso Informacion Cliente Nuevo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 48, 408, 36));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Identificación");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Nombre Completo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 168, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Teléfono");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 216, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Género");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 264, -1, -1));

        generoTXT.setBackground(new java.awt.Color(204, 204, 204));
        generoTXT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(62, 62, 104), new java.awt.Color(52, 52, 91)));
        jPanel2.add(generoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 264, 264, 24));

        IdTXT.setBackground(new java.awt.Color(204, 204, 204));
        IdTXT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(62, 62, 104), new java.awt.Color(52, 52, 91)));
        jPanel2.add(IdTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 120, 264, 24));

        nombreTXT.setBackground(new java.awt.Color(204, 204, 204));
        nombreTXT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(62, 62, 104), new java.awt.Color(52, 52, 91)));
        jPanel2.add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 168, 264, 24));

        numeroTXT.setBackground(new java.awt.Color(204, 204, 204));
        numeroTXT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 51), new java.awt.Color(62, 62, 104), new java.awt.Color(52, 52, 91)));
        jPanel2.add(numeroTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 216, 264, 24));

        AtrasBTN.setBackground(new java.awt.Color(0, 0, 51));
        AtrasBTN.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        AtrasBTN.setForeground(new java.awt.Color(255, 255, 255));
        AtrasBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        AtrasBTN.setBorder(null);
        AtrasBTN.setContentAreaFilled(false);
        AtrasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasBTNActionPerformed(evt);
            }
        });
        jPanel2.add(AtrasBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 336, 84, -1));

        GuardarBTN.setBackground(new java.awt.Color(0, 0, 51));
        GuardarBTN.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        GuardarBTN.setForeground(new java.awt.Color(255, 255, 255));
        GuardarBTN.setText("Guardar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });
        jPanel2.add(GuardarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 336, -1, -1));

        limpiarBtn.setBackground(new java.awt.Color(0, 0, 51));
        limpiarBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        limpiarBtn.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBtn.setText("Limpiar");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(limpiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 336, -1, -1));

        minimizar.setBackground(new java.awt.Color(46, 51, 58));
        minimizar.setFont(new java.awt.Font("Broadway", 1, 36)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 255, 255));
        minimizar.setText("-");
        minimizar.setBorder(null);
        minimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                minimizarMouseMoved(evt);
            }
        });
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        jPanel2.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 0, 72, 24));

        cerrar.setBackground(new java.awt.Color(46, 51, 58));
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("X");
        cerrar.setBorder(null);
        cerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cerrarMouseMoved(evt);
            }
        });
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel2.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 0, 72, 24));

        mover.setBackground(new java.awt.Color(46, 51, 58));
        mover.setBorderPainted(false);
        mover.setContentAreaFilled(false);
        mover.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                moverMouseMoved(evt);
            }
        });
        mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverMousePressed(evt);
            }
        });
        mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverActionPerformed(evt);
            }
        });
        jPanel2.add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 384, 24));

        ColorBarra.setBackground(new java.awt.Color(46, 51, 58));
        ColorBarra.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ColorBarra.setForeground(new java.awt.Color(0, 0, 204));
        ColorBarra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ColorBarra.setText("Agregar Cliente");
        ColorBarra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ColorBarra.setOpaque(true);
        ColorBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ColorBarraMouseMoved(evt);
            }
        });
        jPanel2.add(ColorBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasBTNActionPerformed
       Clientes cliente = new Clientes();
        cliente.show();
        this.dispose();
    }//GEN-LAST:event_AtrasBTNActionPerformed

    private void GuardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTNActionPerformed
        try{
            int id=Integer.parseInt(IdTXT.getText());
            String nom=nombreTXT.getText();
            int numero=Integer.parseInt(numeroTXT.getText());
            String genero =generoTXT.getText();

            arbolCliente.inserta(new Cliente(id,nom,numero,genero));//Se llama al arbol y se ingresa la  informacion del cliente

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese de manera correcta los datos que se le piden");
        }

    }//GEN-LAST:event_GuardarBTNActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        IdTXT.setText("");//Se limpia la información
        nombreTXT.setText("");
        generoTXT.setText("");
        numeroTXT.setText("");
    }//GEN-LAST:event_limpiarBtnActionPerformed

    private void minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseMoved
        minimizar.setBackground(new Color(32, 178, 170));
        cerrar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_minimizarMouseMoved

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        minimizar.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_minimizarMouseClicked

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizarActionPerformed

    private void cerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseMoved
        cerrar.setBackground(Color.red);
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_cerrarMouseMoved

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        Point punto=MouseInfo.getPointerInfo().getLocation();
        int x=(punto.x-xA -30);
        int y=(punto.y-yA-10);
        this.setLocation(x, y);
    }//GEN-LAST:event_moverMouseDragged

    private void moverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseMoved
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseMoved

    private void moverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseClicked
        mover.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseClicked

    private void moverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseEntered
        mover.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_moverMouseEntered

    private void moverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseExited
        mover.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_moverMouseExited

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed

    }//GEN-LAST:event_moverMousePressed

    private void moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moverActionPerformed

    private void ColorBarraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorBarraMouseMoved
        minimizar.setBackground(new Color(46, 51, 58));
        cerrar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_ColorBarraMouseMoved

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
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasBTN;
    private javax.swing.JLabel ColorBarra;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JTextField IdTXT;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField generoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton mover;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField numeroTXT;
    // End of variables declaration//GEN-END:variables
}
