/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import static java.lang.Thread.sleep;


public class Hora extends Thread{
    
    private JLabel hora;

    public Hora(JLabel hora) {

        this.hora = hora;
    }

    Hora(Hora hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {

        while (true) {

            Date hoy = new Date();
            SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(hoy));

            try {
                sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
