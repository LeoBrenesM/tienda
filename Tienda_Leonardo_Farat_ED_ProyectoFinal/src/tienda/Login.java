/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorios
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int xA = this.getX();
    int yA = this.getY();
    
    public static ArrayList <producto> productos= new ArrayList <producto>();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date date = new Date();
        int dia = date.getDay();
        String nombreDia;
        if (dia == 0) {nombreDia = "Domingo";
        } else if (dia == 1) {nombreDia = "Lunes";
        } else if (dia == 2) {nombreDia = "Martes";
        } else if (dia == 3) {nombreDia = "Miercoles";
        } else if (dia == 4) {nombreDia = "Jueves";
        } else if (dia == 5) {nombreDia = "Viernes";
        } else {nombreDia = "Sabado";
        }
        String texto = nombreDia;
        texto = texto + "  " + String.valueOf(date.getDate()) + " / " + String.valueOf(date.getDay()) + " / "
                + String.valueOf((1900 + date.getYear()));
        fecha.setText(texto);
        Hora h = new Hora(hora);
        h.start();
        try{
            BufferedReader br = new BufferedReader(new FileReader("./productos.txt"));
            String linea = br.readLine(); 
            String nombre;
            int costo;
            int codigo;
            String descripcion;
            while(linea!=null){
                nombre = linea;
                linea = br.readLine();
                costo= Integer.parseInt(linea);
                linea = br.readLine();
                codigo=Integer.parseInt(linea);
                linea = br.readLine();
                descripcion = linea;
                productos.add(new producto(nombre, costo,codigo, descripcion));
                linea = br.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Hubo un error en la lectura de datos");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jusuario = new javax.swing.JTextField();
        Texto = new javax.swing.JLabel();
        contra = new javax.swing.JLabel();
        jcontrasena = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        mover = new javax.swing.JButton();
        ColorBarra = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(450, 200, 50, 50));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jusuario.setBackground(new java.awt.Color(153, 153, 153));
        jusuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jusuario.setForeground(new java.awt.Color(255, 255, 255));
        jusuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 192, 192, 36));

        Texto.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        Texto.setForeground(new java.awt.Color(0, 0, 153));
        Texto.setText("Usuario");
        getContentPane().add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 192, 156, 36));

        contra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        contra.setForeground(new java.awt.Color(0, 0, 153));
        contra.setText("Contraseña");
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 252, 228, 36));

        jcontrasena.setBackground(new java.awt.Color(153, 153, 153));
        jcontrasena.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jcontrasena.setForeground(new java.awt.Color(255, 255, 255));
        jcontrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontrasenaActionPerformed(evt);
            }
        });
        jcontrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcontrasenaKeyPressed(evt);
            }
        });
        getContentPane().add(jcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 252, 192, 36));

        ingresar.setBackground(new java.awt.Color(0, 0, 102));
        ingresar.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ingresarMouseMoved(evt);
            }
        });
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 336, 96, 36));

        minimizar.setBackground(new java.awt.Color(46, 51, 58));
        minimizar.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
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
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 0, 72, 36));

        cerrar.setBackground(new java.awt.Color(46, 51, 58));
        cerrar.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("X");
        cerrar.setBorder(null);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 0, 72, 36));

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
        getContentPane().add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 648, 36));

        ColorBarra.setBackground(new java.awt.Color(46, 51, 58));
        ColorBarra.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        ColorBarra.setForeground(new java.awt.Color(0, 0, 255));
        ColorBarra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ColorBarra.setText(" Login");
        ColorBarra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ColorBarra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ColorBarra.setOpaque(true);
        ColorBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ColorBarraMouseMoved(evt);
            }
        });
        getContentPane().add(ColorBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 768, 36));

        hora.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 153));
        hora.setText("hora");
        hora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)), "hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 14), new java.awt.Color(0, 0, 51))); // NOI18N
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 444, 204, 60));

        fecha.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 153));
        fecha.setText("fecha");
        fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)), "fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 504, 228, 36));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 336, 96, 36));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_371441.jpg"))); // NOI18N
        fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 51, 58), 3, true));
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondoMouseMoved(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 768, 552));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusuarioActionPerformed

    private void jcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcontrasenaActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        minimizar.setBackground(new Color(0, 102, 102));

    }//GEN-LAST:event_minimizarMouseClicked

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        String usuario = "admin";
        String contrasena = "123456";
        String usuarioA = jusuario.getText();
        String contrasenaA = jcontrasena.getText();
        if (usuario.equals(usuarioA) & contrasena.equals(contrasenaA)) {
            this.dispose();
            
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Ingresaste datos incorrectos, favor ingresalos nuevamente");
        }
    }//GEN-LAST:event_ingresarMouseClicked

    private void jcontrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcontrasenaKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            String usuario = "admin";
            String contrasena = "123456";
            String usuarioA = jusuario.getText();
            String contrasenaA = jcontrasena.getText();
            if (usuario.equals(usuarioA) & contrasena.equals(contrasenaA)) {
                this.dispose();
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ingresaste datos incorrectos, favor ingresalos nuevamente");
            }
        }
    }//GEN-LAST:event_jcontrasenaKeyPressed

    private void moverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseClicked
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseClicked

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed

    }//GEN-LAST:event_moverMousePressed

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = (punto.x - xA - 60);
        int y = (punto.y - yA - 10);
        this.setLocation(x, y);
    }//GEN-LAST:event_moverMouseDragged

    private void cerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseMoved
        cerrar.setBackground(Color.red);
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_cerrarMouseMoved

    private void fondoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseMoved
        cerrar.setBackground(new Color(46, 51, 58));
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_fondoMouseMoved

    private void minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseMoved
        minimizar.setBackground(new Color(32, 178, 170));
        cerrar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_minimizarMouseMoved

    private void moverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseEntered
        mover.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_moverMouseEntered

    private void moverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseExited
        mover.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_moverMouseExited

    private void ColorBarraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorBarraMouseMoved
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_ColorBarraMouseMoved

    private void moverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseMoved
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseMoved

    private void ingresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseMoved
 
    }//GEN-LAST:event_ingresarMouseMoved

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ColorBarra;
    private javax.swing.JLabel Texto;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel hora;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jcontrasena;
    private javax.swing.JTextField jusuario;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton mover;
    // End of variables declaration//GEN-END:variables
}