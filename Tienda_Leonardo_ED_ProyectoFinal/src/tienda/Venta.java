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
import java.util.ArrayList;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorios
 */
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int xA = this.getX();
    int yA = this.getY();
    public static ArrayList<producto> prodCobrar = new ArrayList<producto>();
    public static Cola cola = new Cola();
    public static Cola colaP = new Cola();
    
    public Venta() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date date = new Date();
        int dia = date.getDay();
        String nombreDia;
        if (dia == 0) {
            nombreDia = "Domingo";
        } else if (dia == 1) {
            nombreDia = "Lunes";
        } else if (dia == 2) {
            nombreDia = "Martes";
        } else if (dia == 3) {
            nombreDia = "Miercoles";
        } else if (dia == 4) {
            nombreDia = "Jueves";
        } else if (dia == 5) {
            nombreDia = "Viernes";
        } else {
            nombreDia = "Sabado";
        }
        String texto = nombreDia;
        texto = texto + "  " + String.valueOf(date.getDate()) + " / " + String.valueOf(date.getDay()) + " / "
                + String.valueOf((1900 + date.getYear()));
        fecha.setText(texto);
        Hora h = new Hora(hora);
        h.start();

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
        contra = new javax.swing.JLabel();
        minimizar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        mover = new javax.swing.JButton();
        ColorBarra = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jproducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTextArea();
        lfactura = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCobrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(450, 200, 50, 50));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        contra.setForeground(new java.awt.Color(0, 0, 153));
        contra.setText("producto");
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 180, 36));

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
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 0, 72, 36));

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
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 0, 72, 36));

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
        getContentPane().add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 696, 36));

        ColorBarra.setBackground(new java.awt.Color(46, 51, 58));
        ColorBarra.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        ColorBarra.setForeground(new java.awt.Color(0, 0, 255));
        ColorBarra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ColorBarra.setText("Venta");
        ColorBarra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ColorBarra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ColorBarra.setOpaque(true);
        ColorBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ColorBarraMouseMoved(evt);
            }
        });
        getContentPane().add(ColorBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 36));

        hora.setFont(new java.awt.Font("Dialog", 1, 44)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 153));
        hora.setText("hora");
        hora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)), "hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 14), new java.awt.Color(0, 0, 51))); // NOI18N
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 444, 204, 60));

        fecha.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 153));
        fecha.setText("fecha");
        fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)), "fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 12), new java.awt.Color(0, 0, 51))); // NOI18N
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 504, 228, 36));

        jproducto.setBackground(new java.awt.Color(102, 102, 102));
        jproducto.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jproducto.setForeground(new java.awt.Color(0, 0, 204));
        jproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jproductoActionPerformed(evt);
            }
        });
        getContentPane().add(jproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 96, 144, 36));

        factura.setEditable(false);
        factura.setBackground(new java.awt.Color(0, 40, 78));
        factura.setColumns(20);
        factura.setForeground(new java.awt.Color(255, 255, 255));
        factura.setRows(5);
        factura.setBorder(null);
        jScrollPane1.setViewportView(factura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 72, 408, 348));

        lfactura.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        lfactura.setForeground(new java.awt.Color(0, 0, 51));
        lfactura.setText("factura proforma:");
        getContentPane().add(lfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 48, 144, 24));

        precio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        precio.setForeground(new java.awt.Color(153, 0, 51));
        precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio.setText("0");
        precio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        precio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "precio del producto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Ebrima", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 192, 144, 48));

        buscar.setBackground(new java.awt.Color(204, 204, 204));
        buscar.setForeground(new java.awt.Color(0, 0, 102));
        buscar.setText("buscar");
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 2));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 144, 60, 24));

        agregar.setBackground(new java.awt.Color(0, 165, 132));
        agregar.setForeground(new java.awt.Color(0, 0, 51));
        agregar.setText("agregar");
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 312, -1, 24));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 252, 144, 24));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 72, 140));
        jLabel1.setText("nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 48, 12));

        jCobrar.setBackground(new java.awt.Color(0, 159, 130));
        jCobrar.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jCobrar.setText("cobrar");
        jCobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCobrarMouseClicked(evt);
            }
        });
        getContentPane().add(jCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 432, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 48, 72, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orig_371441.jpg"))); // NOI18N
        fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(46, 51, 58), 3, true));
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondoMouseMoved(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 552));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        minimizar.setBackground(new Color(0, 102, 102));

    }//GEN-LAST:event_minimizarMouseClicked

    private void moverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseClicked
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseClicked

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed

    }//GEN-LAST:event_moverMousePressed

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = (punto.x - xA);
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

    private void jproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jproductoActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        String nombreP=jproducto.getText();
        String texto= factura.getText();
        String texto2="";
        int contador=factura.getLineCount();
        for (producto producto : Login.productos) {
            if (nombreP.equalsIgnoreCase(producto.nombre)) {
                texto=String.valueOf(producto.precio);
                texto2= producto.descripcion;
            }
        }
        precio.setText(texto);
        jLabel2.setText(texto2);
    }//GEN-LAST:event_buscarMouseClicked

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarActionPerformed

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        String nombreP = jproducto.getText();
        String texto = factura.getText();
        int contador = factura.getLineCount();
        for (producto producto : Login.productos) {
            if (nombreP.equalsIgnoreCase(producto.nombre)) {
                texto += contador + producto.toString() + "\n";
                cola.insertar( contador, producto.nombre);
                colaP.insertarP(contador, producto.precio);
                contador++;
            }
        }
        factura.setText(texto);
    }//GEN-LAST:event_agregarMouseClicked

    private void jCobrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCobrarMouseClicked
        this.dispose();
        Cobro ventana = new Cobro();
        ventana.setVisible(true);
    }//GEN-LAST:event_jCobrarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ColorBarra;
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel contra;
    private javax.swing.JTextArea factura;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCobrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jproducto;
    private javax.swing.JLabel lfactura;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton mover;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
