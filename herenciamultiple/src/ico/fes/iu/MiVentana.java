/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author AXEL
 */
public class MiVentana extends JFrame implements WindowListener{

    public MiVentana() throws HeadlessException {
        super("Mi ventana");
        setSize(600, 400);
        setVisible(true);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana...");
    }

    @Override
    public void windowClosed(WindowEvent we) {
 
    }

    @Override
    public void windowIconified(WindowEvent we) {
   
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    
    }

    @Override
    public void windowActivated(WindowEvent we) {
    
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    
    }
    
    
}
