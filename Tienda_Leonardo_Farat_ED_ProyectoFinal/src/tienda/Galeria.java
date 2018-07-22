/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import javax.imageio.ImageIO;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

/**
 *
 * @author lbren
 */
public class Galeria extends javax.swing.JFrame {

    ListaCircular productos = new ListaCircular();
    Pila pilaNuevoProd = new Pila();
    int pos = 0;

    /**
     * Creates new form Galeria
     */
    int xA = this.getX();
    int yA = this.getY();

    int contD = 0;
    int contP = 0;
    int contN = 0;

    public Galeria() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            String linea;
            int contador = 1;
            BufferedReader br = new BufferedReader(new FileReader("./Imagenes.txt"));
            linea = br.readLine();
            while (linea != null) {
                productos.insertarUltimo(contador, new ImageIcon(getClass().getResource("/imagenes/" + linea)));
                contador++;
                linea = br.readLine();
            }
            pos = 1;
            imagen.setIcon(productos.DevuelveFoto(pos));
        } catch (IOException ex) {
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

        cerrar = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        mover = new javax.swing.JButton();
        ColorBarra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPrecio = new javax.swing.JTextField();
        jAnterior = new javax.swing.JButton();
        jsiguiente = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1116, 0, 72, 30));

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
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 0, 72, 30));

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
        getContentPane().add(mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1044, 30));

        ColorBarra.setBackground(new java.awt.Color(46, 51, 58));
        ColorBarra.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        ColorBarra.setForeground(new java.awt.Color(0, 0, 255));
        ColorBarra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ColorBarra.setText("Galeria");
        ColorBarra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ColorBarra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ColorBarra.setOpaque(true);
        ColorBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ColorBarraMouseMoved(evt);
            }
        });
        getContentPane().add(ColorBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1188, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Agregar Nuevo Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 240, 276, 36));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Agregar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 716, 144, 36));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Precio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 384, 60, 25));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Descripcion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 468, 108, 25));

        jTextArea1.setBackground(new java.awt.Color(66, 74, 100));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(127, 153, 209));
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(2);
        jTextArea1.setText("ej. refresco familiar");
        jTextArea1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51))));
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 504, 252, 144));

        jPrecio.setBackground(new java.awt.Color(66, 74, 100));
        jPrecio.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jPrecio.setForeground(new java.awt.Color(127, 153, 209));
        jPrecio.setText("ej. 1850");
        jPrecio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51))));
        jPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPrecioMouseClicked(evt);
            }
        });
        jPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 384, 120, 24));

        jAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jAnterior.setBorderPainted(false);
        jAnterior.setContentAreaFilled(false);
        jAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAnteriorMouseClicked(evt);
            }
        });
        jAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnteriorActionPerformed(evt);
            }
        });
        jAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAnteriorKeyPressed(evt);
            }
        });
        getContentPane().add(jAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 96, 400, 696));

        jsiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jsiguiente.setBorderPainted(false);
        jsiguiente.setContentAreaFilled(false);
        jsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsiguienteMouseClicked(evt);
            }
        });
        jsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsiguienteActionPerformed(evt);
            }
        });
        jsiguiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jsiguienteKeyPressed(evt);
            }
        });
        getContentPane().add(jsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 96, 400, 696));

        imagen.setBackground(new java.awt.Color(102, 102, 102));
        imagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imagenKeyPressed(evt);
            }
        });
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 144, 840, 600));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 48, 72, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 96, 864, 696));

        jNombre.setBackground(new java.awt.Color(66, 74, 100));
        jNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jNombre.setForeground(new java.awt.Color(127, 153, 209));
        jNombre.setText("ej. CocaCola");
        jNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51))));
        jNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNombreMouseClicked(evt);
            }
        });
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 312, 120, 24));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 312, 72, 25));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bcf3845b-1834-4ad6-a8d5-535919c8f706image6.png"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 51, 58), 3));
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondoMouseMoved(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1188, 804));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsiguienteMouseClicked
        if (productos.cantidad() <= pos) {
            pos = 1;
        } else {
            pos++;
        }
        imagen.setIcon(productos.DevuelveFoto(pos));
    }//GEN-LAST:event_jsiguienteMouseClicked

    private void jAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAnteriorMouseClicked
        if (1 >= pos) {
            pos = productos.cantidad();
        } else {
            pos--;
        }
        imagen.setIcon(productos.DevuelveFoto(pos));
    }//GEN-LAST:event_jAnteriorMouseClicked

    private void imagenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imagenKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            if (productos.cantidad() <= pos) {
                pos = 1;
            } else {
                pos++;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        } else if (key == KeyEvent.VK_LEFT) {
            if (1 >= pos) {
                pos = productos.cantidad();
            } else {
                pos--;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        }
    }//GEN-LAST:event_imagenKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            if (productos.cantidad() <= pos) {
                pos = 1;
            } else {
                pos++;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        } else if (key == KeyEvent.VK_LEFT) {
            if (1 >= pos) {
                pos = productos.cantidad();
            } else {
                pos--;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        }
    }//GEN-LAST:event_formKeyPressed

    private void jsiguienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsiguienteKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            if (productos.cantidad() <= pos) {
                pos = 1;
            } else {
                pos++;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        } else if (key == KeyEvent.VK_LEFT) {
            if (1 >= pos) {
                pos = productos.cantidad();
            } else {
                pos--;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        }
    }//GEN-LAST:event_jsiguienteKeyPressed

    private void jAnteriorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAnteriorKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) {
            if (productos.cantidad() <= pos) {
                pos = 1;
            } else {
                pos++;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        } else if (key == KeyEvent.VK_LEFT) {
            if (1 >= pos) {
                pos = productos.cantidad();
            } else {
                pos--;
            }
            imagen.setIcon(productos.DevuelveFoto(pos));
        }
    }//GEN-LAST:event_jAnteriorKeyPressed

    private void jAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnteriorActionPerformed

    private void ColorBarraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColorBarraMouseMoved
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_ColorBarraMouseMoved

    private void moverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseDragged
        Point punto = MouseInfo.getPointerInfo().getLocation();
        int x = (punto.x - xA - 50);
        int y = (punto.y - yA - 10);
        this.setLocation(x, y);
    }//GEN-LAST:event_moverMouseDragged

    private void moverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseMoved
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseMoved

    private void moverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseClicked
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_moverMouseClicked

    private void moverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseEntered
        mover.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_moverMouseEntered

    private void moverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMouseExited
        mover.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_moverMouseExited

    private void moverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverMousePressed

    }//GEN-LAST:event_moverMousePressed

    private void cerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseMoved
        cerrar.setBackground(Color.red);
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_cerrarMouseMoved

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseMoved
        minimizar.setBackground(new Color(32, 178, 170));
        cerrar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_minimizarMouseMoved

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        minimizar.setBackground(new Color(0, 102, 102));

    }//GEN-LAST:event_minimizarMouseClicked

    private void jsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsiguienteActionPerformed

    private void fondoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseMoved
        cerrar.setBackground(new Color(46, 51, 58));
        minimizar.setBackground(new Color(46, 51, 58));
    }//GEN-LAST:event_fondoMouseMoved

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNombreMouseClicked
        if (contN == 0) {
            jNombre.setText("");
            contN++;
        }
        jNombre.setForeground(new Color(215, 215, 225));
        jNombre.setBackground(new Color(10, 10, 40));
    }//GEN-LAST:event_jNombreMouseClicked

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrecioMouseClicked
        if (contP == 0) {
            jPrecio.setText("");
            contP++;
        }
        jPrecio.setForeground(new Color(215, 215, 225));
        jPrecio.setBackground(new Color(10, 10, 40));
    }//GEN-LAST:event_jPrecioMouseClicked

    private void jPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        if (contD == 0) {
            jTextArea1.setText("");
            contD++;
        }
        jTextArea1.setForeground(new Color(215, 215, 225));
        jTextArea1.setBackground(new Color(10, 10, 40));
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try{
            boolean boo = false;
        if (jNombre.getText().equals("")) {
            jNombre.setBackground(new Color(150, 45, 50));
            jNombre.setForeground(new Color(225, 222, 222));
            boo = true;
        }
        if (jPrecio.getText().equals("")) {
            jPrecio.setBackground(new Color(150, 45, 50));
            jPrecio.setForeground(new Color(225, 222, 222));
            boo = true;
        }
        if (jTextArea1.getText().equals("")) {
            jTextArea1.setBackground(new Color(150, 45, 50));
            jTextArea1.setForeground(new Color(225, 222, 222));
            boo = true;
        }
        for (producto producto : Login.productos) {
            if (producto.nombre.equals(jNombre.getText())) {
                boo = true;
                JOptionPane.showMessageDialog(null, "El producto ya existe");
                jNombre.setBackground(new Color(150, 45, 50));
                jNombre.setForeground(new Color(225, 222, 222));
            }
        }
        if (!boo) {
            
            pilaNuevoProd.insertar(jTextArea1.getText());
            pilaNuevoProd.insertar(String.valueOf(Login.productos.size() + 1));
            pilaNuevoProd.insertar(jPrecio.getText());
            pilaNuevoProd.insertar(jNombre.getText());
            Login.productos.add(new producto(pilaNuevoProd.extraer(), Integer.parseInt(pilaNuevoProd.extraer()), Integer.parseInt(pilaNuevoProd.extraer()), pilaNuevoProd.extraer()));
            
        }
        
        if (boo) {
            JOptionPane.showMessageDialog(null, "Favor revisar las casillas en rojo!\nDe otra forma, no se\nprocedera con la accion");
        } else {
            JOptionPane.showMessageDialog(null, "Favor selecciona una imagen con formato\n   jpg, png o incluso gif");
            Icon imagen;
            JFileChooser jfc = new JFileChooser(System.getProperty("./Imaenes"));
            String nombre;

            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG PNG GIF Images", "jpg", "png");
            jfc.showOpenDialog(Galeria.this);
            jfc.setFileFilter(filter);
            nombre = jfc.getCurrentDirectory() + "/" + jfc.getSelectedFile().getName();
            imagen = new ImageIcon(nombre);
            productos.insertarUltimo((productos.cantidad() + 1), imagen);

            BufferedImage imagenAlmacenar = new BufferedImage(imagen.getIconWidth(), imagen.getIconHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics g = imagenAlmacenar.createGraphics();
            ImageObserver io = null;
            g.drawImage(imagenAlmacenar, imagenAlmacenar.getWidth(), imagenAlmacenar.getHeight(), cerrar);
            File file = new File("./build/classes/imagenes/" + jfc.getSelectedFile().getName());

            try {
                ImageIO.write(imagenAlmacenar, "JPG", file);
            } catch (IOException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "No ingresaste una fotografia o una con el formato erroneo");
            }
        }
    } catch(NumberFormatException | NullPointerException  e){
                JOptionPane.showMessageDialog(null,"Los datos ingresados son erroneos, favor verificarlos");
            }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Galeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ColorBarra;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jAnterior;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jsiguiente;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton mover;
    // End of variables declaration//GEN-END:variables
}
